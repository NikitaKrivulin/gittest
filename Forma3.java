import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
 
public class Forma3 extends JFrame {
 
    public Forma3() {
    	super("Лодочные аксессуары - Меню администратора");
    	setBounds(0, 0, 650, 600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        panelMain.setLayout(new BoxLayout(panelMain,BoxLayout.Y_AXIS));
        panelMain.setBackground(Color.WHITE);
        panelMain.add(panelUp);
        panelMain.add(panelMid);
        panelMain.add(panelDown);
        setResizable(false);

        n.setBackground(new Color(245, 245, 245));
        n.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        n.setSize(300, 30);
        n.setLocation(200, 20);
        
        btn1.setFocusPainted(false);
        btn1.setBackground(new Color(245, 245, 245));
        btn1.setFont(new Font("Arial", Font.PLAIN, 17));
        btn1.setSize(280, 70);
        btn1.setLocation(185, 100);
        
        logout.setFocusPainted(false);
        logout.setBackground(new Color(245, 245, 245));
        logout.setFont(new Font("Arial", Font.PLAIN, 14));
        logout.setSize(80, 35);
        logout.setLocation(510, 351);
        
        Uppertext.setFont(new Font("Arial", Font.PLAIN, 30));
        Uppertext.setForeground(Color.WHITE);
        
        panelUp.setLayout(new GridBagLayout());
        GridBagConstraints constraitHead= new GridBagConstraints();
        
        constraitHead.gridx = 0;
        panelUp.add(Uppertext);
        panelUp.setMaximumSize(new Dimension(2000,200));
        panelUp.setBackground(new Color(77,77,77));
        panelMid.setLayout(null);
        
        backbtn.setFocusPainted(false);
        backbtn.setBackground(new Color(245, 245, 245));
        backbtn.setFont(new Font("Arial", Font.PLAIN, 14));
        backbtn.setLayout(new GridBagLayout());
        panelUp.add(Uppertext);       
        
        GridBagConstraints constraitbackbtn = new GridBagConstraints();
        constraitbackbtn.gridx = 0;
        constraitbackbtn.gridy = 1;
        constraitbackbtn.ipady = 5;
        
        panelMid.add(btn1);
        panelMid.add(n);
        panelMid.add(logout);
        panelUp.add(backbtn,constraitbackbtn);
        panelMid.setBackground(Color.WHITE);
        panelMid.setMaximumSize(new Dimension(2000,1500));
        
        panelDown.setLayout(new GridBagLayout());
        panelDown.setMaximumSize(new Dimension(2000,200));
        panelDown.setBackground(new Color(77, 77, 77));
               
        setContentPane(panelMain);   
    }
        /*backbtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
		     backbtnActionPerformed();
			}
            });
        
        btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
		     btn1ActionPerformed();
			}
            });  
    }
    
    private void backbtnActionPerformed() {                                         
        this.dispose();
        new Forma14().setVisible(true);
    }
    
    private void btn1ActionPerformed() {                                         
        this.dispose();
        new Forma18().setVisible(true);
    }*/
   
    
    public static Date deadline;
    public static JLabel n = new JLabel ("Меню администратора");
    public static JButton btn1 = new JButton("Пользователи");
 
    public static JButton backbtn = new JButton("Назад");
    public static JButton logout = new JButton("Logout");
    public static JLabel Uppertext = new JLabel("Лодочные аксессуары");
    public static JPanel panelMain = new JPanel();
    public static JPanel panelDown = new JPanel();
    public static JPanel panelUp = new JPanel();
    public static JPanel panelMid = new JPanel();
    public static void createTimer(JPanel panel)
	{
		JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setForeground(Color.WHITE);
		panel.add(label);
		ActionListener tick = new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				Date curDate =new Date();
				long res = deadline.getTime() - curDate.getTime();
				long days = res / (1000 * 60 * 60* 24);
				long hours = (res - days*(1000 * 60 * 60* 24))/(1000 * 60 * 60);
				long minutes = (res - days*(1000 * 60 * 60* 24) - hours*(1000 * 60 * 60))/(1000*60);	
				label.setText(days + " days, "+ hours + " hours, " + minutes + " minutes");
			}
		};
		Timer timer = new Timer(1000,tick);
		timer.start();
	}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() 
            {
                Forma3 mf = new Forma3();
                mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
                mf.setVisible(true);
                String endDate = "30.06.2018 10:00:00";
        		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        		try{
        			deadline = format.parse(endDate);
        		} catch (ParseException e) {
        			e.printStackTrace();
        		}
        		
        		createTimer(panelDown);
                
            }
            
        });
    }
}

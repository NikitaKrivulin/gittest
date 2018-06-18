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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
public class Forma2 extends JFrame {
	 
    public Forma2() {
    	super("Лодочные аксессуары - Выбор регистрации или просмотра");
    	setBounds(0, 0, 650, 600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        panelMain.setLayout(new BoxLayout(panelMain,BoxLayout.Y_AXIS));
        panelMain.setBackground(Color.WHITE);
        panelMain.add(panelUp);
        panelMain.add(panelMid);
        panelMain.add(panelDown);
        setResizable(false);
        
        btn1.setFocusPainted(false);
        btn1.setBackground(new Color(245, 245, 245));
        btn1.setFont(new Font("Arial", Font.PLAIN, 17));
        btn1.setSize(280, 70);
        btn1.setLocation(185, 100);
        
        btn2.setFocusPainted(false);
        btn2.setBackground(new Color(245, 245, 245));
        btn2.setFont(new Font("Arial", Font.PLAIN, 17));
        btn2.setSize(280, 70);
        btn2.setLocation(185, 190);
        
        
        
        Uppertext.setFont(new Font("Arial", Font.PLAIN, 30));
        Uppertext.setForeground(Color.WHITE);
        
        panelUp.setLayout(new GridBagLayout());
        GridBagConstraints constraitHead= new GridBagConstraints();
        
        constraitHead.gridx = 0;
        panelUp.add(Uppertext);
        panelUp.setMaximumSize(new Dimension(2000,200));
        panelUp.setBackground(new Color(77,77,77));
        panelMid.setLayout(null);
          
        
        GridBagConstraints constraitbackbtn = new GridBagConstraints();
        constraitbackbtn.gridx = 0;
        constraitbackbtn.gridy = 1;
        constraitbackbtn.ipady = 5;
        
        panelMid.add(btn1);
        panelMid.add(btn2);
        panelMid.setBackground(Color.WHITE);
        panelMid.setMaximumSize(new Dimension(2000,1500));
        
        panelDown.setLayout(new GridBagLayout());
        panelDown.setMaximumSize(new Dimension(2000,200));
        panelDown.setBackground(new Color(77, 77, 77));
               
        setContentPane(panelMain);   
        
       
        
        btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				btn1ActionPerformed();
				}
			});
        
        
        
      
        }
    
    private void btn1ActionPerformed() {                                         
        this.dispose();
        new Forma1().setVisible(true);
    }
    
    
    
    public static Date deadline;
    public static JFrame form2;
    public static JButton btn1 = new JButton("Авторизация");
    public static JButton btn2 = new JButton("Просмотр меню");
 
    
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
            	form2=new Forma2();
        		form2.setVisible(true);
                //Forma2 mf1 = new Forma2();
                //mf1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                //mf1.setVisible(true);
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


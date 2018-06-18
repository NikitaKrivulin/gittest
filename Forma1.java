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
 
public class Forma1 extends JFrame {
	
    public Forma1() {
    	super("Лодочные аксессуары  - Login");
    	setBounds(0, 0, 650, 600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        panelMain.setLayout(new BoxLayout(panelMain,BoxLayout.Y_AXIS));
        panelMain.setBackground(Color.WHITE);
        panelMain.add(panelUp);
        panelMain.add(panelMid);
        panelMain.add(panelDown);
        setResizable(false);
        
        m.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        s.setFont(new Font("Arial", Font.PLAIN, 13));
        a.setFont(new Font("Arial", Font.PLAIN, 16));

        btn1.setFocusPainted(false);
        btn1.setBackground(new Color(245, 245, 245));
        btn1.setFont(new Font("Arial", Font.PLAIN, 13));
        btn1.setSize(80, 30);
        btn1.setLocation(235, 220);
        
        h.setFocusPainted(false);
        h.setBackground(new Color(245, 245, 245));
        h.setFont(new Font("Arial", Font.PLAIN, 13));
        h.setSize(80, 30);
        h.setLocation(330, 220);
        
        
        n.setBackground(new Color(245, 245, 245));
        n.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        n.setSize(300, 30);
        n.setLocation(220, 20);
        
        m.setBackground(new Color(245, 245, 245));
        m.setFont(new Font("Arial", Font.PLAIN, 15));
        m.setSize(600, 30);
        m.setLocation(33, 70);
        
        q.setBackground(new Color(245, 245, 245));
        q.setFont(new Font("Arial", Font.PLAIN, 15));
        q.setSize(600, 30);
        q.setLocation(292, 90);
        
        a.setBackground(new Color(245, 245, 245));
        a.setFont(new Font("Arial", Font.PLAIN, 15));
        a.setSize(80, 30);
        a.setLocation(180, 130);
        
        s.setBackground(new Color(245, 245, 245));
        s.setFont(new Font("Arial", Font.PLAIN, 12));
        s.setSize(280, 30);
        s.setLocation(235, 130);
        
        b.setBackground(new Color(245, 245, 245));
        b.setFont(new Font("Arial", Font.PLAIN, 15));
        b.setSize(80, 30);
        b.setLocation(151, 175);
        
        c.setBackground(new Color(245, 245, 245));
        c.setFont(new Font("Arial", Font.PLAIN, 12));
        c.setSize(280, 30);
        c.setLocation(235, 175);  
        
        Uppertext.setFont(new Font("Arial", Font.PLAIN, 30));
        Uppertext.setForeground(Color.WHITE);
        
        panelUp.setLayout(new GridBagLayout());
        GridBagConstraints constraitHead= new GridBagConstraints();
        
        constraitHead.gridx = 0;
        panelUp.add(Uppertext);
        panelUp.setMaximumSize(new Dimension(2000,200));
        panelUp.setBackground(new Color(77,77,77));
        panelMid.setLayout(null);
        
        backbtn1.setFocusPainted(false);
        backbtn1.setBackground(new Color(245, 245, 245));
        backbtn1.setFont(new Font("Arial", Font.PLAIN, 14));
        backbtn1.setLayout(new GridBagLayout());
        panelUp.add(Uppertext);       
        
        
        GridBagConstraints constraitbackbtn1 = new GridBagConstraints();
        constraitbackbtn1.gridx = 0;
        constraitbackbtn1.gridy = 1;
        constraitbackbtn1.ipady = 5;
        
        
        panelMid.add(btn1);
        panelMid.add(n);
        panelMid.add(m);
        panelMid.add(s);
        panelMid.add(h);
        panelMid.add(q);
        panelMid.add(c);
        panelMid.add(a);
        panelMid.add(b);
        panelUp.add(backbtn1,constraitbackbtn1);
        panelMid.setBackground(Color.WHITE);
        panelMid.setMaximumSize(new Dimension(2000,1500));
        
        panelDown.setLayout(new GridBagLayout());
        panelDown.setMaximumSize(new Dimension(2000,200));
        panelDown.setBackground(new Color(77, 77, 77));
               
        setContentPane(panelMain); 
    
   
        backbtn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
		     backbtn1ActionPerformed();
 }

     });
    }
    
    private void backbtn1ActionPerformed() {                                         
        this.dispose();
        new Forma2().setVisible(true);
}
        
        /*backbtn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
		     backbtn2ActionPerformed();
 }

     });
        btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		     btn1ActionPerformed();
 }

     });
        
        h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		     hActionPerformed();
 }
     });
    }
    
  
    
    private void backbtn2ActionPerformed() {                                         
        this.dispose();
        new Forma14().setVisible(true);
}
    
    
    private void btn1ActionPerformed() {  
    	String l = s.getText();
    	String z = c.getText();
    	String email = new String(l);
    	String pass = new String(z);
    	if (email.equals("") || pass.equals("")) {
    		JOptionPane.showMessageDialog(rootPane, "Вы не ввели Email или пароль, пожалуйста, повторите ввод");
    	} else {
    		this.dispose();
            new Forma8().setVisible(true);
}
    }
    
    private void hActionPerformed() {                                         
        this.dispose();
        new Forma1().setVisible(true);
}*/
    public static Date deadline;
    public static JFrame form3;
    public static JButton btn1 = new JButton("Login");
    public static JLabel n = new JLabel ("Форма авторизации");
    public static JLabel m = new JLabel ("Пожалуйста, авторизируйтесь в системе, используя ваш адрес электронной почты");
    public static JLabel q = new JLabel ("и пароль.");
    public static JLabel a = new JLabel ("Email:");
    public static JLabel b = new JLabel ("Password:");
    public static JButton h = new JButton ("Cancel");
 
    public static JTextField s = new JTextField ("");
    public static JTextField c = new JTextField ("");
    public static JButton backbtn1 = new JButton("Назад");
    public static JLabel Uppertext = new JLabel("Лодочные аксессуары");
    public static JPanel panelMain = new JPanel();
    public static JPanel panelDown = new JPanel();
    public static JPanel panelUp = new JPanel();
    public static JPanel panelMid = new JPanel();
	protected static Object mf1;
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
            	form3=new Forma1();
        		form3.setVisible(true);
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

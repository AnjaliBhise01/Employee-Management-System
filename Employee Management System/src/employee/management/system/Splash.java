
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Splash extends JFrame implements ActionListener {
    
    
    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading =new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 =il.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
clickhere.setBounds(400, 400, 300, 70);
clickhere.setBackground(new Color(30, 144, 255)); 
clickhere.setForeground(Color.WHITE);
clickhere.setFont(new Font("Tahoma", Font.BOLD, 18));
clickhere.setFocusPainted(false); 
clickhere.setBorder(BorderFactory.createEmptyBorder()); 
clickhere.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
clickhere.addActionListener(this);


clickhere.addMouseListener(new MouseAdapter() {
    public void mouseEntered(MouseEvent e) {
        clickhere.setBackground(new Color(0, 120, 215)); 
    }
    public void mouseExited(MouseEvent e) {
        clickhere.setBackground(new Color(30, 144, 255)); 
    }
});

image.add(clickhere);

        setSize(1170,650);
        setLocation(200,50);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
        
    }
    public static void main(String args[]){
        new Splash();
    }
    
}

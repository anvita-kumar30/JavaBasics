//package test;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//class Ace implements ActionListener{
//    JButton button, button1;
//    JLabel label;
//    JTextField t1, t2;
//    JPasswordField t3;
//    Ace(){
//        JFrame frame = new JFrame("Register Here");
//        frame.setSize(500, 400);
//        Color bg= new Color (51,204,255);
//        frame.getContentPane().setBackground(bg);
//        Color lightRed = new Color(204,0,0);
//        Color Green = new Color(0,204,0);
//        button = new JButton("Submit");
//        button1 = new JButton("Cancel");
//        label = new JLabel("Press Submit To Save");
//        String c[]={"India","America","UK", "Japan"};
//        JLabel lc = new JLabel("Select Region");
//        lc.setBounds (50, 200, 100, 30);
//        frame.add(lc);
//        JComboBox country = new JComboBox(c);
//        country.setBounds (150, 200, 150, 30);
//        frame.add(country);
//        JLabel 11 = new JLabel("Name");
//        t1= new JTextField("");
//        11.setBounds (50, 50, 50, 30);
//        t1.setBounds (150, 50, 180, 30);
//        frame.add(11);
//        frame.add(t1);
//        JLabel 12 = new JLabel("Email");
//        t2 = new JTextField("");
//        t2.setBounds (50, 100, 50, 30);
//        t2.setBounds(150, 100, 180, 30);
//        frame.add(12); frame.add(t2);
//        JLabel 13 = new JLabel("Password");
//        t3 = new JPasswordField("");
//        t3.setEchoChar('*');
//        13.setBounds (50, 150, 75, 30);
//        t3.setBounds(150, 150, 180, 30);
//        frame.add(13);
//        frame.add(t3);
//        button.setBounds (150,275,80,30);
//        button1.setBounds (250, 275,80,30);
//        button.addActionListener(this);
//        button1.addActionListener(this);
//        button.setBackground (Green);
//        button.setForeground (Color.BLACK);
//        button1.setBackground (lightRed);
//        button1.setForeground (Color.BLACK);
//        frame.add(button);
//        frame.add(button1);
//        label.setBounds (175, 325, 150, 30);
//        frame.add(label);
//        frame.setDefaultCloseOperation (JFrame.EXIT_O frame.setLocationRelativeTo(null);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//    public void actionPerformed (ActionEvent e) {
//        t1.setText("");
//        t2.setText("");
//        t3.setText("");
//        if(e.getSource() == button)
//            label.setText("Details saved!!");
//        else if(e.getSource() == button1)
//            label.setText("Details not saved!!");
//    }
//    public class Gui {
//        public static void main(String arg[]) {
//            Ace ac = new Ace();
//        }
//    }
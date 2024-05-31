package core;
import javax.swing.*;
import admin.turf_info;
import java.awt.*;
import java.awt.event.*;

public class Dashboard  {
    private String yname;
    private JFrame f;
    private JButton dark_mode, back;
    private JLabel name, enter, pass, title;
    private JTextField name_field;
    private JPasswordField pass_field;

    public Dashboard(){
        f = new JFrame();
       // String turfname = admin.getTurfname();

        Color mycolor = new Color(192, 192, 192);
        dark_mode = new JButton("Dark mode");
        dark_mode.setBounds(550, 200, 100, 40);
        Font font1 = new Font("serif", Font.BOLD, 15);
        Font font2 = new Font("serif", Font.BOLD, 35);

        title = new JLabel("DashBoard");
        title.setBounds(250, 60, 180, 30);
        title.setFont(font2);
        f.add(title);

        name = new JLabel("djsds[dsjdss]");
        name.setBounds(255, 180, 180, 30);
        name.setFont(font1);
        name.setBackground(mycolor);

        name_field = new JTextField();
        name_field.setBounds(400, 180, 160, 30);

        pass = new JLabel("PASSWORD ");
        pass.setBounds(260, 250, 100, 30);
        pass.setBackground(mycolor);
        pass.setFont(font1);

        pass_field = new JPasswordField();
        pass_field.setBounds(400, 250, 160, 30);
//
   //    enter = new JLabel("Enter" + getTurfname());
        enter.setBounds(356, 360, 80, 30);
        f.add(enter);

        back = new JButton("Back");
        back.setBounds(600, 530, 80, 30);
        f.add(back);

        f.setSize(700, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(mycolor);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Homepage();
                f.setVisible(false);
            }
        });
    }

    public void login() {
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
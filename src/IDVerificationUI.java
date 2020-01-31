import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class IDVerificationUI extends JFrame {

    JFrame idVerification;
    JLabel title;
    JTextField idField;
    JPasswordField passwordField;
    JLabel idLabel;
    JLabel passwordLabel;
    JButton loginbtn;



    IDVerificationUI(){
        idVerification=new JFrame("Stadtplan-Goslar");




        title=new JLabel("ID-Verifikation");
        title.setBounds(180,20,450,300);
        title.setVerticalAlignment(JLabel.TOP);
        title.setFont(new Font("Verdana", Font.PLAIN, 25));
        title.setPreferredSize(new Dimension(250, 100));
        title.setForeground(Color.blue);




        idLabel=new JLabel("ID-Nummer");
        idLabel.setBounds(50,70,250,50);
        idField=new JTextField();
        idField.setBounds(150,80,250,30);

        passwordLabel=new JLabel("Passwort");
        passwordLabel.setBounds(50,120,250,50);;
        passwordField=new JPasswordField();
        passwordField.setBounds(150,130,250,30);

        loginbtn=new JButton("Einloggen");
        loginbtn.setBounds(240,270,100,30);


        idVerification.add(title);
        idVerification.add(idLabel);
        idVerification.add(idField);
        idVerification.add(passwordLabel);
        idVerification.add(passwordField);
        idVerification.add(loginbtn);


        ReportAccidentUI reportaccidentui = new ReportAccidentUI();
        loginbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                reportaccidentui.reportAccident.setVisible(true);
                idVerification.dispose();
            }
        });


        idVerification.setSize(600,400);//600 width and 400 height
        idVerification.setLayout(null);
        idVerification.setVisible(true);
    }
    public static void main(String[] args) {
        new IDVerificationUI();

    }


}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;



public class WelcomeFrame extends JFrame {

    JFrame welcomeFrame;
    JLabel welcomeLabel;
    JButton showStreetNetworkbtn;
    JButton reportAccidentbtn;
    JLabel first_label;
    JPanel panel;


    WelcomeFrame(){
        welcomeFrame=new JFrame("Stadtplan-Goslar ");

        welcomeLabel = new JLabel("Willkommen zum Stadtplan-Goslar");
        welcomeLabel.setBounds(80,10,450,300);
        welcomeLabel.setVerticalAlignment(JLabel.TOP);
        welcomeLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
        welcomeLabel.setPreferredSize(new Dimension(250, 100));
        welcomeLabel.setForeground(Color.blue);


        showStreetNetworkbtn = new JButton("Straßennetz Anzeigen");
        showStreetNetworkbtn.setBounds(20,120,100, 40);//x axis, y axis, width, height
        showStreetNetworkbtn.setSize(200, 50);

        reportAccidentbtn = new JButton("Unfall Melden");
        reportAccidentbtn.setBounds(20,180,100, 40);
        reportAccidentbtn.setSize(200, 50);


        ImageIcon ii = new ImageIcon("D:\\uni\\WS 2019-20\\Softwaretechnik\\StadtplanUI\\src\\136.jpg");
        first_label= new JLabel(ii);



        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600,900));
        panel.add(first_label);
        panel.setVisible(true);
        panel.setSize(200, 200);
        panel.setBounds(350, 80, 200, 200);





        //linking JFrames
        IDVerificationUI idverificationui = new IDVerificationUI();
        reportAccidentbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                idverificationui.idVerification.setVisible(true);
                welcomeFrame.dispose();
            }
        });



        welcomeFrame.add(showStreetNetworkbtn);
        welcomeFrame.add(reportAccidentbtn);
        welcomeFrame.add(welcomeLabel);



        welcomeFrame.setSize(600,400);//600 width and 400 height
        welcomeFrame.setLayout(null);
        welcomeFrame.setVisible(true);
        welcomeFrame.getContentPane().add(panel);

    }
    public static void main(String[] args) {

        new WelcomeFrame();

    }
}
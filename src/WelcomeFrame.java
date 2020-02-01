
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class WelcomeFrame extends JFrame {

    WelcomeFrame(){

        JPanel infoPanel;
        infoPanel = new JPanel();
        // TODO change background color to transparent
        infoPanel.setBackground(new Color(0,0,0,80));
        infoPanel.setBounds(120,260,370,80);
        //to get the customized text: label.setText(label.getText()+"something");
        //JLabel is placed right on info panel to display info over the network
        JLabel displayLabel;
        displayLabel = new JLabel("Description" + " Display info here");
        displayLabel.setForeground(Color.WHITE);



        JPanel btnPanel;
        btnPanel = new JPanel();
        btnPanel.setBackground(new Color(0,0,0,0));
        btnPanel.setBounds(442,380,158,60);
        //Unfall Melden button is placed right on it
        JButton reportAccidentbtn;
        ImageIcon logo = new ImageIcon("C:\\Users\\despi\\Desktop\\StadtplanUI\\logo.jpg");
        reportAccidentbtn = new JButton(logo);
        reportAccidentbtn.setBackground(new Color(0,0,0,0));


        //background
        ImageIcon background_imagered = new ImageIcon ("C:\\Users\\despi\\Desktop\\StadtplanUI\\backgroundred.jpg");
        ImageIcon background_imageyellow = new ImageIcon ("C:\\Users\\despi\\Desktop\\StadtplanUI\\backgroundyellow.jpg");
        ImageIcon background_imagegreen = new ImageIcon ("C:\\Users\\despi\\Desktop\\StadtplanUI\\backgroundgreen.jpg");
        JLabel background = new JLabel("",background_imagegreen,JLabel.CENTER);

        //linking JFrames
        IDVerificationUI idverificationui = new IDVerificationUI();
        reportAccidentbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                idverificationui.idVerification.setVisible(true);
            }
        });

        //frame
        setSize(620,490);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        background.setBounds(0, 0, 600,442);
        add(background);
        background.add(infoPanel);
        background.add(btnPanel);

        infoPanel.add(displayLabel);
        btnPanel.add(reportAccidentbtn);
        setVisible(true);



    }
    public static void main(String[] args) {

        new WelcomeFrame();

    }
}
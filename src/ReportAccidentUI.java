import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;


public class ReportAccidentUI extends JFrame implements ActionListener{

    JFrame reportAccident;
    JTextField chooseStreetField;
    JLabel chooseStreetLabel;
    JLabel isSafeLabel;
    JLabel StartNode;
    JLabel EndNode;
    JLabel reportAccidentLabel;
    JRadioButton jaRadio;
    JRadioButton neinRadio;
    JButton submitButton;
    JButton backButton;
    JPanel panel = new JPanel();
    String[] streetNames = { "Sesame Street", "15 Yemen Road", "Diagon Alley" };
    String[] startNodes = { "1", "2", "3", "4", "5" };
    String[] endNodes = { "1", "2", "3", "4", "5" };


    ReportAccidentUI(){
        reportAccident=new JFrame("Stadtplan-Goslar");

        JLabel title=new JLabel("Unfall Melden");
        title.setBounds(180,20,450,300);
        title.setVerticalAlignment(JLabel.TOP);
        title.setFont(new Font("Verdana", Font.PLAIN, 25));
        title.setPreferredSize(new Dimension(250, 100));
        title.setForeground(Color.blue);


        chooseStreetLabel=new JLabel("Straßenname");
        chooseStreetLabel.setBounds(50,70,150,30);
        JComboBox<String> streetName = new JComboBox<String>(streetNames);
        streetName.setVisible(true);
        //panel.add(streetName);
        streetName.setBounds(180,75,150,20);

        isSafeLabel=new JLabel("Unfall gesichert?");
        isSafeLabel.setBounds(50,120,150,30);


        jaRadio=new JRadioButton("Ja");
        jaRadio.setBounds(170,120,50,30);
        neinRadio=new JRadioButton("Nein");
        neinRadio.setBounds(220,120,50,30);

        StartNode=new JLabel("Startknot:");
        StartNode.setBounds(50,130,250,100);
        JComboBox<String> startNode = new JComboBox<String>(startNodes);
        startNode.setVisible(true);
        //panel.add(startNode);
        startNode.setBounds(120,170,50,20);

        EndNode=new JLabel("Endknot:");
        EndNode.setBounds(200,130,250,100);
        JComboBox<String> endNode = new JComboBox<String>(endNodes);
        endNode.setVisible(true);
        //panel.add(endNode);
        endNode.setBounds(270,170,50,20);



        submitButton=new JButton("Bestätigen");
        submitButton.setBounds(180,270,100,30);
        backButton=new JButton("Zurück");
        backButton.setBounds(320,270,100,30);



        ButtonGroup group = new ButtonGroup();
        group.add(jaRadio);
        group.add(neinRadio);


        reportAccident.add(chooseStreetLabel);
        reportAccident.add(isSafeLabel);
        reportAccident.add(jaRadio);
        reportAccident.add(neinRadio);
        reportAccident.add(StartNode);
        reportAccident.add(EndNode);
        reportAccident.add(submitButton);
        reportAccident.add(backButton);
        reportAccident.add(title);
        //reportAccident.add(panel);
        reportAccident.add(streetName);
        reportAccident.add(startNode);
        reportAccident.add(endNode);


        reportAccident.setSize(600,400);//600 width and 400 height
        reportAccident.setLayout(null);//using no layout managers
        reportAccident.setVisible(true);//making the frame visible

        submitButton.addActionListener(this);
        ButtonModel buttonModel = jaRadio.getModel();



    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == submitButton) {

            if ((jaRadio.isSelected()==true || neinRadio.isSelected()==true) || (jaRadio.isSelected()==false || neinRadio.isSelected()==false)) {
                JOptionPane.showMessageDialog(submitButton,
                        "Bitte bestimmen sie den Zustand des Unfalls");
            } else {


                JOptionPane.showMessageDialog(submitButton,
                        "Ihre Angaben werden gespeichert.");
            }

        }
    }

    public static void main(String[] args) {
        new ReportAccidentUI();

    }


}

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension; 
public class Resume implements ActionListener{
    JFrame frame;
    JMenuBar menu;
    JMenu home, education, workHistory, skills, softSkills, volunteerWork;
    JMenuItem UNCC, RCCC, kellyServices, rentACenter, staffmark, archerControls, carolinasMedical,
            gitHub, codingLang, compSciConcepts, software, communication, critThink, teamwork,
            positiveAttitude, workEthic, leadership, piedmontBaptist, mainStreet, about, contactInfo;
    JPanel main;
    JButton email, link, gitC, gitP;
    JTextArea emailText, linkedIn, gitHubC, gitHubP;

    Resume() {
        frame = new JFrame("Samuel Kilby's Resume");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        menu = new JMenuBar();
        home = new JMenu("Home"); home.addActionListener(this);
        education = new JMenu("Education");
        workHistory = new JMenu("Work History");
        skills = new JMenu("Skills");
        //https://www.thebalancecareers.com/list-of-soft-skills-2063770
        softSkills = new JMenu("Soft Skills");
        volunteerWork = new JMenu("Volunteer Work");
        UNCC = new JMenuItem("University of North Carolina at Charlotte"); UNCC.addActionListener(this);
        RCCC = new JMenuItem("Rowan-Cabarrus Community College"); RCCC.addActionListener(this);
        kellyServices = new JMenuItem("Kelly Services"); kellyServices.addActionListener(this);
        rentACenter = new JMenuItem("Rent-A-Center"); rentACenter.addActionListener(this);
        staffmark = new JMenuItem("Staffmark"); staffmark.addActionListener(this);
        archerControls = new JMenuItem("Archer Controls and Electric Company"); archerControls.addActionListener(this);
        carolinasMedical = new JMenuItem("Carolinas Medical Center"); carolinasMedical.addActionListener(this);
        gitHub = new JMenuItem("GitHub"); gitHub.addActionListener(this);
        codingLang = new JMenuItem("Coding Languages"); codingLang.addActionListener(this);
        compSciConcepts = new JMenuItem("Computer Science Concepts"); compSciConcepts.addActionListener(this);
        software = new JMenuItem("Software"); software.addActionListener(this);
        communication = new JMenuItem("Communication"); communication.addActionListener(this);
        critThink = new JMenuItem("Critical Thinking"); critThink.addActionListener(this);
        teamwork = new JMenuItem("Teamwork"); teamwork.addActionListener(this);
        positiveAttitude = new JMenuItem("Positive Attitude"); positiveAttitude.addActionListener(this);
        workEthic = new JMenuItem("Work Ethic"); workEthic.addActionListener(this);
        leadership = new JMenuItem("Leadership"); leadership.addActionListener(this);
        piedmontBaptist = new JMenuItem("Piedmont Baptist Church"); piedmontBaptist.addActionListener(this);
        mainStreet = new JMenuItem("Main Street Mission"); mainStreet.addActionListener(this);
        about = new JMenuItem("About"); about.addActionListener(this);
        contactInfo = new JMenuItem("Contact Info"); contactInfo.addActionListener(this);

        main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.PAGE_AXIS));
        main.setAlignmentX(350);
        main.setSize(700, 500);
        main.setBackground(Color.BLACK);
        main.setPreferredSize(new Dimension(700, 500));
        JLabel text0 = new JLabel("         Welcome to my resume! You may navigate via the above dropdown menus.");
        JLabel text1 = new JLabel("     Click on the \"Home\" and \"About\" button to return here.");
        JLabel text2 = new JLabel("     Thank you for taking the time to check things out.");
        JLabel text3 = new JLabel("     The purpose of this resume format is to provide an example of work suporting my skills.");
        JLabel text4 = new JLabel("     As stated in the header, I am Samuel Kilby.");
        text0.setFont(new Font("Verdana", Font.BOLD, 14)); text1.setFont(new Font("Verdana", Font.BOLD, 12));
        text2.setFont(new Font("Verdana", Font.BOLD, 12)); text3.setFont(new Font("Verdana", Font.BOLD, 12));
        text4.setFont(new Font("Verdana", Font.BOLD, 12));
        text0.setForeground(Color.WHITE); text1.setForeground(Color.WHITE); text2.setForeground(Color.WHITE);
        text3.setForeground(Color.WHITE); text4.setForeground(Color.WHITE);
        main.add(new Box.Filler(new Dimension(5, 5), new Dimension(30, 30), new Dimension(30, 30))); main.add(text0);
        main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text1);
        main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text2);
        main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text3); 
        main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text4);
        
        frame.add(main);
        //frame.pack();
        
        menu.add(home); menu.add(education); menu.add(workHistory); menu.add(skills); menu.add(softSkills); menu.add(volunteerWork);
        education.add(UNCC); education.add(RCCC);
        workHistory.add(kellyServices); workHistory.add(rentACenter); workHistory.add(staffmark); workHistory.add(archerControls);
        workHistory.add(carolinasMedical);
        skills.add(gitHub); skills.add(codingLang); skills.add(compSciConcepts); skills.add(software);
        softSkills.add(communication); softSkills.add(critThink); softSkills.add(teamwork); softSkills.add(positiveAttitude);
        softSkills.add(workEthic); softSkills.add(leadership);
        volunteerWork.add(piedmontBaptist); volunteerWork.add(mainStreet);
        home.add(about); home.add(contactInfo);
        frame.add(menu);
        frame.setJMenuBar(menu);
        frame.setVisible(true);
        email = new JButton("Copy Email Address"); email.addActionListener(this);
        emailText = new JTextArea("samuelkilby95@gmail.com");
        link = new JButton("Copy LinkedIn Link"); link.addActionListener(this);
        linkedIn = new JTextArea("http://www.linkedin.com/in/skilby2");
        gitC = new JButton("Copy College Git"); gitC.addActionListener(this);
        gitHubC = new JTextArea("https://github.com/skilby2");
        gitP = new JButton("Copy Personal Git"); gitP.addActionListener(this);
        gitHubP = new JTextArea("https://github.com/SamuelKilby");
    }//end of constructor
    @Override
    public void actionPerformed(ActionEvent event) {
        frame.remove(main);
        frame.repaint();
        if(event.getSource() == about) {
            main = new JPanel();
            main.setLayout(new BoxLayout(main, BoxLayout.PAGE_AXIS));
            main.setAlignmentX(350);
            main.setSize(700, 500);
            main.setBackground(Color.BLACK);
            main.setPreferredSize(new Dimension(700, 500));
            JLabel text0 = new JLabel("         Welcome to my resume! You may navigate via the above dropdown menus.");
            JLabel text1 = new JLabel("     Click on the \"Home\" and \"About\" button to return here.");
            JLabel text2 = new JLabel("     Thank you for taking the time to check things out.");
            JLabel text3 = new JLabel("     The purpose of this resume format is to provide an example of work suporting my skills.");
            JLabel text4 = new JLabel("     As stated in the header, I am Samuel Kilby.");
            text0.setFont(new Font("Verdana", Font.BOLD, 14)); text1.setFont(new Font("Verdana", Font.BOLD, 12));
            text2.setFont(new Font("Verdana", Font.BOLD, 12)); text3.setFont(new Font("Verdana", Font.BOLD, 12));
            text4.setFont(new Font("Verdana", Font.BOLD, 12));
            text0.setForeground(Color.WHITE); text1.setForeground(Color.WHITE); text2.setForeground(Color.WHITE);
            text3.setForeground(Color.WHITE); text4.setForeground(Color.WHITE);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(30, 30), new Dimension(30, 30))); main.add(text0);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text1);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text2);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text3); 
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text4);
        }
        if(event.getSource() == contactInfo) {
            main = new JPanel();
            main.setLayout(new BoxLayout(main, BoxLayout.PAGE_AXIS));
            main.setAlignmentX(350);
            main.setSize(700, 500);
            main.setBackground(Color.DARK_GRAY);
            main.setPreferredSize(new Dimension(700, 500));
            JLabel text0 = new JLabel("         Please contact me with any questions or inquiries.");
            JLabel text1 = new JLabel("     Email: samuelkilby95@gmail.com");
            JLabel text2 = new JLabel("     Mobile Phone: 704 787 5825");
            JLabel text3 = new JLabel("     LinkedIn: http://www.linkedin.com/in/skilby2");
            JLabel text4 = new JLabel("     College Git: https://github.com/skilby2");
            JLabel text5 = new JLabel("     Personal Git: https://github.com/SamuelKilby");
            
            text0.setFont(new Font("Verdana", Font.BOLD, 14)); text1.setFont(new Font("Verdana", Font.BOLD, 12));
            text2.setFont(new Font("Verdana", Font.BOLD, 12)); text3.setFont(new Font("Verdana", Font.BOLD, 12));
            text4.setFont(new Font("Verdana", Font.BOLD, 12)); text5.setFont(new Font("Verdana", Font.BOLD, 12));
            text0.setForeground(Color.WHITE); text1.setForeground(Color.WHITE); text2.setForeground(Color.WHITE);
            text3.setForeground(Color.WHITE); text4.setForeground(Color.WHITE); text5.setForeground(Color.WHITE);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(30, 30), new Dimension(30, 30))); main.add(text0);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text1); main.add(email);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text2);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text3); main.add(link);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text4); main.add(gitC);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text5); main.add(gitP);
        }
        if(event.getSource() == email) {
            emailText.selectAll();
            emailText.copy();
        }
        if(event.getSource() == link) {
            linkedIn.selectAll();
            linkedIn.copy();
        }
        if(event.getSource() == gitC) {
            gitHubC.selectAll();
            gitHubC.copy();
        }
        if(event.getSource() == gitP) {
            gitHubP.selectAll();
            gitHubP.copy();
        }
        if(event.getSource() == UNCC) {
            main = new JPanel();
            main.setLayout(new BoxLayout(main, BoxLayout.PAGE_AXIS));
            main.setAlignmentX(350);
            main.setSize(700, 500);
            main.setBackground(Color.GREEN);
            main.setPreferredSize(new Dimension(700, 500));
            JLabel text0 = new JLabel("         The University of North Carolina at Charlotte.");
            JLabel text1 = new JLabel("     Bachelor's of Science in Computer Science");
            JLabel text2 = new JLabel("     Minor: Spanish");
            JLabel text3 = new JLabel("     Start: August 2018");
            JLabel text4 = new JLabel("     End: December 2020");
            text0.setFont(new Font("Times New Roman", Font.BOLD, 20)); text1.setFont(new Font("Times New Roman", Font.BOLD, 16));
            text2.setFont(new Font("Times New Roman", Font.BOLD, 16)); text3.setFont(new Font("Times New Roman", Font.BOLD, 16));
            text4.setFont(new Font("Times New Roman", Font.BOLD, 16));
            text0.setForeground(Color.YELLOW); text1.setForeground(Color.WHITE); text2.setForeground(Color.YELLOW);
            text3.setForeground(Color.WHITE); text4.setForeground(Color.YELLOW);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(30, 30), new Dimension(30, 30))); main.add(text0);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text1);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text2);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text3); 
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text4);
        }
        if(event.getSource() == RCCC) {
            main = new JPanel();
            main.setLayout(new BoxLayout(main, BoxLayout.PAGE_AXIS));
            main.setAlignmentX(350);
            main.setSize(700, 500);
            main.setBackground(Color.BLUE);
            main.setPreferredSize(new Dimension(700, 500));
            JLabel text0 = new JLabel("         Rowan-Cabarrus Community College.");
            JLabel text1 = new JLabel("     Associates in Art");
            JLabel text2 = new JLabel("     Minor: Spanish");
            JLabel text3 = new JLabel("     Start: August 2013");
            JLabel text4 = new JLabel("     End: May 2018");
            text0.setFont(new Font("Times New Roman", Font.BOLD, 20)); text1.setFont(new Font("Times New Roman", Font.BOLD, 16));
            text2.setFont(new Font("Times New Roman", Font.BOLD, 16)); text3.setFont(new Font("Times New Roman", Font.BOLD, 16));
            text4.setFont(new Font("Times New Roman", Font.BOLD, 16));
            text0.setForeground(Color.LIGHT_GRAY); text1.setForeground(Color.WHITE); text2.setForeground(Color.LIGHT_GRAY);
            text3.setForeground(Color.WHITE); text4.setForeground(Color.LIGHT_GRAY);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(30, 30), new Dimension(30, 30))); main.add(text0);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text1);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text2);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text3); 
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text4);
        }
        if(event.getSource() == about) {
            main = new JPanel();
            main.setLayout(new BoxLayout(main, BoxLayout.PAGE_AXIS));
            main.setAlignmentX(350);
            main.setSize(700, 500);
            main.setBackground(Color.BLACK);
            main.setPreferredSize(new Dimension(700, 500));
            JLabel text0 = new JLabel("         Welcome to my resume! You may click on the tabs above to navigate through.");
            JLabel text1 = new JLabel("     Click on the \"Home\" button to return here.");
            JLabel text2 = new JLabel("     Email: samuelkilby95@gmail.com");
            JLabel text3 = new JLabel("     Mobile phone: 704 787 5825");
            JLabel text4 = new JLabel("     LinkedIn: http://www.linkedin.com/in/skilby2");
            text0.setFont(new Font("Verdana", Font.BOLD, 14)); text1.setFont(new Font("Verdana", Font.BOLD, 12));
            text2.setFont(new Font("Verdana", Font.BOLD, 12)); text3.setFont(new Font("Verdana", Font.BOLD, 12));
            text4.setFont(new Font("Verdana", Font.BOLD, 12));
            text0.setForeground(Color.WHITE); text1.setForeground(Color.WHITE); text2.setForeground(Color.WHITE);
            text3.setForeground(Color.WHITE); text4.setForeground(Color.WHITE);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(30, 30), new Dimension(30, 30))); main.add(text0);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text1);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text2);
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text3); 
            main.add(new Box.Filler(new Dimension(5, 5), new Dimension(15, 15), new Dimension(20, 20))); main.add(text4);
        }
        frame.add(main);
        frame.setVisible(true);
    }
 public static void main(String[] args) {
     new Resume();
 }
}//end of class
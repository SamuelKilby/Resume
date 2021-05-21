import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension; 
public class Resume implements ActionListener{
    JFrame frame;
    JMenuBar menu;
    JMenu home, education, workHistory, skills, softSkills, volunteerWork;
    JMenuItem UNCC, RCCC, kellyServices, rentACenter, staffmark, archerControls, carolinasMedical,
            gitHub, codingLang, compSciConcepts, software, communication, critThink, teamwork,
            positiveAttitude, workEthic, leadership, piedmontBaptist, mainStreet;
    JPanel main;
    JLabel text;

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

        main = new JPanel();
        main.setBackground(Color.MAGENTA);
        main.setPreferredSize(new Dimension(700, 500));
        text = new JLabel("welcome to my resume. Does it work?");
        main.add(text);
        frame.getContentPane().add(main);
        frame.pack();
        
        menu.add(home); menu.add(education); menu.add(workHistory); menu.add(skills); menu.add(softSkills); menu.add(volunteerWork);
        education.add(UNCC); education.add(RCCC);
        workHistory.add(kellyServices); workHistory.add(rentACenter); workHistory.add(staffmark); workHistory.add(archerControls);
        workHistory.add(carolinasMedical);
        skills.add(gitHub); skills.add(codingLang); skills.add(compSciConcepts); skills.add(software);
        softSkills.add(communication); softSkills.add(critThink); softSkills.add(teamwork); softSkills.add(positiveAttitude);
        softSkills.add(workEthic); softSkills.add(leadership);
        volunteerWork.add(piedmontBaptist); volunteerWork.add(mainStreet);
        frame.add(menu);
        frame.setJMenuBar(menu);
        frame.setVisible(true);
    }//end of constructor
    @Override
    public void actionPerformed(ActionEvent event) {
        frame.remove(main);
        frame.repaint();
        if(event.getSource() == UNCC) {
            
        }
        if(event.getSource() == RCCC) {
        text = new JLabel("<html>This is Rowan Cabarrus' info dump</html>");
        }
        if(event.getSource() == home) {
            text = new JLabel("welcome back");
        }
        frame.add(main, BorderLayout.CENTER);
        frame.setVisible(true);
    }
 public static void main(String[] args) {
     new Resume();
 }
}//end of class
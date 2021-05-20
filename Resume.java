import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
public class Resume implements ActionListener{
    JFrame frame;
    JMenuBar menu;
    JMenu home, education, workHistory, skills, softSkills, volunteerWork;
    JMenuItem UNCC, RCCC, kellyServices, rentACenter, staffmark, archerControls, carolinasMedical,
            gitHub, codingLang, compSciConcepts, software, communication, critThink, teamwork,
            positiveAttitude, workEthic, leadership, piedmontBaptist, mainStreet;
    JTextArea text;

    Resume() {
        frame = new JFrame("Samuel Kilby's Resume");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        frame.setSize(700, 500);
        menu = new JMenuBar();
        home = new JMenu("Home");
        education = new JMenu("Education");
        workHistory = new JMenu("Work History");
        skills = new JMenu("Skills");
        //https://www.thebalancecareers.com/list-of-soft-skills-2063770
        softSkills = new JMenu("Soft Skills");
        volunteerWork = new JMenu("Volunteer Work");
        UNCC = new JMenuItem("University of North Carolina at Charlotte");
        RCCC = new JMenuItem("Rowan-Cabarrus Community College");
        kellyServices = new JMenuItem("Kelly Services");
        rentACenter = new JMenuItem("Rent-A-Center");
        staffmark = new JMenuItem("Staffmark");
        archerControls = new JMenuItem("Archer Controls and Electric Company");
        carolinasMedical = new JMenuItem("Carolinas Medical Center");
        gitHub = new JMenuItem("GitHub");
        codingLang = new JMenuItem("Coding Languages");
        compSciConcepts = new JMenuItem("Computer Science Concepts");
        software = new JMenuItem("Software");
        communication = new JMenuItem("Communication");
        critThink = new JMenuItem("Critical Thinking");
        teamwork = new JMenuItem("Teamwork");
        positiveAttitude = new JMenuItem("Positive Attitude");
        workEthic = new JMenuItem("Work Ethic");
        leadership = new JMenuItem("Leadership");
        piedmontBaptist = new JMenuItem("Piedmont Baptist Church");
        mainStreet = new JMenuItem("Main Street Mission");
        UNCC.addActionListener(this);
        text = new JTextArea();
        text.setBounds(5, 5, 670, 450);
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
        frame.add(text);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == UNCC)
        text = new JTextArea("Bachelor's Degree in computer Science");
        frame.add(text);
        frame.setVisible(true);;
    }
  //JMenuBar menu = new JMenuBar();
    
  //JMenuItem test = new JMenuItem("Kelly Services");//needed if string works?
  //bar1.insert(test, 0);
  
  //Button Rowan = new Button("Rowan-Cabarrus Community College");
  //bar1.insert(Rowan, 0);

//   bar1.insert("Rowan-Cabarrus Community College", 0); bar1.insert("University of North Carolina at Charlotte", 1);

//   bar2.insert("Kelly Services", 0); bar2.insert("Rent-A-Center", 1); bar2.insert("Staffmark", 2);
//   bar2.insert("Archer Controls and Electric", 3); bar2.insert("Carolinas Medical Center", 4);

//   bar3.insert("GitHub", 0); bar3.insert("Coding Languages", 1); bar3.insert("Computer Science Concepts", 2);
//   bar3.insert("Software", 3);

//   bar4.insert("Communication", 0); bar4.insert("Critical Thinking", 1); bar4.insert("Teamwork", 2);
//   bar4.insert("Positive Attitude", 3); bar4.insert("Work Ethic", 4); bar4.insert("Leadership", 5);

//   //frame.add(test);//adds menu item to whole frame
//   bar5.insert("Piedmont Baptist Church", 0);
//   bar5.insert("Main Street Mission", 1);


//   frame.setJMenuBar(menu);
//   //frame.pack();
//   frame.setVisible(true);
//     }
 public static void main(String[] args) {
     new Resume();
}
}
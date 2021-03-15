import java.util.*;
import javax.swing.*;

public class Resume {
 public static void main(String[] args) {
  System.out.println("Howdy World!");
  JFrame frame = new JFrame("Samuel Kilby's Resume");
  frame.setSize(300,300);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
  
  JMenuBar menu = new JMenuBar();
  JMenu bar1 = new JMenu("Work History", true);
  JMenu bar2 = new JMenu("Skills", true);
  menu.add(bar1);
  menu.add(bar2);

  frame.setJMenuBar(menu);
 }
}
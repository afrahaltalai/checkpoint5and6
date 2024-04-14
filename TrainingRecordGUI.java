// GUI and main program for the Training Record

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

public class TrainingRecordGUI extends JFrame implements ActionListener {
    private JTextField name = new JTextField(30);
    private JTextField day = new JTextField(2);
    private JTextField month = new JTextField(2);
    private JTextField year = new JTextField(4);
    private JTextField hours = new JTextField(2);
    private JTextField mins = new JTextField(2);
    private JTextField secs = new JTextField(2);
    private JTextField dist = new JTextField(4);
    
   
    
     private JTextField terrain = new JTextField(6);
     private JTextField tempo = new JTextField(5);
     private JTextField pool = new JTextField(6);
       
    private JLabel labn = new JLabel(" Name:");
    private JLabel labd = new JLabel(" Day:");
    private JLabel labm = new JLabel(" Month:");
    private JLabel laby = new JLabel(" Year:");
    private JLabel labh = new JLabel(" Hours:");
    private JLabel labmm = new JLabel(" Mins:");
    private JLabel labs = new JLabel(" Secs:");
    private JLabel labdist = new JLabel(" Distance (km):");
    
    
     private JLabel Tr = new JLabel("terrain:");
      private JLabel Te = new JLabel(" tempo:");
       private JLabel Po = new JLabel(" pool:");
       
    private JButton addR = new JButton("Add");
    private JButton lookupR = new JButton("Look Up");
     //private JButton RemoveR = new JButton("Remove"); 
    private JButton RemoveRunningR = new JButton("Remove Running");
     private JButton RemoveCyclingR = new JButton("Remove Cycling");
      private JButton RemoveSwimmingR = new JButton("Remove Swimming");
      
    
    private JButton RunningR = new JButton("addRunning");
    private JButton CyclingR = new JButton("addCycling");
    private JButton SwimmingR = new JButton("addSwimming");
    
     private JButton RunningM = new JButton("lookupRunning");
      private JButton CyclingM = new JButton("lookupCycling");
       private JButton SwimmingM = new JButton("lookupSwimming");
        private JButton Findallbydata = new JButton(" Findallbydata ");
    
    private TrainingRecord myAthletes = new TrainingRecord();

    private JTextArea outputArea = new JTextArea(5,50);
    
   public static void main(String[] args) {
        TrainingRecordGUI applic = new TrainingRecordGUI();
   } // main
 
   // set up the GUI 
   public TrainingRecordGUI() {
        super("Training Record");
        setLayout(new FlowLayout()); 
        add(labn);
        add(name);
        name.setEditable(true);
        add(labd);
        add(day);
        day.setEditable(true);
        add(labm);
        add(month);
        month.setEditable(true);
        add(laby);
        add(year);
        year.setEditable(true);
        add(labh);
        add(hours);
        hours.setEditable(true);
        add(labmm);
        add(mins);
        mins.setEditable(true);
        add(labs);
        add(secs);
        secs.setEditable(true);
        add(labdist);
        add(dist);
        
        add(Tr);
        add(terrain);
        terrain.setEditable(true);
        add(Te);
        add(tempo);
        tempo.setEditable(true);
        setSize(100,200);
        setVisible(true); 
        add(Po);
        add(pool);
        pool.setEditable(true);
        
        dist.setEditable(true);
        add(addR);
        addR.addActionListener(this);
        add(lookupR);
        lookupR.addActionListener(this);
        add(outputArea);
        outputArea.setEditable(false); 
        setSize(720,200);
        setVisible(true); 
        blankDisplay();
        
        RunningR.addActionListener(this);
        add(RunningR);
        CyclingR.addActionListener(this);
        add(CyclingR);
        SwimmingR.addActionListener(this);
        add(SwimmingR);
        
        RunningM.addActionListener(this);
        add(RunningM);
        CyclingM.addActionListener(this);
        add(CyclingM);
        SwimmingM.addActionListener(this);
        add(SwimmingM);
        Findallbydata.addActionListener(this);
        add(Findallbydata);
        
        RemoveRunningR.addActionListener(this);
        add(RemoveRunningR);
        
        RemoveCyclingR.addActionListener(this);
        add(RemoveCyclingR);
        
        RemoveSwimmingR.addActionListener(this);
        add(RemoveSwimmingR);
       
        //add(RemoveR);
        //RemoveR.addActionListener(this);
         setVisible(true);
         blankDisplay();
        
         
        // To save typing in new entries while testing, uncomment
        // the following lines (or add your own test cases)
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = new Entry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        Entry c1 = new Entry("Claire",7,3,2010, 0, 26, 20, 7);        
        Running c2 = new Running("Claire",11,3,2010, 0, 24, 55, 7);
        Cycling c3 = new Cycling("Claire",11,3,2010, 0, 24, 55, 7,true, 1.2f);
        Swimming c4 = new Swimming("Claire",11,3,2010, 0, 24, 55, 7,false);
       
        
        myAthletes.addEntry(a);
        myAthletes.addEntry(b);
        myAthletes.addEntry(c1);        
        myAthletes.addRunning(c2);
        myAthletes.addCycling(c3);
        myAthletes.addSwimming(c4);
       
   } // constructor
   
  
   // listen for and respond to GUI events 
    public void actionPerformed(ActionEvent event) {    
        if (event.getSource() == addR) {
           String n = name.getText();
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText());
           float km = java.lang.Float.parseFloat(dist.getText());
           int h = Integer.parseInt(hours.getText());
           int mm = Integer.parseInt(mins.getText());
           int s = Integer.parseInt(secs.getText());
           Entry e = new Entry(n, d, m, y, h, mm, s, km);
           myAthletes.addEntry(e);
           outputArea.setText("Record added\n");
           
        }
  
       
        if (event.getSource() == RunningR) {
           String n = name.getText();
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText());
           float km = java.lang.Float.parseFloat(dist.getText());
           int h = Integer.parseInt(hours.getText());
           int mm = Integer.parseInt(mins.getText());
           int s = Integer.parseInt(secs.getText());
           Running e = new Running(n, d, m, y, h, mm, s, km);
           myAthletes.addRunning(e);
           outputArea.setText("Record added\n");
        }
        
        if (event.getSource() == CyclingR) {
           String n = name.getText();
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText());
           float km = java.lang.Float.parseFloat(dist.getText());
           float Te = java.lang.Float.parseFloat(tempo.getText());
           boolean tr = java.lang.Boolean.parseBoolean(terrain.getText());
           int h = Integer.parseInt(hours.getText());
           int mm = Integer.parseInt(mins.getText());
           int s = Integer.parseInt(secs.getText());
           Cycling e = new Cycling(n, d, m, y, h, mm, s, km,true, 1.2f);
           myAthletes.addCycling(e);
           outputArea.setText("Record added\n");
        }
        
        if (event.getSource() == SwimmingR) {
           String n = name.getText();
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText());
           float km = java.lang.Float.parseFloat(dist.getText());
           boolean Po = java.lang.Boolean.parseBoolean(dist.getText());
           int h = Integer.parseInt(hours.getText());
           int mm = Integer.parseInt(mins.getText());
           int s = Integer.parseInt(secs.getText());
           Swimming e = new Swimming(n, d, m, y, h, mm, s, km,false);
           myAthletes.addSwimming(e);
           outputArea.setText("Record added\n");
        }
        
        if (event.getSource() == RunningM ) {
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText()); 
           outputArea.setText("looking up record ...");
           String result = myAthletes.lookupRunningM(d, m, y);
           outputArea.setText(result);
        }
        
        if (event.getSource() == CyclingM) {
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText()); 
           outputArea.setText("looking up record ...");
           String result = myAthletes.lookupCyclingM(d, m, y);
           outputArea.setText(result);
        }
        
        if (event.getSource() == SwimmingM) {
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText()); 
           //outputArea.setText("looking up record ...");
           String result = myAthletes.lookupSwimmingM(d, m, y);
           outputArea.setText(result);
        }
        
        if (event.getSource() == RemoveRunningR) {
           String n = name.getText(); 
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText()); 
           //outputArea.setText("Deleting record ...");
           String result = myAthletes.RemoveRunningR(n, d, m, y);
           outputArea.setText(result);
        }
        
        if (event.getSource() == RemoveCyclingR) {
           String n = name.getText(); 
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText()); 
           //outputArea.setText("Deleting record ...");
           String result = myAthletes.RemoveCyclingR(n,d, m, y);
           outputArea.setText(result);
        }
        
        if (event.getSource() == RemoveSwimmingR) {
           String n = name.getText();  
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText()); 
           //outputArea.setText("Deleting record ...");
           String result = myAthletes.RemoveSwimmingR(n,d, m, y);
           outputArea.setText(result);
        }
        
        if (event.getSource() == Findallbydata) {
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText()); 
           //outputArea.setText("looking up record ...");
           String result = myAthletes.lookupFindallbydata(d, m, y);
           outputArea.setText(result);
        }
        
        if (event.getSource() == lookupR) {
           int m = Integer.parseInt(month.getText()); 
           int d = Integer.parseInt(day.getText()); 
           int y = Integer.parseInt(year.getText()); 
           //outputArea.setText("looking up record ...");
           String result = myAthletes.lookupEntry(d, m, y);
           outputArea.setText(result);
        }
        
       blankDisplay();
    } // actionPerformed
  
    
   public void blankDisplay(){
       name.setText("");
       day.setText("");
       month.setText("");
       year.setText("");
       hours.setText("");
       mins.setText("");
       secs.setText("");
       dist.setText("");   
       terrain.setText("");
       tempo.setText("");
       pool.setText("");
    }// blankDisplay
    
} // TrainingRecordGUI



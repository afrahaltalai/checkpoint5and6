// An implementation of a Training Record as an ArrayList

import java.util.*;
public class TrainingRecord {
    private List<Entry> tr;
    private List<Running> tr1;
    private List<Cycling> tr2;
    private List<Swimming> tr3;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
        tr1 = new ArrayList<Running>();
        tr2 = new ArrayList<Cycling>();
        tr3 = new ArrayList<Swimming>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e) {
       tr.add(e);    
   } // addClass
   
   public void addRunning(Running e) {
       tr1.add(e);    
   } // addClass
   
   public void addCycling(Cycling e) {
       tr2.add(e);    
   } // addClass
   
   public void addSwimming(Swimming e) {
       tr3.add(e);    
   } // addClass
   // look up the entry of a given day and month
   public String lookupEntry  (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String lookupRunningM (int d, int m, int y) {
       ListIterator<Running> iter1 = tr1.listIterator();
       String result = "No entries found";
       while (iter1.hasNext()) {
          Entry current = iter1.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String lookupCyclingM (int d, int m, int y) {
       ListIterator<Cycling> iter2 = tr2.listIterator();
       String result = "No entries found";
       while (iter2.hasNext()) {
          Entry current = iter2.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   
   public String lookupSwimmingM (int d, int m, int y) {
       ListIterator<Swimming> iter3 = tr3.listIterator();
       String result = "No entries found";
       while (iter3.hasNext()) {
          Entry current = iter3.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String RemoveRunningR (String n, int d, int m, int y) {
       ListIterator<Running> iter1 = tr1.listIterator();
       String result = "No entries found";
       while (iter1.hasNext()) {
          Running current = iter1.next();
          if (n.equals(current.getName())&& current.getDay() ==d && current.getMonth()==m && current.getYear()==y) 
             tr1.remove(current);
            }
       return result;
   } // lookupEntry
   
   public String RemoveCyclingR (String n,int d, int m, int y) {
       ListIterator<Cycling> iter2 = tr2.listIterator();
       String result = "No entries found";
       while (iter2.hasNext()) {
          Cycling current = iter2.next();
          if (n.equals(current.getName())&& current.getDay() ==d && current.getMonth()==m && current.getYear()==y)
             tr2.remove(current);
            }
       return result;
   } // lookupEntry
  
   
   public String RemoveSwimmingR (String n,int d, int m, int y) {
       ListIterator<Swimming> iter3 = tr3.listIterator();
       String result = "No entries found";
       while (iter3.hasNext()) {
          Swimming current = iter3.next();
          if (n.equals(current.getName())&& current.getDay() ==d && current.getMonth()==m && current.getYear()==y)
             tr3.remove(current);
            }
       return result;
   } // lookupEntry
   
   public String lookupFindallbydata(int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       ListIterator<Running> iter1 = tr1.listIterator();
       ListIterator<Cycling> iter2 = tr2.listIterator();
       ListIterator<Swimming> iter3 = tr3.listIterator();
       String result = "No entries found";
       while (iter1.hasNext()||iter2.hasNext()||iter3.hasNext()) {
           //Entry current = iter.next();
          Running current1 = iter1.next();
          Cycling current2 = iter2.next();
          Swimming current3 = iter3.next();
          if (current1.getDay()==d && current1.getMonth()==m && current1.getYear()==y) 
             result = current2.getEntry();
          if (current2.getDay()==d && current2.getMonth()==m && current2.getYear()==y) 
             result = current2.getEntry();
          if (current3.getDay()==d && current3.getMonth()==m && current3.getYear()==y) 
             result = current3.getEntry();
            }
       return result;
   
} // TrainingRecord
}

  
  
        
/**
 * Write a description of class Running here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Running extends Entry
{
  
  
    /**
     * Constructor for objects of class Running
     */
    public Running(String n, int d, int m, int y, int h, int min, int s, float dist)
    {
        // initialise instance variables
        super( n,d,m,y,h,min,s,dist);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getRunning()
    {
        // put your code here
     String result = getName()+" ran " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
     return result;
    }
}

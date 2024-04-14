
/**
 * Write a description of class Swimming here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swimming extends Entry
{
    // instance variables - replace the example below with your own
    private  boolean pool;

    /**
     * Constructor for objects of class Swimming
     */
    public Swimming(String n, int d, int m, int y, int h, int min, int s, float dist , boolean pool)
    {
        // initialise instance variables
        super( n,d,m,y,h,min,s,dist );
        this.pool= pool;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
     public String getSwimming()
    {
        // put your code here
        String result = getName()+" ran " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
      return result;
    }
}

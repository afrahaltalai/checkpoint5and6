

/**
 * Write a description of class Cycling here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cycling extends Entry 
{
    // instance variables - replace the example below with your own
    private boolean terrain;
    private float tempo;

    /**
     * Constructor for objects of class Cycling
     */
    public Cycling(String n, int d, int m, int y, int h, int min, int s, float dist , boolean terrain,float tempo)
    {
        // initialise instance variables
        super( n,d,m,y,h,min,s,dist);
     this.terrain= terrain;
     this.tempo= tempo;
  
  }
    public  boolean getterrain () {
    return terrain;
  } //getterrain
  public float gettempo() {
    return tempo;
  } //gettempo
  /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getCycling()
    {
        // put your code here
        String result = getName()+" ran " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+""+ getterrain()+""+gettempo()+"\n";
      return result;
    }
}

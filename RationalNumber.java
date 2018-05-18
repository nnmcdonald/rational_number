import java.util.*;
public class RationalNumber
{
  private int numerator;
  private int denominator;
  private static int gcd;
  
  public RationalNumber()
  {
    numerator = 0;
    denominator = 1;
  }
  
  //Sets the numerator and denominator values, returns an error message if denominator is 0
  //Inputs: numerator and denominator
  //Outputs: simplified numerator and denomintor values or an error message if the denomintor is 0.
  public RationalNumber(int numValue, int denValue)
  {
    Scanner keyboard = new Scanner(System.in);
    denominator = denValue;
    numerator = numValue;
    do
    if (denominator == 0)
    {
      System.out.println("Error, denominator cannot be 0.");
      System.out.println("Please enter a new denominator.");
      denominator = keyboard.nextInt();
      keyboard.close();
    }
    else;
    while(denominator == 0);
    //Determines the greatest common denominator of the 2 numbers then simplifies numerator and denominator.
    setGcd(numerator, denominator);
    simplify(numerator, denominator);
  }
  
  public void simplify(int num, int den)
  {
    numerator = num/getGcd();
    denominator = den/getGcd();
  }
  
  //Calculates the greatest common denomintor for 2 numbers.
  //Inputs: numerator and denomintor
  //Outputs: greatest common denomintor, gcd
  public void setGcd(int gcd1, int gcd2)
  {
    do
    {
     if (gcd1 >= gcd2)
    { 
      int x = gcd2;
      gcd2 = gcd1%gcd2;
      gcd1 = x;
      gcd = gcd1;
    }
    else
    {
      int x = gcd1;
      gcd1= gcd2;
      gcd2 = x;
    }
    }
    while(gcd2 != 0); 
  }
  
  public static int getGcd()
  {
    return gcd;
  }
  
  //Calculates the double value of the rational number numerator/denominator
  public double getValue()
  {
    return (1.0*numerator/denominator);
  }
  
  //Returns the rational number numerator/denominator as a String.
  public String toString()
  {
    return (numerator + "/" + denominator);
  }
}
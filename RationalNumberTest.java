///////////////////////////////////////////////////////////////////////////
//
// Nathaniel McDonald
// March 3, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  DESCRIPTION: This program tests the RationalNumber class by reducing a fraction entered by the user and
//               returning an error message if the denominator is 0.
// 
// INPUTS:  Numerator Value, Denominator Value
//    
//
// OUTPUTS:  Reduced rational number, and the double value of the rational number.
//   
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
  
public class RationalNumberTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Please enter a numerator value.");
    int numerator = keyboard.nextInt();
    System.out.println("Please enter a denominator value.");
    int denominator = keyboard.nextInt();
    keyboard.close();
    
    RationalNumber newNumber = new RationalNumber(numerator, denominator);
    //Prints the rational number and its double value.
    System.out.println(newNumber.toString() + "\n" + newNumber.getValue());
  }
}

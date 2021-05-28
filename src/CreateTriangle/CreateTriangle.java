/**
 * Created by Norman Potts
 * I, Norman Potts created this script.
 * JAN/27/2015
 * 
 */
package CreateTriangle;

import java.util.Scanner;

/**
 *
 * @author Norman
 * 
 * The Purpose of this program is to make use of a program class called triangle 
 * that reads 3 positive nonzero integer values from the key board ( assuming
 * valid integer will be entered ). Determine and print if they could represent
 * the sides of a triangle. If they can form a triangle determine if triangle is
 * right angle and display that fact. 
 * 
 * 
 *IPO
 * 
 * Input
 *      With the keyboard enter 3 positive nonzero integers .
 * 
 * Processing
 *      Pseudocode
 *      Get input
 *         Covert input to variables.
 *              Transfer variables to CLASS triangle.
 *          IN CLASS triangle
 *              IF (Numbers can represent the sides of triangle.)
 *                  Print Numbers CAN into output message;
 *                      IF (is triangle right angle?)
 *                          Print YES Right angle in output message.;
 *                      ELSE
 *                          Print NO Right angle in output message.;
 *                      ELSE
 *                          Print Numbers CANNOT into out put message
 *                     
 *          Transfer back to CLASS Lab2A.java
 *          Create OUTPUT message
 *          PRINT OUTPUT
 *                                     
 * OutPut
 * 
 *      Display "The numbers _,_,_, (can/cannot) form a Triangle. The numbers _,_,_, is (Not/is) Right angle."
 *      only in main class
 * 
 * 
 */
public class CreateTriangle 
{

 
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner( System.in); //Scans for user input data

        //Variable for sides
        int numA;  int numB;  int numC;


       System.out.println("Please enter value for side A, side B, and side C: ");  // Get message          

        // Transfer input to variables
        numA = input.nextInt();
        numB = input.nextInt();
        numC = input.nextInt();


        triangle tri = new triangle(numA, numB, numC);

        System.out.printf("Number A was %3d.\nNumber B was %3d.\nNumber C was %3d.        ", tri.getA(),tri.getB(),tri.getC() );


        if (tri.istriangle() == true)
        {

            System.out.printf("\nThe Numbers %3d, %3d, and %3d, can form a triangle.     ", tri.getA(),tri.getB(),tri.getC());        

            if (tri.isright()== true)
            {
                System.out.printf("\nThe Numbers %3d, %3d, and %3d, can form a right angle triangle.     ", tri.getA(),tri.getB(),tri.getC());
            }
            else
            {
                System.out.printf("\nThe Numbers %3d, %3d, and %3d, cannot form a right angle triangle.     ", tri.getA(),tri.getB(),tri.getC());
            }
        }
        else 
        { 
            System.out.printf("\nThe Numbers %3d, %3d, and %3d, cannot form a triangle.     ", tri.getA(),tri.getB(),tri.getC());
        }

    }/// End of method Main.

}/// End of class CreateTriangle


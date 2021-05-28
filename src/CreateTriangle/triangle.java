/**
 * Created by Norman Potts
 * I, Norman Potts created this script.
 * FEB/3/2015
 * 
 */
package CreateTriangle;

/**
 * This script is part of lab2
 * this script will
 *          create triangle
 *          test if is a triangle 
 *          test if right angle triangle.
 * @author Norman
 * 
 *      Pseudocode
 *          IF (Numbers can represent the sides of triangle.)
 *              Print Numbers CAN into output message;
 *          IF (is triangle right angle?)
 *              Print YES Right angle in output message.;
 *          ELSE
 *              Print NO Right angle in output message.;
 *          ELSE
 *              Print Numbers CANNOT into out put message
 *
 * 
 */
public class triangle {
 
    // Object variables, one for each side of a triangle.
    private int sideA;
    private int sideB;
    private int sideC;
        
     /** Constructor Method triangle
      * 
      * @param A
      * @param B
      * @param C 
      */
    public triangle(int A, int B, int C) {                 
        sideA = A;
        sideB = B;
        sideC = C;     
    }/// End of constructor method triangle.


    /// Accessor methods, this sends data back when called.
    public int getA() 
    {
        return sideA;
    }
     
    public int getB() 
    {
        return sideB;
    }

    public int getC() 
    {
        return sideC;
    }
    /// End of Accessor methods for all three sides.
    
    
    /** Method isright
     *  Determines if numbers can create a right angled triangle.
     *     C must be square of largest number not sideC.
     * @return boolean
     */
    public boolean isright(){
       boolean isright;      
              
        if (sideC > sideA && sideC>sideB)
        {
            int hyp = sideC;   
            int Aline = sideA;
            int Bline = sideB;                  
            int squareC = (int) Math.pow(hyp, 2);
            int squareB = Bline*Bline;
            int squareA = Aline*Aline;
            isright = squareB+squareA == squareC;    
            return isright;
        }    
        else if (sideA>sideB && sideA>sideC)
        {
            int hyp = sideA;
            int Aline = sideB;
            int Bline = sideC;               
            int squareC = (int) Math.pow(hyp, 2);
            int squareB = Bline*Bline;
            int squareA = Aline*Aline;
            isright = squareB+squareA == squareC;    
            return isright;
        }
        else if (sideB>sideA && sideA>sideC)
        {
            int hyp = sideB;
            int Aline = sideA;  
            int Bline = sideC;               
            int squareC = (int) Math.pow(hyp, 2);
            int squareB = Bline*Bline;
            int squareA = Aline*Aline;        
            isright = squareB+squareA == squareC;    
            return isright;
        }
        return false;
        
    }//End of method isright.
    
    
    /** Method istriangle
     *       Will determine if triangle contains a right angle triangle.
     * @return boolean
     */
    public boolean istriangle()
    {
        boolean istriangle;
        istriangle = sideA+sideB>sideC && sideA+sideC>sideB && sideC+sideB>sideA;          
        return istriangle;       
        
    }// End of Method istriangle.
    
}/// End of Class triangle.


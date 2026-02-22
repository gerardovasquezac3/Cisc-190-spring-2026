 
/**
 * Program to show imprecision.
 *@author Gerardo Vasquez, gerardovasquez@gmail.com
 *@ version v1.0
 * @since 02/14/2026
 */
public class Imprecision  
{
   public static void main (String[]arg){
       double x=12345.6789e200, y,z; 
       y=1/x;
       z=x*y; 
    System.out.println("The value of x is: "+ x);
    System.out.println("The value of y is: "+ y);
    System.out.println("The Value of z is: "+ z);
    System.out.println("The value of 1-z is:"+(1-z)); }
}//end Imprecision

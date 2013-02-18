/**
 * Class: CIST 2381 Mobile Applications Development
 * Semester: Spring 2011
 * Instructor: Dave Busse
 * Description: 
 * Date: 1/26/2011
 * @author James Vice
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently. 
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student. 
 *
 */
package unit02;

public class Discount2 {
	public static void main(String[] args){
		   int customerAge = 65;
		   boolean retired = true;
	      int discount;
	      int numDisc = 0;

	      // Change the if statement so that the age must be
			// greater than or equal to 65 and, the person
			// must be retired.
	      if((customerAge >= 65) && (retired)){  
	         discount = 10;
	         numDisc = numDisc + 1;
	      }else{
	         discount = 0;
	      }

	      System.out.print("Discount : " + discount);

		}
	}



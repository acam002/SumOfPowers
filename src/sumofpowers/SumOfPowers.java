/**
 *
 * @author Albert
 */

package sumofpowers;

import java.util.Scanner;

public class SumOfPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bitString = "";
        boolean begin = false;
        int num;
        
        // Prompt user for a number
        System.out.println("Please enter a number: ");
        num = in.nextInt();
        
        // Taking care of base case, zero
        if (num == 0) {
            System.out.println(num);
        }
        
        for (double i = 31; i >= 0; i--) { // Sum of powers algorithm
            if (Math.pow(2.0, i) <= num) { // Checking for the appropriate power of 2
                if (!begin) {// Bits will not be added to the bitstring until a 1 has been added to the bitstring
                
                    begin = true; // if begin hasn't been set to true then do so
                }
              
                bitString += "1"; // Begin adding to the bitstring with 1  
                num -= Math.pow(2.0, i); // Subtract the current number for the next binary digit
            }
            
            else if (begin) { // If a 1 has been added to the bitstring then 0's can be added
                bitString += "0";
            }
        }
        
        System.out.println("\n" + "Your converted number is: \n" + bitString + "\n"); // Print out the final result
    }
    
}

/*
 * Peter Horne-Deus
 * Calculates a list of hardcoded grades and their averages
 * ArraysGrades.java
 * October 25, 2018
 */

package arraysgrades;

import java.util.Scanner;

public class ArraysGrades {

   
    public static void main(String[] args) {
        //Creating a scanner
        Scanner keyedInput = new Scanner (System.in);
        
        //Variables and Arrays
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2,65.8,44.8,88.6};
        double total=0;
        double average;
        
        //Outputing list of grades
        System.out.println("These are the marks:");
        for (int i = 0; i<= 8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        for (int i = 0; i<=8; i= i + 1)
        {
            total = total + marks[i];
        }
        
        //Calcylations
        average = total/9;
        
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        //Output
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}


package studentgradetracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StudentGradeTracker
{
        public static void main(String args[]  )  
    {
         Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = sc.nextInt();
            grades.add(grade);
        }

        
        double average = calculateAverage(grades);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);
        
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        
        sc.close();
    }

    private static double calculateAverage(ArrayList<Integer> grades)
    {
        int sum = 0;
        for (int grade : grades) 
        {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    
    private static int findHighest(ArrayList<Integer> grades) 
    {
        return Collections.max(grades);
    }

    private static int findLowest(ArrayList<Integer> grades)
    {
        return Collections.min(grades);
    }
}
    
    

/*
 Zavier Jenkins
 Assigment 3A
 Due Date: March 30, 2017
 ZJ497481
 */

import javax.swing.JOptionPane;

public class Assignment3ptA {
  
  public static void main(String [] args) {
  
    int loopnum = 1;
    int jumpnum = 0;
    int jumpnum1 = 0;
    //Set up for project by defining variables and creating new scanner
    
    int dayNum = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of days"));
     // Ask user for the number of days in a period
     
     int firstTemp = Integer.parseInt(JOptionPane.showInputDialog("Enter the temperature on the first day."));
     // Ask user for the initial temperature
     
     System.out.println("Number of the days in the period: " + dayNum);
     System.out.println("Temperature on the first day: " + firstTemp);
  
     System.out.println("Day     Temp");
     while (loopnum < dayNum/2){
       System.out.println(loopnum + "     " + (firstTemp-(2*(loopnum - 1))) );
       loopnum = loopnum + 1;
       jumpnum = (firstTemp-(2*(loopnum - 1)));
       jumpnum1 = loopnum;
     }
     //Executes first half of weather pattern
 
     loopnum = 0;
     // Resets loopnum
     
     int x = dayNum % 2;
       
     while (loopnum <= ((dayNum/2)) + x){
       System.out.println((loopnum + jumpnum1)  + "     " + (jumpnum + loopnum) );
       loopnum = loopnum + 1;
     }
     //Executes other half of weather pattern
     
  }
} 

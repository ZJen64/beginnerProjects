import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Assignment2pt1Best {
  
  public static void main(String [] args) {
   
   int num1 = 0;
   int num2 = 0;
   int num3 = 0;
   int max = 0;
   int min = 0;
   int opnum;
   //String numa;
   //String numb;
   //String numc;
   String choose;
   // Declaration of variables^
   
 /*  
   numa = JOptionPane.showInputDialog("Insert a first number");
   numb = JOptionPane.showInputDialog("Insert a second number");
   numc = JOptionPane.showInputDialog("Insert a third number");
   num1 = Integer.parseInt(numa); 
   num2 = Integer.parseInt(numb); 
   num3 = Integer.parseInt(numc);
    // Ask for Name, Age of user, and changes age from string to int.
   */
   
  boolean valid = false;
  while (!valid) {
    try {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a first number"));
        if (num1 >= 0) valid = true;
    } catch (NumberFormatException e) {
        //error
        JFrame frame = new JFrame("JOptionPane showMessageDialog");
        JOptionPane.showMessageDialog(frame,"Error, not a number. Please try again.");
    }
}
 
 boolean valid2 = false;
 while (!valid2) {
    try {
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a second number"));
        if (num2 >= 0) valid2 = true;
    } catch (NumberFormatException e) {
        //error
      JFrame frame = new JFrame("JOptionPane showMessageDialog");
      JOptionPane.showMessageDialog(frame,"Error, not a number. Please try again.");
    }
}

 boolean  valid3 = false;
 while (!valid3) {
    try {
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter a third number"));
        if (num3 >= 0) valid3 = true;
    } catch (NumberFormatException e) {
        //error
        JFrame frame = new JFrame("JOptionPane showMessageDialog");
        JOptionPane.showMessageDialog(frame,"Error, not a number. Please try again.");
    }
}
 //Ask User for three numbers. Also checks if input is a number

   if (num1 > num2 && num1 > num3){
     max = num1;
   }
   
   if (num1 < num2 && num1 < num3){
     min = num1;
   }
   // check for num 1 as greatest integer 
   
   if (num2 > num1 && num2 > num3){
     max = num2;
   }  
   
   if (num2 < num1 && num2 < num3){
     min = num2;
   }  
   // check for num 2 as greatest integer  
   
   if (num3 > num1 && num3 > num2){
     max = num3;
   }
   
   if (num3 < num1 && num3 < num2){
     min = num3;
   }
   
   // check for num3 as greatest integer
  
   if (num1 == num2 && num2 == num3){
     max = num1;
     min = num1;
   }
   
   if (num1 == num2 && num2 > num3){
     max = num1;
     min = num3;
   }
   
   if (num2 == num3 && num2 > num1){
     max = num2;
     min = num1;
   }
   
    if (num1 == num3 && num3 > num2){
     max = num1;
     min = num2;
   }
   // check for equal greater integers  
    
   
   if (num1 == num2 && num2 < num3){
     max = num3;
     min = num1;
   }
   
   if (num2 == num3 && num2 < num1){
     max = num1;
     min = num2;
   }
   
    if (num1 == num3 && num3 < num2){
     max = num2;
     min = num3;
   }
    
   //check for equal smaller integers
   
   System.out.println("First Number: " + num1);
   System.out.println("Second Number: " + num2);
   System.out.println("Third Number: " + num3);
   //prints out the inputs given 
 
   choose = JOptionPane.showInputDialog("Enter 1 (for greatest) and 2 (for smallest)");
   opnum = Integer.parseInt(choose);
   //Ask user wether they want the program to print the greatest or smallest number given
   
   if (opnum == 1){ 
     System.out.println("The greatest of these three numbers is " + max);
   }
   
   if (opnum == 2){
     System.out.println("The smallest of these three numbers is " + min);
   }
   // Prints out the result 
   
  }
} 

import javax.swing.JOptionPane;

public class Assignment1B2 {
  
  public static void main(String [] args) {
   
   int num1;
   int num2;
   int num3;
   String first_name;
   String age;
   // Declaration of variables^
   
   first_name = JOptionPane.showInputDialog("What is your name?");
   age = JOptionPane.showInputDialog("What is your age?");
   int num = Integer.parseInt(age); 
   // Ask for Name, Age of user, and changes age from string to int.
   
   while (num > 999){
     age = JOptionPane.showInputDialog("Your age is too high. What is your age?");
     num = Integer.parseInt(age); 
   }
   //Checks the age provided
   
   num1 = (num-(num/10)*10);
   num2 = num/10-((num/100)*10);
   num3 = num/100-((num/1000)*10);
   // Changes the string provided from dialogue box into an Integer and add the digits
   
   
   System.out.println(num1);
   System.out.println(num2);
   System.out.println(num3);
 
  
   System.out.println("The sum of the digits in "+ (first_name)+"'s age is "+ (num1 + num2 + num3));
   // Prints out the result of person name and sum of digits^
  }
} 

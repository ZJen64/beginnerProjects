import java.util.Scanner;

public class Assignment1B {
  
  public static void main(String [] args) {
  
    Scanner input = new Scanner(System.in);
    
     System.out.println("Enter temperature (in fahrenheit)."); 
     double temp = input.nextInt(); 
     double celsius =  (5/9 * (temp - 32));
     System.out.println(celsius);
     input.close();
     
  }
} 

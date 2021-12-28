import java.util.Scanner;

public class factorial {
  
  public static void main(String [] args) {
  
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    int x = 1;
    int y = 0;
    int z = n;
    
    while(z > 0){
      x = x * (n - y);
      y = y + 1;
      z = z - 1;
    } 
    
    System.out.print(x);
     
  }
} 






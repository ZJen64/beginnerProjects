import javax.swing.JOptionPane;

public class Assignment2pt2Best {
  
  public static void main(String [] args) {
   
   int opnum;
   String first_name;
   String middle_name;
   String last_name;
   String word = "test";
   String choose;
   String first = "";
   String middle = "";
   String last = "";  
   String length = "";
   // Declaration of variables
   
   first_name = JOptionPane.showInputDialog("What is your first name?");
   middle_name = JOptionPane.showInputDialog("What is your middle name?");
   last_name = JOptionPane.showInputDialog("What is your last name?"); 
   // Ask for first name, middle name, and last name.
   
   choose = JOptionPane.showInputDialog("Enter ‘1’ for ascending alphabetical order and  ‘2’ for descending alphabetical order");
   opnum = Integer.parseInt(choose);
  //Ask users if they want to see their input in ascending or descending alphabetical order
  
   System.out.println("First Name: " + first_name);
   System.out.println("Middle Name: " + middle_name);
   System.out.println("Last Name: " + last_name);
   System.out.println("Sort order: " + opnum);
   //Shows the input of each option pane
   
   
   //**
   int compare1a = first_name.compareTo(middle_name); 
   int compare2a = first_name.compareTo(last_name); 
   if (compare1a < 0 && compare2a <0)  
   {  
     //System.out.println(first_name + " is larger");
     first = first_name;
     //System.out.println(first);
   }  
   else   
   {  
     if (compare1a > 0 && compare2a > 0)
     {
        //System.out.println(first_name + " is smaller"); 
        last = first_name;
        //System.out.println(last); 
     }
     else  
     {  
        //System.out.println("Words are equal");
        middle = first_name;
        //System.out.println(first);
     } 
   }
   // Compares the strings against first name
   
   
    
   int compare1b = last_name.compareTo(first_name); 
   int compare2b = last_name.compareTo(middle_name); 
   if (compare1b < 0 && compare2b <0)  
   {  
     //System.out.println( last_name + " is larger");
     first = last_name;
     //System.out.println(first);
   }  
   else   
   {  
     if (compare1b > 0 && compare2b > 0)
     {
        //System.out.println( last_name + " is smaller"); 
        last = last_name;
        //System.out.println(last); 
     }
     else  
     {  
        //System.out.println("Words are equal");
        middle = last_name;
        //System.out.println(middle);
     } 
   }
   // Compares the strings against last name
   
   
    
   int compare1c = middle_name.compareTo(first_name); 
   int compare2c = middle_name.compareTo(last_name); 
   if (compare1c < 0 && compare2c <0)  
   {  
     //System.out.println(middle_name + " is larger");
     first = middle_name;
     //System.out.println(first);
   }  
   else   
   {  
     if (compare1c > 0 && compare2c > 0)
     {
        //System.out.println(middle_name + " is smaller"); 
        last = middle_name;
        //System.out.println(last); 
     }
     else  
     {  
        //System.out.println("Words are equal");
        middle = middle_name;
        //System.out.println(middle);
     } 
   }
   // Compares the strings against middle name
   
   
   
   if (opnum == 1){ 
     //System.out.println("ascending alphabetical order");
     word = (first+ " " + middle + " " + last);
     
     if (word.length() < 20){
    length = " -OK";
   } else {
    length = " -Too long";
   }  
     
     System.out.println(first+ " " + middle + " " + last + length);
   }
   //prints out opnum 1 results: input in ascending order
   
   
   
   if (opnum == 2){
     //System.out.println("descending alphabetical order");
     word = (last + " " + middle + " " + first);
     
     if (word.length() < 20){
    length = " -OK";
   } else {
    length = " -Too long";
   }  
   
      System.out.println(last + " " + middle + " " + first + length);
   }
   // prints out opnum2 results: inputs in descending order
    
   
   
   /*Set<String> alphabetical = new TreeSet<String>();
    alphabetical.add(first_name);
    alphabetical.add(middle_name);
    alphabetical.add(last_name);

    System.out.println(alphabetical); */
   
  }
} 

public class TemperaturePattern {
  private int result;
  //final double pi = 3.14159;
  
  public void temperaturePattern() {
    result = 0;
  }
  
  
  public int findFinalDayTemperature(int day, int temp) {
    int x = 0;
    
    while (x < (day/2)) {
      result = (temp - (2*x));
        x = x +1;
    } 
    
   double y = ((day/2));
   
   if (day % 2 != 0){
    x = 4;
   } else{
   x = 3;
   }
   
    while (y < day && y >= day/2){
      result = ((temp-day) + x);
      y = y + 1;
      x = x + 1;
    }
    
    return(result);
    
  }
  
}
  
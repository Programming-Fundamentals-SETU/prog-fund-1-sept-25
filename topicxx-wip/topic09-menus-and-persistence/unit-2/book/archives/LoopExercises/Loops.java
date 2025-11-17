

public class Loops {
    
    String names[];
    int total = 0;

    public String simpleWhile() {

        String s="";
        int i = 1;
        while (i <= 10){
            if (i ==1)
                s +=  i;
            else
                s += ", " + i;
            i++;
        }
        return s;
    }
    
    public void sizeArray(int size){
        names = new String[size];
    }
    public boolean addName(String name){
        if(names.length > total){
            this.names[total] = name;
            total++;
            return true;
    }
    return false;
    }
    
    public String listNames(){
        String s = "";
        for(int i = 0; i<total; i++){
            s += names[i] + " ";
        }
        return s.toUpperCase();
    }
    
    public int findName(String name){
        for(int i = 0; i<total; i++){
            if(name.equalsIgnoreCase(names[i]))
            return i;
    }
    return -1;
}

public boolean containsOdd(){
      int numbers[] = {4,6,8,7,10,12};
           
      return containsOdd(numbers);
        
  }
  public boolean containsOdd(int numbers[]){
       
      boolean oddNumberInArray = false;
      
      for(int i = 0; i< numbers.length; i++)
      if (numbers[i] %2 == 1) {   //check if it is odd
         oddNumberInArray = true;
      }
      
      return oddNumberInArray;
        
  }
  
  public String printStars(int numStars){
      
        String s = "";
        for(int i = 0;i<numStars; i++){
            s+="*";
        }
        return s+"\n";
  }
}
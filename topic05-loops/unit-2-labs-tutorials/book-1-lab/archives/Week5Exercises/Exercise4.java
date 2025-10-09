public class Exercise4 {
    public static void main(String[] args) {
//Same solution as below but using a for loop

/*for (int i = 2; i <=10; i = i+2)
{
   System.out.println(i);
}*/


        int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;
        }
    
    
    
 /* Version using the mod(%) operator 
  
  int i = 2;
  while (i<=10){
      if (i % 2 == 0) 
       System.out.println(i);
      i++;
  }
 /*  */   
  }
}

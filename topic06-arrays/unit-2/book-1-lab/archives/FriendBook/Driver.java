
/**
 * This Driver manages a list of friends
 *
 * @author Mairead & Siobhan
 * @version Week 7
 */
public class Driver
{

    Person[] friends = new Person[20];
    int size;
    
    
    public static void main(String[] args) {
        new Driver();
    }
        
    Driver(){ 
        // 'manually add some friends'
        friends[0] = new Person("Joe", "Bloggs", 21);
        friends[1] = new Person("Anne", "Meagher", 23);
        friends[2] = new Person("Rob", "O Connnor", 25);       
        size = 3;
        printFriends();   // directly prints from method
        System.out.println(listOfFriends()); // prints the returned string
    }
    
    public void printFriends(){
        if (size == 0) System.out.println("Sorry no friends");
        else{
          for (int i = 0; i<size; i++){
           friends[i].printFirstName();
           friends[i].printSecondName();
         }
       }
    }
    
    public String listOfFriends(){
        if (size == 0) return "Sorry no friends";
        String listOfStudents = "List of friends \n";
        for (int i = 0; i < size; i++)
          listOfStudents  += friends[i].getFirstName() + "  " + friends[i].getSecondName() + "\n";
          
        return listOfStudents;
       }
}

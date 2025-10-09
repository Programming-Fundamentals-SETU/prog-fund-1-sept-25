
/**
 * Write a description of class Person here.
 *
 * @author Mairead & Siobhan
 * @version Week 3
 */
public class Person
{
    //Exercise 1 - declare fields for Percon
    private int age; //your age

    private String firstName; //- your first name. It should be a String.

    private String secondName; //- your last name. It should be a String.

    private float temperature; //- today’s temperature (non-integer)

    //Exercise 2 - Constructor
    public Person(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.temperature = 13.2f;   // we need to give this a value so hard code it.
    }
    
    //Exercise 3 - getters and setters
    
    public int getAge(){ 
        return age;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getSecondName(){
        return secondName;
    }

    public float getTemperature(){
        return temperature;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
     public void setSecondName(String firstName){
        this.secondName = secondName;
    }
    
    public void setTemperature(float temperature){
        this.temperature = temperature;
    }
    
//Exercise 4 - Methods
    public void printAge(){
        System.out.println("My age is : " + age);
    }
    
    public void printFirstName(){
        System.out.println("My first name  is : " + firstName);
    }
    public void printFullName(){
        System.out.println("My full name  is : " + firstName + "  " + secondName);
    }
    public void printTemperature(){
        System.out.println("Today's temperature is  : " + temperature);
    }
    //Exercise 5 - happyBirthday
    
    public int happyBirthday() {
     int oldAge = this.age;
     this.age = this.age + 1;
     return oldAge;
    }
    //Exercise 6 - Write main method (this should  be at the top but leaving it here for continuity) 
    public static void main(String[] args) {
        Person me = new Person("Joe", "Bloggs", 31);
        
        me.printFullName();
        me.printAge();
        
        System.out.println("Happy Birthday! You were " + me.happyBirthday() + 
        " years old. Now you are " +  me.getAge());
    
      
    }
}


/**
 * Write a description of class Person here.
 * @author Mairead & Siobhan @version Week 7
 */
public class Person
{
    private int age;
    /* your age*/
    private String firstName;
    /* - first name. It should be a String.*/
    private String secondName;
    /* - last name. It should be a String.*/
    private float temperature;

    /* - today’s temperature (non-integer) Constructor*/

    /**
     * 
     */
    public Person(String firstName, String secondName, int age)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.temperature = 13.2f;
    }

    /* getters and setters*/

    /**
     * 
     */
    public int getAge()
    {
        return age;
    }

    /**
     * 
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * 
     */
    public String getSecondName()
    {
        return secondName;
    }

    /**
     * 
     */
    public float getTemperature()
    {
        return temperature;
    }

    /**
     * 
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * 
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * 
     */
    public void setSecondName(String firstName)
    {
        this.secondName = secondName;
    }

    /**
     * 
     */
    public void setTemperature(float temperature)
    {
        this.temperature = temperature;
    }

    /* Methods*/

    /**
     * 
     */
    public void printAge()
    {
        System.out.println("Age is : " + age);
    }

    /**
     * 
     */
    public void printFirstName()
    {
        System.out.println("First name is : " + firstName);
    }

    public void printSecondName()
    {
        System.out.println("Second name is : " + secondName);
    }
    /**
     * 
     */
    public void printFullName()
    {
        System.out.println("Full name is : " + firstName + " " + secondName);
    }

    /**
     * 
     */
    public void printTemperature()
    {
        System.out.println("Today's temperature is : " + temperature);
    }

    /* happyBirthday*/

    /**
     * 
     */
    public int happyBirthday()
    {
        int oldAge = this.age;
        this.age = this.age + 1;
        return oldAge;
    }
    

}

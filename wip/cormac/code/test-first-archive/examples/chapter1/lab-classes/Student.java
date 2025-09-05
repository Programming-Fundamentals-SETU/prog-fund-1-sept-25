public class Student
{
    private String name;
    private final String id;
    private int credits;

    Student(final String name, final String id)
    {
        this.name = name;
        this.id = id;
        this.credits = 0;
        return;
    }

    String getName()
    {
        return this.name;
    }

    void changeName(final String replacementName)
    {
        this.name = replacementName;
        return;
    }


    String getStudentID()
    {
        return this.id;
    }

    public void addCredits(final int additionalPoints)
    {
        this.credits += additionalPoints;
        return;
    }

    public int getCredits()
    {
        return this.credits;
    }
    
}

import java.util.*;

/**
 * The LabClass class represents an enrolment list for one lab class. It stores
 * the time, room and participants of the lab, as well as the instructor's name.
 * 
 * @author Michael Kolling and David Barnes
 * @version 7
 */
public class LabClass
{
    private Instructor instructor;
    private String room;
    private String timeAndDay;
    private List<Student> students;
    private int capacity;
    
    /**
     * Create a LabClass with a maximum number of enrolments. All other details
     * are set to default values.
     */
    public LabClass(int maxNumberOfStudents)
    {
        instructor = null;
        room = "unknown";
        timeAndDay = "unknown";
        students = new ArrayList<>();
        capacity = maxNumberOfStudents;
    }

    /**
     * Add a student to this LabClass.
     */
    public void enrollStudent(Student newStudent)
    {
        if(students.size() == capacity) {
            System.out.println("The class is full, you cannot enrol.");
        }
        else {
            students.add(newStudent);
        }
    }
    
    /**
     * Return the number of students currently enrolled in this LabClass.
     */
    public int numberOfStudents()
    {
        return students.size();
    }
    
    /**
     * Set the room number for this LabClass.
     */
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }
    
    /**
     * Set the time for this LabClass. The parameter should define the day
     * and the time of day, such as "Friday, 10am".
     */
    public void setTime(String timeAndDayString)
    {
        timeAndDay = timeAndDayString;
    }
    
    /**
     * Set the name of the instructor for this LabClass.
     */
    public void setInstructor(Instructor instructor)
    {
        this.instructor = instructor;
    }
    
    /**
     * Print out a class list with other LabClass details to the standard
     * terminal.
     */
    public void printList()
    {
        System.out.println("Lab class " + timeAndDay);
        if(instructor != null) {
            System.out.println("Instructor: " + instructor.getName());
        } else {
            System.out.println("Instructor: unknown");
        }
        System.out.println("Room: " + room);
        System.out.println("Class list:");
        Iterator<Student> i = students.iterator();
        while(i.hasNext()) {
            Student student = i.next();
            student.print();
        }
        System.out.println("Number of students: " + numberOfStudents());
    }
}

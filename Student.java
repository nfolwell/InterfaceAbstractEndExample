public class Student implements Comparable {
    private String name;
    private int OSIS;
    private double gpa;

    public Student(String name, int OSIS, double gpa)
    {
        this.name = name;
        this.OSIS = OSIS;
        this.gpa = gpa;
    }

    @Override
    public String toString()
    {
        return name + " " + OSIS + " " + gpa;
    }

    // implement interface method
    public int compareTo(Object other)
    {
        Student safe = (Student) other;
        if (this.gpa < safe.gpa)
        {
            return 1;
        }
        else if (this.gpa > safe.gpa)
        {
            return -1;
        }
        return 0;
    }
}

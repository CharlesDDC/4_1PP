public class GoodStudent {
    //instance variables
    private String firstName;
    private String lastName;
    private String idNumber;
    private double GPA;
    private boolean csStudent;
    // Constructors
    public GoodStudent(String firstName, String lastName, String idNumber, double GPA, boolean csStudent)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.GPA = GPA;
        this.csStudent = csStudent;
    }
    public GoodStudent(String firstName, String lastName, String idNumber, double GPA)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.GPA = GPA;
        this.csStudent = false;
    }
    public GoodStudent(String firstName, String lastName, String idNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.GPA = 0.00;
        this.csStudent = csStudent;
    }
    //Getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getIdNumber()
    {
        return idNumber;
    }
    public double getGPA()
    {
        return GPA;
    }
    public boolean getcsStudent()
    {
        return csStudent;
    }

    //Setters
    public void setIdNumber(String newIdNumber)
    {
        idNumber = newIdNumber;
    }
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    public void setGPA(double newGPA)
    {
        GPA = newGPA;
    }
    public void setCsStudent(boolean newCsStudent)
    {
        csStudent = newCsStudent;
    }

    //Brain Methods
    public String CreateId()
    {
        String output = "";
        String firstLetter = firstName.substring(0,1);
        String lastThreeID = idNumber.substring(3,6);
        output = "ID: " + firstLetter + lastName + lastThreeID;
        return output;
    }

    public double CSGPA(){
        double boostedGPA;
        if (csStudent)
        {
            boostedGPA = (GPA * .15) + GPA;
        }
        else
        {
            return GPA;
        }
        return boostedGPA;
    }

    public String toString()
    {
        String output = "Name: " + firstName + " " +  lastName +" "+ idNumber;
        return output;
    }
}




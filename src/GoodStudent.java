public class GoodStudent
{
    //6 Instance Variables:
    private String firstName = "";
    private String lastName = "";
    private double gpa;
    private int idNum;
    private boolean csStudent;
    private String digitalID = "";


    //The three Constructors:
    public GoodStudent()
    {
        String firstName = "";
        String lastName = "";
        double gpa = 0;
        int idNum = 0;
        boolean csStudent = false;
    }

    public GoodStudent(String firstName, String lastName, int idNum, double gpa, boolean csStudent)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.idNum = idNum;
        this.csStudent = csStudent;

    }

    public GoodStudent(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = 0;
        this.idNum = 0;
        this.csStudent = false;
    }

    //getters
    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public double getGpa() { return this.gpa; }

    public int getIdNum()
    {
        return this.idNum;
    }

    public boolean getCsStudent()
    {
        return this.csStudent;
    }


    //Setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public int setIdNum(int idNum)
    {
        this.idNum = idNum;

        return idNum;
    }

    public void setCsStudent(boolean csStudent)
    {
        this.csStudent = csStudent;

    }


    //toString
    public String toString()
    {
        String output = "";
        output += "\nFirst Name: " + firstName;
        output += "\nLast Name: " + lastName;
        output += "\nID Number: " + idNum;
        output += "\nGPA: " + gpa;
        output += "\nCS Student: " + csStudent;
        return output;
    }


    //Brain Methods
    //comprised of first initial, last name and last three of ID

    public String CreateID()
    {

        digitalID = firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
                + idNum % 1000;
        //cut out the last 3 numbers
        this.digitalID = digitalID;
        return digitalID;
    }

    public double CSGPA()
    {
        if(csStudent == true)
        {
            double newGPA = (int)(gpa * 115);
            return newGPA/100;
        }

        return gpa;
    }

    public String csstudentD()
    {
        if(csStudent == true)
        {
            System.out.println("\nCS GPA: "  + CSGPA());
        }

        else if (csStudent == false)
        {
            System.out.println("\nCS GPA: Not CS Student");
        }

        return "";
    }



}

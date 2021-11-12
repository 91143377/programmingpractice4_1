public class GoodStudentDriver
{
    public static void main (String[] args)
    {
        //Alan Turing, 191254, 3.56, Yes
        //Florence Nightingale, 182010, 3.89, No
        //Grace Hopper, 190692, 3.99, Yes
        GoodStudent student1 = new GoodStudent
                ("Alan", "Turing", 191254, 3.56 , true);

        GoodStudent student2 = new GoodStudent
                ("Florence", "Nightingale",182010 , 3.89, false);

        GoodStudent student3 = new GoodStudent
                ("Grace", "Hopper", 190692, 3.99, true);

        //Next comments just show complete program
        //System.out.println
           //     (student1 + "\nCS Student GPA: " + student1.CSGPA()+ "\nDigital ID: " + student1.CreateID());

        //System.out.println
          //      (student2 + "\nCS Student GPA: " + student2.CSGPA()+ "\nDigital ID: " + student2.CreateID());

        //System.out.println
          //      (student3 + "\nCS Student GPA: " + student3.CSGPA()+ "\nDigital ID: " + student3.CreateID());

        System.out.println("Student: " + student2.getFirstName() + "\nStudent ID #: " +
                student2.setIdNum(925366) +"\nStudent GPA: " + student2.getGpa() + "\nDigital ID: " +
                student2.CreateID() + student2.csstudentD());


        System.out.println("Student First Name: " + student3.getFirstName() + "\nCS Status: " + student3.getCsStudent()
                + "\nDigital ID: " + student3.CreateID() + student3.csstudentD());

        System.out.println(student1.csstudentD() + student1.toString() + "\nDigital ID: " + student1.CreateID());

    }



}

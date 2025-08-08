package oops.encapsulation.Example;


public class Student
{
    Integer id;
    public String getId()
    {
        return String.valueOf(id); // String valueOf() method converts from int to String. It converts int to String, long to String, boolean to String, character to String, float to String, double to String.
    }
    public void setId(String id)
    {
        this.id = Integer.parseInt(id); // Integer parseInt() method converts String into integer.
    }
}
class EncapsulationTest{
    public static void main(String[] args)
    {
        Student st = new Student();
        st.setId("2");
        System.out.println("Student ID: " +st.getId());
    }
}


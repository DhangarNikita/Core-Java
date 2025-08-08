package oops.inheritance.Multilevel;

public class University {
    String universityName;
    String location;

    void setUniversityDetails(String u,String l){
        universityName=u;
        location= l;
    }
    void displayUniversityDetails(){
        System.out.println("University Name is : "+universityName);
        System.out.println("university location is : "+location);
    }
}

class Department extends University{
    String deptName;
    String hodName;

    void setDepartmentDetails(String u,String l,String d, String h){
        universityName=u;
        location= l;
        deptName= d;
        hodName= h;
    }

    void displayDepartmentDetails(){
        displayUniversityDetails();
        System.out.println("Department is : "+deptName);
        System.out.println("Hod name is : "+hodName);
    }
}

class Student extends Department{
    String studentName;
    int rollNo;

    void setStudentDetails(String u,String l,String d, String h,String s, int r){
        universityName=u;
        location= l;
        deptName= d;
        hodName= h;
        studentName = s;
        rollNo = r;
    }

    void displayStudentDetails(){
        displayDepartmentDetails();
        System.out.println("Student Name is : "+studentName);
        System.out.println("Roll No is : "+rollNo);
    }
}

class Display extends Student{
    public static void main(String[] args) {
        Display dp = new Display();
        dp.setStudentDetails( "Viit", "Pune", "E&TC", "Sneha", "Nikita", 21);
        dp.displayStudentDetails();
    }
}
package Static;
// use of static variable.
public class Profile {
    String name;
    int id;
    static String company="VIIT" ;

    Profile( String n,int i){
        this.name=n;
        this.id=i;
    }
    void display(){
        System.out.println("Employee Name is: "+name);
        System.out.println("Employee Id is: "+id);
        System.out.println("Employee Company Name is: "+company);
    }

    public static void main(String[] args) {
        Profile pr = new Profile("Nikita Dhangar",105);
        pr.display();
        Profile pr1 = new Profile("Ruchita Dhangar",101);
        pr1.display();

    }
}

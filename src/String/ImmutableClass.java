package String;
import java.util.ArrayList;
import java.util.List;

final class Employee {
    private final String empName;
    private final int age;
    private final Address address;

    public Employee(String name, int age, Address address) {
        super();
        this.empName = name;
        this.age = age;
        this.address = address;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address("street 1", "city X");

        // Declare the employee
        Employee e = new Employee("John", 23, address);

        System.out.println("Original Employee object is "+e);

        //address.setCity("Pune City");

        System.out.println("After modifying address of Employee object value of Employee is "+e);
    }
}


final class Address {

    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

   /*  public void setStreet(String street) {
         this.street = street;
     }

     public void setCity(String city) {
         this.city = city;
     }*/

    @Override
    public String toString() {
        return "{Street: " + street + ", City: " + city + "}";
    }

}


public final class ImmutableClass  {

    //primitive data types  => Immutable or Mutable?

    //Immutable class
    private final int id;
    private final String name;

    private final List<String> items;    //Mutable object

    public ImmutableClass(int id, String name, List<String> items) {
        this.id = id;
        this.name = name;
        // this.items = items;   //we should not directly pass it
        this.items = new ArrayList<>(items); // Deep copy of mutable object
    }

    public List<String> getItems() {
        return new ArrayList<>(items); // Return a copy of the List
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

package Oops.Encapsulation.GetterSetter;

//we will define only the getter method to read the value of the private variable and make it read-only.
// We will declare a constructor to initialize the value of the variable.

public class OnlyGetter {
    private String name;
    private int id;
    private String company;

    OnlyGetter(String n,int i,String c){
        this.name=n;
        this.id=i;
        this.company=c;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }
}

class DisplayTest{
    public static void main(String[] args) {
        OnlyGetter og = new OnlyGetter("Nikita",101,"VIIT");

        String n=og.getName();
        String c= og.getCompany();
        int i=og.getId();
        System.out.println(n);
        System.out.println(c);
        System.out.println(i);
    }
}
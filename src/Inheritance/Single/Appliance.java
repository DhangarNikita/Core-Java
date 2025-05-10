package Inheritance.Single;

public class Appliance {
    String brand;
    int power;
    String warranty;

   /* void setApplianceDetails(String brand1,int power1,String warranty1){
        brand = brand1;
        power =  power1;
        warranty = warranty1;
    }*/
    /*
    it's not necessary to write or use this method in your current program — because we already setting all the
    inherited fields (brand, power, warranty) directly inside the setWashingMachineDetails() method of the WashingMachine class.
     */
    void displayApplianceDetails(){
        System.out.println("Application brand is : "+brand );
        System.out.println("Application power is : "+power);
        System.out.println("Application warranty is: "+warranty);
    }
}

class WashingMachine extends Appliance{
    String type;
    double capacity;

    void setWashingMachineDetails(String b, int p, String w, String t, double c){
        brand = b;
        power =  p;
        warranty = w;
        type = t;
        capacity = c;

    }
    void displayWashingMachineDetails(){
        displayApplianceDetails();
        System.out.println("Application Type is : "+type);
        System.out.println("Application capacity is : "+capacity);
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.setWashingMachineDetails("LG",100,"5 year","Washing Machine",7.5);
        wm.displayWashingMachineDetails();
    }
}
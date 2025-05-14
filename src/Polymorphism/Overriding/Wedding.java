package Polymorphism.Overriding;

public class Wedding {
    void marryDate(){
        System.out.println("Marry date is 27 may 2025");
    }

    void engagementDate(){
        System.out.println("Engagement date is 25 may");
    }
}

class Reschedule extends Wedding{
    @Override
    void engagementDate(){
        System.out.println("Engagement date is 26 may");
    }

    public static void main(String[] args) {
        Wedding wd =new Reschedule();
        wd.engagementDate();
        wd.marryDate();
    }
}
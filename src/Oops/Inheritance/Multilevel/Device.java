package Oops.Inheritance.Multilevel;


public class Device {
    String brand;
    String type;

    void setDeviceDetails(String b, String t) {
        brand = b;
        type = t;
    }

    void displayDeviceDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}


class Mobile extends Device {
    int batteryCapacity;
    double screenSize;

    void setMobileDetails(String b, String t, int battery, double screen) {
        brand = b;
        type = t;
        batteryCapacity = battery;
        screenSize = screen;
    }

    void displayMobileDetails() {
        displayDeviceDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}


class SmartPhone extends Mobile {
    String osVersion;
    int ramSize;

    void setSmartPhoneDetails(String b, String t, int battery, double screen, String os, int ram) {
        brand = b;
        type = t;
        batteryCapacity = battery;
        screenSize = screen;
        osVersion = os;
        ramSize = ram;
    }

    void displaySmartPhoneDetails() {
        displayMobileDetails();
        System.out.println("OS Version: " + osVersion);
        System.out.println("RAM Size: " + ramSize + " GB");
    }

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.setSmartPhoneDetails("Samsung", "Electronic", 5000, 6.5, "Android 13", 8);
        sp.displaySmartPhoneDetails();
    }
}


package Polymorphism.Overloading;

public class Addition {

    int add(int a,int b){
        int c=a+b;
        System.out.println("int,int");
        return c;

    }

    int add(int a,int b, int c){    // rule 1 same name with different parameters
        int d=a+b+c;
        System.out.println("int,int,int");
        return d;
    }

    long add(int a, long b, int c){   // same method name but different data type
        long d=a+b+c;
        System.out.println("int,long,int");
        return d;
        }
    long add(long a, int b, int c){   // same method name but different order of parameter
        long d=a+b+c;
        System.out.println("long,int,int");
        return d;
    }

    public static void main(String[] args){
        Addition ad = new Addition();
        System.out.println(ad.add(2, 3));             // Calls method 1
        System.out.println(ad.add(2, 3, 4));          // Calls method 2
        System.out.println(ad.add(2, 3L, 4));         // Calls method 3
        System.out.println(ad.add(2L, 3, 4));         // Calls method 4

    }


}

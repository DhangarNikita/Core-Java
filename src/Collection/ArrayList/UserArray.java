package collection.arraylist;

import java.util.ArrayList;

public class UserArray {
    int id;
    String name;
    int rollNo;

    UserArray(int id,String name,int rollNo){
        this.id=id;
        this.name = name;
        this.rollNo = rollNo;
    }
}

class UserData{
    ArrayList<UserArray> userData(){
        UserArray ua1= new UserArray(1,"Nikita",20);
        UserArray ua2= new UserArray(2,"Sneha",30);
        UserArray ua3= new UserArray(3,"Ruchita",40);

        ArrayList<UserArray> list =new ArrayList<>();
        list.add(ua1);
        list.add(ua2);
        list.add(ua3);

        return list;
    }
}

class Retriveser{
    public static void main(String[] args){
        UserData ud = new UserData();
        ArrayList<UserArray> userlist =ud.userData();

        for(UserArray arr:userlist ){
            System.out.println("Student's name: " +arr.name);
            System.out.println("Student ID " +arr.id);
            System.out.println("Roll number: " +arr.rollNo);
            System.out.println();
        }
    }
}

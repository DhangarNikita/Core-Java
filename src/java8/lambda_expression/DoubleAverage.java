package java8.lambda_expression;
//Write a Java program to implement a lambda expression to find the average of a list of doubles.

import java.util.ArrayList;
import java.util.List;

interface Double{
    void average(List<Integer> list);
}
public class DoubleAverage {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Double d =(list2)->{
            int ave=0;
            int sum=0;
            for(Integer num: list){
                sum+=num;
            }
            if(list2.isEmpty()){
                System.out.println("sorry list is empty");
            }else{
                ave=sum/list2.size();
            }
            System.out.println("Average of double is : "+ave);

        };
        d.average(list);
    }
}

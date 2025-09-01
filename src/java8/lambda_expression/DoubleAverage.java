package java8.lambda_expression;
//Write a Java program to implement a lambda expression to find the average of a list of doubles.

import java.util.ArrayList;
import java.util.List;

interface DoubleAvg{
    void average(List<Double> list);
}
public class DoubleAverage {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.00);
        list.add(20.00);
        list.add(30.00);
        list.add(40.00);

        DoubleAvg d =(list2)->{
            double ave = 0;
            double sum = 0;
            for(Double num: list){
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

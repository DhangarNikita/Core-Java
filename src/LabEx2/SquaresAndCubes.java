package LabEx2;
// Write a program to find out squares and cubes from 1- 10 numbers?
public class SquaresAndCubes {
    public static void main(String[] args) {
        for(int i=1; i<=10;i++){
            int square= i*i;

            int cube= i*i*i;
            System.out.println("square of "+i +" is "+ square +" and " +"cube is "+ cube);
        }
    }


}

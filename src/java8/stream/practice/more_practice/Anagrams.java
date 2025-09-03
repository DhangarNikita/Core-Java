package java8.stream.practice.more_practice;
//12) Java 8 program to check if two strings are anagrams or not?
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Stream.of(s1.split("")).map(e->e.toUpperCase()).sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(e->e.toUpperCase()).sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.joining());
        if(s1.equals(s2)&&s1.length()==s2.length()){
            System.out.println("Both the strings are anagrams");
        }else{
            System.out.println("Strings are not anagrams");
        }

    }
}

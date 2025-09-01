package java8.stream.practice;
/*
Remove duplicates ()
Filter names whose length is greater than 5
Skip the first one
Limit the output to 2 names only
Print the result*/

import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nikita", "Ruchita", "Sneha", "Nikita", "Krishika", "Ruchita", "Riya");
        names.stream().
                distinct().
                filter(name->name.length()>5).
                skip(1).
                limit(2).
                forEach(element-> System.out.println(element));

    }
}

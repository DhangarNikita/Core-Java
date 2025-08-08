package string.programs;

public class ObjectCreationProof {
        public static void main(String[] args) {
            String s1 = "Java";
            String s2 = new String("Java");

            System.out.println(System.identityHashCode(s1)); //refers scp
            System.out.println(System.identityHashCode("Java")); //refers scp

            System.out.println(System.identityHashCode("Java")); //refers scp
            System.out.println(System.identityHashCode(s2)); // refers heap

//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));
        }
    }


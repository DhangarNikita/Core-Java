package Demo;

public class StringEqual {
    public static void main(String[] args) {
     /*   String s1 = "dfg";
        String s2 = "asd";
        s2="dfg";

        *//*boolean b = s1==s2;
        System.out.println(b);

        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
*//*
        System.out.println(s2);
        s2="Acv"+10;
        System.out.println(s2);

        System.out.println('s'+'v'+"g");
        System.out.println("s"+'v'+"g");
        System.out.println('s'+"v"+"g");

        String v = new String("Nikita");

        v.intern();

        String sv="Nikita";
        System.out.println(v==sv);
*/

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Nikita");

        System.out.println(sb.capacity());

        StringBuilder sd = new StringBuilder();
        System.out.println(sd.capacity());
        sd.append("Nikita");
        System.out.println(sd.capacity());

        StringBuffer sb1 = new StringBuffer("Nikita");
        System.out.println(sb1.capacity());


    }
}

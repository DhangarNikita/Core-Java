package Static;

public class Student {
    static int rollNo =14;
    int t=10;
    public static void main(String[]args){
        Student st = new Student();
        rollNo= st.t;

        int x= rollNo;

        System.out.println(x);
        System.out.println(rollNo);
    }
}

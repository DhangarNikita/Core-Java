package String.Programs;


public class StringReverse {

    public static void main(String[] args) {
        String s = "abcd";   //length 4    0 3
        //a b c d
        //0 1 2 3
        //dcba

        //String is array characters

        char[] charArray = s.toCharArray();
        String result = "";
        //charAt()
        /*for(int i = charArray.length - 1; i >= 0; i--){
            result  = result + charArray[i];
        }*/

       /* for(int i = charArray.length - 1; i >= 0; i--){
            result  = result + s.charAt(i);
        }*/

        for(int i = 0; i < s.length(); i++){
            result  = s.charAt(i) + result;   //dcba
        }

        System.out.println("Result is "+result);  //dcba

    }
}

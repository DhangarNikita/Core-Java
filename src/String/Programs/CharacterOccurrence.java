package String.Programs;
// program counts how many times each character appears in the string

public class CharacterOccurrence {
    public static void main(String[] args) {
        String str ="Nikita";
        boolean[] duplicate = new boolean[str.length()];  //{False,False,False,False}
        for(int i= 0; i< str.length(); i++){
            int count =0;
            if (duplicate[i] || str.charAt(i) == ' ')
            {
                continue;
            }
            for(int j=0; j< str.length(); j++){
                if(str.charAt(i)== str.charAt(j)){
                    duplicate[j] = true;
                    count++;
                }
            }
            System.out.println(str.charAt(i) +" occurred: " +count +" time");
            count =0;
        }
    }
}

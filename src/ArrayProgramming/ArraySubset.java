package arrayprogramming;
// print array in subset
public class ArraySubset {
    public static void main(String[] args) {
        int [] arr={1,2,3};                 // array declaration


        for(int i=0;i<arr.length; i++){
            String subset=" ";
            for(int j=i; j<arr.length; j++){
                subset+= arr[j];
                System.out.println(subset);
            }
        }
    }
}


/*
When i = 0 (starting at 1):
subset = ""
j = 0 → subset += 1 → subset = "1" → print 1
j = 1 → subset += 2 → subset = "12" → print 12
j = 2 → subset += 3 → subset = "123" → print 123

When i = 1 (starting at 2):
subset = ""
j = 1 → subset += 2 → subset = "2" → print 2
j = 2 → subset += 3 → subset = "23" → print 23

When i = 2 (starting at 3):
subset = ""
j = 2 → subset += 3 → subset = "3" → print 3

 */
package Lab.LabEx2;
public class ReverseNumber {

    public static void main(String[] args) {
        int row =5;
        for(int i=1;i<=row; i++){
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */
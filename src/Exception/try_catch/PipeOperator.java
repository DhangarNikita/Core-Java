package exception.try_catch;

// to replace multiple catch block we use pipe operator
public class PipeOperator {
    public static void main(String[] args){
        try{
            int a=10, b=0,c;
            c=a/b;
        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }
    }
}
/*
catch (IOException | SQLException e)  // Both are checked → allowed
catch (NullPointerException | ArithmeticException e)  // Both are unchecked → allowed
catch (IOException | NullPointerException e)  // Mixed (checked + unchecked) → allowed if try contains both exception then it allow otherwise only one exception handling is allow
catch (IOException | Exception e)  // ❌ Not allowed (Exception is super of IOException)
catch (NullPointerException | RuntimeException e) // ❌ RuntimeException is super of NullPointerException

 */
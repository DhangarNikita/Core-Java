package Exception.TryWithResource;

public class CustomTryWithResource implements AutoCloseable{
   public static void main(String[] args){
       try(CustomTryWithResource ct =new CustomTryWithResource()){
           ct.m1();
       }catch(Exception e){
           System.out.println("Exception Occurred");
           e.printStackTrace();
       }
   }

   void m1(){
       System.out.println("Demo Method");
   }
    @Override
    public void close() throws Exception {
        System.out.println("Closed Resource");
    }
}

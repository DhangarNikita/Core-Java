package fow_control;

/*
It's raining or not ? if not then do not plan any trek
If it's raining then check whether it'd sat or not
if it's  sat then we go for trek else we need  to work on office tasks.
 */
public class UsingNestedIf {
    public static void main(String[] args){
        boolean isItRaining = true;
        String day = "sat";

        if(isItRaining){
            if(day.equals("sat")){
                System.out.print("We go for trek because it's Saturday and raining.");
            } else {
                System.out.print("We need to work on office tasks because it's not Saturday.");
            }
        } else {
            System.out.print("Do not plan any trek because it's not raining.");
        }
    }
}
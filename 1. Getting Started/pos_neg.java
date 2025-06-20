import java.util.*;
class pos_neg{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num = s.nextInt();

        if(num<0){
            System.out.println("Number is Negative!!");
        }
        else if(num>0){
            System.out.println("Number is Positive!!");
        }
        else{
            System.out.println("Number is Zero!!");
        }
    }
}
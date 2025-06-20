import java.util.*;
class first_n_Number{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();

        int sum = 0;
        for(int i=1;i<=num;i++){
            sum +=i;
        }
        System.out.println("Addition from 1 to "+num+" is "+sum);
    }
}
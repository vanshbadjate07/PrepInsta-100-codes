import java.util.*;
class sum_in_range{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Starting point: ");
        int a = s.nextInt();

        System.out.println("Enter Ending point: ");
        int b = s.nextInt();

        int sum = 0;
        for(int i = a; i<=b;i++){
            sum += i;
        }
        System.out.println("Addition from "+a+" to "+b+" is "+sum);
    }
}
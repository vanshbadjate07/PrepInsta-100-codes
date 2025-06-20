import java.util.*;
class even_odd{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number to find Even or Odd:");
        int num=s.nextInt();

        if(num%2==0){
            System.out.println(num+" is Even");
        }
        else{
            System.out.println(num+" is odd");
        }
    }
}
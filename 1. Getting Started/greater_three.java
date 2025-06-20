import java.util.*;
class greater_three{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1st Number:");
        int num1 = s.nextInt();

        System.out.println("Enter 2nd Number:");
        int num2 = s.nextInt();

        System.out.println("Enter 3rd Number:");
        int num3 = s.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1+" is Greater!!");
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2+" is Greater!!");
        }
        else if(num3 >= num1 && num3 >= num2){
            System.out.println(num3+" is Greater!!");
        }
    }
}
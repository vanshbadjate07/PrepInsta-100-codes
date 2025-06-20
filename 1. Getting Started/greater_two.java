import java.util.*;
class greater_two{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enetr First number: ");
        int num1 = s.nextInt();

        System.out.println("Enetr Second number: ");
        int num2 = s.nextInt();

        if(num1 == num2){
            System.out.println("Both Numbers are equal!");
        }
        else if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else{
            System.out.println(num2+" is greater than "+num1);
        }
    }
}
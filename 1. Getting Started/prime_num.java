import java.util.*;
class prime_num{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter A Number: ");
        int num = s.nextInt();

        if(num<2){
            System.out.println(num+ " IS not prime!!");
        }
        else if(num>=2){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println(num+ " is not a prime!!");
                    return;
                }
            }
            System.out.println(num+" is prime!!");
        }
    }
}
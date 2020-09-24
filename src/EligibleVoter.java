import java.util.Scanner;

public class EligibleVoter {

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter your age");

        int age1=sc.nextInt();

        if (age1>=18){
            System.out.println("The person is eligible to vote");//positive result
        }else{
            System.out.println("The person is not eligible to vote");  //negetive result
        }
    }
}

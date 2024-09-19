import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("WELLCOME TO ONLINE BANKING Application");
        System.out.println("Enter your Name: ");
        String name= sc.nextLine();
        System.out.println("Enter Your Account number: ");
        float acc_num= sc.nextFloat();
        System.out.println("Enter your Current Balance");
          Double acc_baa= sc.nextDouble();

        System.out.println("Which Type of Banking Operation You want to perform??");

        while(true){
            System.out.println("\n1-Deposite \n2-Withdraw \n3-Checking Balance \n4-Exit");
            int input= sc.nextInt();
            if(input==1){
                System.out.println("How much money you want to Deposite");
                double depo= sc.nextDouble();
                acc_baa=acc_baa+depo;
            } else if (input==2) {
                System.out.println("How much money you want to Withdraw");
                double with= sc.nextDouble();
                acc_baa=acc_baa-with;
            } else if (input==3) {
                System.out.println("\nYour Current Balance is: " + acc_baa);
            }else{
                break;
            }
        }
    }
}
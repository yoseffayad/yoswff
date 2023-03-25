import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int pass =1234;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if (data == pass){
            System.out.println("welcome");
        }else{
            System.out.println("wrong password");
        }

    }
}
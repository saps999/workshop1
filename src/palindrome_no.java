import java.util.Scanner;

public class palindrome_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b=a;
        int rem=0, rev=0;
        while(a!=0){
            rem=a%10;//121%10=1
            rev=rev*10+rem;//0*10=0+1=1
            a=a/10;//121/10=12
        }
        if (b==rev){
            System.out.println(b+" is a palindrome number.");
        } else System.out.println(b+" is not a palindrome number.");
    }
}

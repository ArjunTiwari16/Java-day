import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int temp=sc.nextInt();

        int num=temp;
        int sum = 0;
        while(num>0)
        {
            int ld = num % 10;
            sum *= 10;
            sum += ld;
            num /= 10;
        }
         if(temp==sum)
         {
            System.out.println("True");
         }
         else
         {
            System.out.println("False");
         }
          System.out.println(sum);
          sc.close();
    }
    
}

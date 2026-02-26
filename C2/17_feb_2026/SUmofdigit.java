import java.util.Scanner;

public class SUmofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int x=sc.nextInt();
       int sum = 0;
        while(x>0)
        {
            int ld = x % 10;
            sum += ld;
            x /= 10;
        }
            
        System.out.println("Sum of given number is : " +sum);
        sc.close();
    }
    
}

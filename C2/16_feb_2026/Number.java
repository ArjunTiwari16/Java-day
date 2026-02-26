import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        for(int i=1; i<=x; i++)
        {
            System.out.println(i);
            
        }
        sc.close();
    }
}

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the NUmber");
    int x=sc.nextInt();
    int a = 1;
    for(int i=x;i>0;i--)
    {
        a=a*i;
    }
    System.out.println("Factorial of "+x+" is "+a);
    sc.close();
    }
}

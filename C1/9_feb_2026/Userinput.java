import java.util.Scanner;
class Userinput
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int z=a+b;
        System.out.println("Sum = "+z); 
        sc.close();
    }
}
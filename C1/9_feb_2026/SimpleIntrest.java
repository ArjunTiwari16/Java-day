import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int principle=sc.nextInt();
        int time=sc.nextInt();
        float rate=sc.nextFloat();
        float SI=(time*principle*rate)/100;
        System.out.println("Simple Intrest = "+SI);
        sc.close();
    }   
}

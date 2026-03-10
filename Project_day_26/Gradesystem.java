import java.util.Scanner;
public class Gradesystem {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int num;
        int Total=0;

        for(int i=1;i<=5;i++){
            System.out.print("Enter "+i+" Subject marks : ");
            num = sc.nextInt();
                Total = Total + num;
            
        }

        // System.out.print("Enter 1st Subject marks : ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter 2nd Subject marks : ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter 3rd Subject marks : ");
        // int num3 = sc.nextInt();
        // System.out.print("Enter 4th Subject marks : ");
        // int num4 = sc.nextInt();
        // System.out.print("Enter 5th Subject marks : ");
        // int num5 = sc.nextInt();
        
        // int Total = num1+num2+num3+num4+num5;

        double Percentage = (Total*100)/500;
        System.out.println("Percentage : "+Percentage);

        if(Percentage>=90 && Percentage<=100) System.out.println("A Grade");
        else if(Percentage>=80) System.out.println("B Grade");
        else if(Percentage>=70) System.out.println("C Grade");
        else if(Percentage>=60) System.out.println("D Grade");
        else if(Percentage>=50) System.out.println("E Grade");
        else System.out.println("Fail");  
        sc.close();    
    }    
}

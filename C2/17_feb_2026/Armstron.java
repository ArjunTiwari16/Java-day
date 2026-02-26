import java.util.Scanner;

public class Armstron {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    
    int count = 0;
    double result = 0;
    
    int temp = num;
    int temp2 = num;

    //count = String.valueOf(num).length(); // number of digits
    // 1st while loop ke jagaha par ye  fun() use ho sakata hai
        //{
    while(temp>0)
        {
            temp /= 10;
            count++;
        } 
        //}
   
    while(temp2>0)
        {
            int ld = temp2 % 10;
            result += Math.pow(ld,count);
            temp2 /= 10;
        }
     if(result==num) {
        System.out.print("Given number is an armstrong number");
     }   
     else{
        System.out.print("Given number is not an armstrong number");
     }
     sc.close();
    }
    
}

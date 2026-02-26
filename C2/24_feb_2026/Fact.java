import java.util.Scanner;
public class Fact{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int num = sc.nextInt();
System.out.println("Factor of "+num+" is : ");
for(int i=1;i<=num;i++){
    if(num%i==0){
        System.out.print(i+" ");
    }
   }
   sc.close();
}
}

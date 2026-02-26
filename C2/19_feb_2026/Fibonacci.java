import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number");
    int term=sc.nextInt();
    if(term==1 || term==2)
      System.out.print("1");
    else
    {
    int t1=0;
    int t2=1;
    System.out.print(t1+" "+t2);
    for(int i=2;i<term;i++){
        int a = t1 + t2;
        System.out.print(" "+a);
        t1 = t2;
        t2 = a;
        
    }
  }
    sc.close();
  }  
}

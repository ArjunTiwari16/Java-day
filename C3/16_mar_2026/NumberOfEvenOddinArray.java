import java.util.Scanner;

public class NumberOfEvenOddinArray {
     public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of Array");
    int size = sc.nextInt();
    int arr[] = new int[size]; 
    System.out.println("Enter "+size+" element in array");
    for(int j=0;j<size;j++)
        arr[j] = sc.nextInt();

    int even = 0;
    int odd = 0;

    for(int i=0;i<size;i++){
        if(arr[i]%2==0) even++;
        else odd++;
    }

     System.out.println("Total even number "+even);
      System.out.println("Total odd number "+odd);
      sc.close();
    }
}

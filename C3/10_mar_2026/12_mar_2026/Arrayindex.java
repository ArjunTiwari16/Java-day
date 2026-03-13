import java.util.Scanner;
public class Arrayindex {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int size = sc.nextInt();
    int arr[] = new int[size]; 

    System.out.println("Enter "+size+" array elements");
      for(int i=0;i<size;i++)
       arr [i]=sc.nextInt();
    
    System.out.println("Array elements are:");
      for (int i = 0; i < size; i++) 
         System.out.print(arr[i] + " ");
      
      sc.close();
   } 
}

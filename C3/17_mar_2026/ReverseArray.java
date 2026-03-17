import java.util.Scanner;
public class ReverseArray {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter size of Array");
     int size = sc.nextInt();
     
    int arr[] = new int[size];
    System.out.println("Enter "+size+" element in Array");
    for(int i=0;i<size;i++)
        arr[i] = sc.nextInt();
    
    System.out.println("Reverse of given array");
    for(int j=size-1;j>=0;j--)
        System.out.println(arr[j]);

    // for(int j=0;j<size;j++)
    //     System.out.println(arr[size-1-j]);

    sc.close();
 }   
}

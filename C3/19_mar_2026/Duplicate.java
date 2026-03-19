import java.util.Scanner;
public class Duplicate {    
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter size of Array");
     int size = sc.nextInt(); 

    int arr[] = new int[size];

    System.out.println("Enter "+size+" element in Array");
    for(int i=0;i<size;i++)
        arr[i] = sc.nextInt();

    for(int j=0;j<size;j++)
        for(int k=j+1;k<size;k++)
        if(arr[j]==arr[k])  System.out.println("Duplicate element is : "+arr[j]);      
    sc.close();
 }   
}



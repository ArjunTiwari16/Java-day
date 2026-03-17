import java.util.Scanner;
public class Linearsearch {    
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter size of Array");
     int size = sc.nextInt(); 

    int arr[] = new int[size];

    System.out.println("Enter "+size+" element in Array");
    for(int i=0;i<size;i++)
        arr[i] = sc.nextInt();

    System.out.println("Enter number you want to found :");
     int num = sc.nextInt();

    boolean a= false;

    for(int j=0;j<size;j++){
        if(arr[j]==num){
            a = true;
            System.out.println("element found on index "+j);
        }
    }
    if(a==false) System.out.println("element not found");
    sc.close();
 }   
}


import java.util.Scanner;
public class Secondmaxinarray  {    
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter size of Array");
     int size = sc.nextInt(); 

    int arr[] = new int[size];

    System.out.println("Enter "+size+" element in Array");
    for(int i=0;i<size;i++)
        arr[i] = sc.nextInt();

    int max= Integer.MIN_VALUE;

    for(int j=0;j<size;j++){
        if(max<arr[j]){
            max=arr[j];
        
    }
}
    int smax = Integer.MIN_VALUE;

    for(int k=0;k<size;k++){
        if(smax<arr[k] && arr[k] != max)
            smax = arr[k];
    }
     System.out.println("Max element in array is : "+max);
     System.out.println("Second Max element in array is : "+smax);
    sc.close();
 }   
}


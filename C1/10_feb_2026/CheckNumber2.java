import java.util.Scanner;
public class CheckNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println(num+ " is a +ve number");
        }
        else if(num==0){
            System.out.println(num+ " is a Zero number");
        }
        else{
            System.out.println(num+ " is a negative");
        }
        sc.close();
    
}

}
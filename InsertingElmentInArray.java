package ArrayProgramms;
import java.util.Scanner;

public class InsertingElmentInArray {
    //creating Scanner object for taking imput from keyboard
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        // variable for array size
        int arraySize;

        System.out.println("Enter Array Size : ");
        arraySize=sc.nextInt();
        //creating array with given size
        int[] arr=new int[arraySize];

        // loop for taking array element from user
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number arr["+i+"]");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element stored successfully !!!!");
        System.out.println("===============================================================================");
        System.out.println("Array elements Are ......");

        // displaying array elements
        for(int i:arr){
            System.out.println(i);
        }

    }
}

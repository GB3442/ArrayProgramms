package ArrayProgramms;

import java.util.Scanner;

public class deleteElementFromArray {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner sc=new Scanner(System.in);
        int[] arr={10,25,45,86,52,56,89,85};
        System.out.println("Enter array index that you want to delete ?");
        int number=sc.nextInt();


        // displaying array elements
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}

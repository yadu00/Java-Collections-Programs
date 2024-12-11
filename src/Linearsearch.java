import java.util.Scanner;

public class Linearsearch {

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 9, 10, 8};


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a target value : ");
        int targ = sc.nextInt();

        Linearsearch s = new Linearsearch();

        int result = s.function(arr, targ);
        if (result == 1) {
            System.out.println(targ + " found");
        } else {
            System.out.println(targ + " not found");
        }
    }
        public  int function(int []arr,int targ){

            for (int i = 0; i < arr.length; i++) {
                if (targ==arr[i]){
                    return 1;
                }
            }

            return 0;
        }





}


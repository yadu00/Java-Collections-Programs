import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements");
        for (int i = 0; i < 5; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        int size = arr.length;
        int temp;
        for(int i=0; i<size-1 ;i++){
            for(int j=0;j<size-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a:arr){
            System.out.println(a);
        }
        int l = 0;
        int h = arr.length-1;

        int result = Search(arr,target,l,h);
        if (result==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index : "+result);
        }

    }

    public static int Search(int[] arr, int target ,int l, int h){
        if(h>=l) {
            int mid = l+(h-l)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                return Search(arr, target, l, mid - 1);
            } else if (target>arr[mid]){
                return Search(arr, target, mid + 1, h);
            }
        }
        return -1;
    }
}

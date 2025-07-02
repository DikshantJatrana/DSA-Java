public class sortedArray{
    public static boolean isSorted = false;

    public static void check(int arr[] , int index){
        if(index == arr.length-1){
            System.out.println("This array is Sorted");
            return;
        }
        if(arr[index] < arr[index +1] ){
            isSorted = true;
        }else {
            isSorted = false;
            System.out.println("This array is not sorted ");
            return;
        }
        check(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,8};
        check(arr, 0);
    }
}
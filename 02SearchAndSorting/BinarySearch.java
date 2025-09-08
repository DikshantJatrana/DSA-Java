public class BinarySearch {
    public static void search(int arr[],int num){
        boolean found = false;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + (high-low))/2;
            if(arr[mid] == num){
                System.out.println(num+" is present at "+(mid+1)+" position in array");
                found = true;
                break;
            }
            else if(arr[mid] < num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(!found){
            System.out.println(num+" is not present in this array");
        }
    }
    public static void main(String[] args) {
        int num = 1;
        int arr[] = {1,2,4,5,7,8,9,11,13};
        search(arr, num);
    }
}

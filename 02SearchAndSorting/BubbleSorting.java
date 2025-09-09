public class BubbleSorting{
    public static void IncreasingSorting(int arr[]){
        int len = arr.length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < len+1; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void DecreasingSorting(int arr[]){
        int len = arr.length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < len+1; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,3,8,2,1};
        IncreasingSorting(arr);
        System.out.println("");
        DecreasingSorting(arr);
    }
}
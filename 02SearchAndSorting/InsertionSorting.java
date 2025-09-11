

public class InsertionSorting {
    public static void IncreasingSorting(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void DecreasinSorting(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j>=0 && arr[j]<key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,1,3,8,2};
        IncreasingSorting(arr);
        System.out.println();
        DecreasinSorting(arr);
    }
}

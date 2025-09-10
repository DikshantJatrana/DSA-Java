public class SelectionSorting {
    public static void IncreasingSorting(int arr[]){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int small = i;
            for (int j = i; j < len; j++) {
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void DecreasingSorting(int arr[]){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int large = i;
            for (int j = i; j < len; j++) {
                if(arr[large]<arr[j]){
                    large = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,7,3,8,2};
        IncreasingSorting(arr);
        System.out.println();
        DecreasingSorting(arr);
    }
}

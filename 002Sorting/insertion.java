public class insertion {
    public static void Increase(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >=1; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Decrease(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >=1; j--) {
                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        Increase(arr);
        System.out.println();
        Decrease(arr);
    }
}

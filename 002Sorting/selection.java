public class selection {
    public static void Increase(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for(int j=i;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void Decrease(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int largest = i;
            for(int j=i;j<arr.length;j++){
                if(arr[largest]<arr[j]){
                    largest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        Increase(arr);
        System.out.println();
        Decrease(arr);
    }
}

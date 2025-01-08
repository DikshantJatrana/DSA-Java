public class Sorting {
    public static void InsertionSort(int arr[]){
        int length = arr.length;
        for(int i=1;i<length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("\nselection Array:");
        for(int m =0;m<length;m++){
            System.out.print(arr[m]+" ");
        }  
    }
    public static void DecreaseSelection(int arr[]){
        int length = arr.length-1;
        for(int i=0;i<length;i++){
            int large = i;
            for(int j=i+1;j<length+1;j++){
                if(arr[j]>arr[large]){
                    large = j;
                }
            }
            int temp = arr[large];
            arr[large] = arr[i];
            arr[i] = temp;
        }            
        System.out.println("\nselection Array:");
        for(int m =0;m<length+1;m++){
            System.out.print(arr[m]+" ");
        }           
    }
    public static void SelectionSort(int arr[]){
        int length = arr.length-1;
        for(int i = 0;i<length;i++){
            int small = i;
            for(int j=i+1;j<length+1;j++){
                if(arr[j]<arr[small]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small]  = arr[i];
            arr[i] = temp;
        }
        System.out.println("\nselection Array:");
        for(int m =0;m<length+1;m++){
            System.out.print(arr[m]+" ");
        }
    }        
    public static void DecreasingSorting(int arr[]){
        int length =arr.length-1;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }
    }
    System.out.println("\nDescreased Sorted Array:");
        for(int m =0;m<length+1;m++){
            System.out.print(arr[m]+" ");
        }
}
    public static void bubbleSort(int arr[]) {
        int length = arr.length -1;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }}
    public static void DecreaseInsertion(int arr[]){
        int length = arr.length;
        for(int i=1;i<length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("\nDecreased Insertion Sorted Array:");
        for(int m =0;m<length;m++){
            System.out.print(arr[m]+" ");
        }  
    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,3,2,4,8,6};
        bubbleSort(arr);
        DecreasingSorting(arr);
        SelectionSort(arr);
        DecreaseSelection(arr);
        InsertionSort(arr);
        DecreaseInsertion(arr);
    }
}

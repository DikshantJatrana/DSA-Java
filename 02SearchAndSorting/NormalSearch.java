public  class NormalSearch{
    public static void search(int arr[],int num){
        boolean found = false;
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] == num){
                System.out.println(num+" is present on "+i+" position of array");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(num+" not found in this array");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,13};
        int num = 8;
        search(arr, num);
    }
}
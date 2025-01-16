import java.util.HashSet;

public class Recursion2 {
    public static void TowerOfHanoi(int n,String src,String rest,String dest){
        if(n==1){
            System.out.println("transfered disk from "+src+" destnation "+dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, rest);
        System.out.println("transfered disk from "+src+" destnation "+dest);
        TowerOfHanoi(n-1, rest, src, dest);
    }

    public static void stringReverse(int index,String S){
        if(index == 0){
            System.out.println(S.charAt(0));
            return;
        }
        System.out.print(S.charAt(index));
        stringReverse(index-1, S);
    }
    public static int first =-1;
    public static int last =-1;
    public static void elementOccurence(String S,int index ,char elem){
        if(index == S.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(S.charAt(index) == elem){
            if(first == -1){
                first = index;
            }
            else{
                last=index;
            }
        }
        elementOccurence(S, index+1, elem);
    }

    public static boolean  SortedOrNot(int arr[],int index){
        if(arr.length -1==index){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return SortedOrNot(arr, index+1);
        }
        else{
            return false;
        }
    }

    public static void NewStringMade(String s,int count,int idx,String newString){
        if(s.length() == idx){
            for(int i=1;i<=count;i++){
                newString=newString+'x';
            }
            System.out.println(newString);
            return;
        }
        if(s.charAt(idx)=='x'){
            count++;
        }
        else{
            newString = newString+s.charAt(idx);
        }
        NewStringMade(s, count, idx+1, newString);
    }

    public static void subsequence(String s,int idx,String newString,HashSet<String> set){
        if(s.length() == idx){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        subsequence(s, idx+1, newString+s.charAt(idx),set);
        subsequence(s, idx+1, newString,set);
    }
    public static void main(String[] args) {
        // String jat = "dikshantjatranaa";
        // int length = jat.length()-1;
        // System.out.println(length);
        // elementOccurence(jat,0,'a');
        // stringReverse(length,jat);
        // boolean value = SortedOrNot(new int[]{1,2,8,6,7}, 0);
        // System.out.println(value);
        // NewStringMade("axbxxzxbc", 0, 0, "");
        HashSet<String> set = new HashSet<>();
        subsequence("aaa",0,"",set);
    }
}

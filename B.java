public class B {
     public static void changeArr(int arr[], int i, int val ){
        if(i== arr.length){
            printArr(arr);
            return;
        }

        arr[i] = val;

        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
     }
     public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     }
     public static void findPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }


        for(int i = 0; i<str.length();i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0,i)+ str.substring(i+1);
            findPermutation(NewStr, ans+curr);
        } 
     }



    public static void main(String args[]){
        String str = "abc";
        findPermutation(str, "");
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
         printArr(arr);
    }
}

public class Recursion {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }
    // print number increasing order
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    // fib..................................******** no
    public static int fib(int n){
        if(n == 0 || n ==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    
    

    }
    public static boolean isSortd(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSortd(arr, i+1);

    }
    public static int firstOccurence(int arr[] , int key, int i ){
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);

    } 
    public static int tilingProblem(int n){
           if(n == 0 || n == 1){
            return 1;
           }
            int fnm1 = tilingProblem(n-2);
            int fnm2 = tilingProblem(n-2);
            int totWays = fnm1+ fnm2;
            return totWays;

           }
    




    public static void main(String args[]){
        System.out.println(tilingProblem(3));
        int arr[]={8,3,6,5,4,3,5,6,7,};
     System.out.println(firstOccurence(arr, 5, 0));

    }
}
// end--------------------------------------------------

import java.util.*;

public class Arraylist {
     public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);

     }

    public static void main(String args[]){
      ArrayList<Integer>list = new ArrayList<>();
    //   ArrayList<String> list2 = new ArrayList<>();
    //   ArrayList<Boolean> list3 = new ArrayList<>();

      list.add(2);
      list.add(5);
      list.add(9);
      list.add(6);
      System.out.println(list);
      Collections.sort(list);
      System.out.println(list);
      Collections.sort(list, Collections.reverseOrder());
//   int idx1 = 1, idx2 = 3;
//   System.out.println(list);
//   swap(list, idx1, idx2);
//   System.out.println(list);

    //    list.add(1,9);
    //    reverse
    // for(int i =list.size()-1; i>=0; i--){
    //     System.out.print(list.get(i) + " ");
    //     int max= Integer.MIN_VALUE;
    //     for(int i=0; i<list.size(); i++){
    //         if(max <list.get(i));{
    //         max = list.get(i);
    //     }

    // }
    // System.out.println("max element = " + max);
    
}
}


    //   System.out.println(list);



    //   get operation
//     int element = list.get(2);
//     System.out.println(element);
//     // delete
//     list.remove(2);
//     System.out.println(list);
//     // set element at index
//     list.set(2,10);
//     System.out.println(list);
// // contains element
//     System.out.println(list.contains(1));
//     System.out.println(list.contains(11));

    
    


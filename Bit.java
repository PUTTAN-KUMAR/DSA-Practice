public class Bit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
     public static int clearIBits(int n, int i){
        int bitMask = (~0)<<1;
        return n & bitMask;
     }

    public static void main(String args[]){
       System.out.println(clearIBits(15, 2));
    }
}

import java.util.*;

public class imagination {
    int real;
    int imag;

    public void Complex(int r, int i) {
        real = r;
        imag = i;

    }

    public static Complex add(Complex a, Complex b) {

        return new Complex((a.real+b.real), (a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }

    public static Complex product(Complex a, Complex b) {
         return new Complex(((a.real*b.real)-(a.imag*b.imag)), ((a.real*b.real)-(a.imag*b.imag)));
     }
     public void  printComplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag+"i");
        } 
        else if(imag ==0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
     }
}
class Solution{
    public static void main(String args[]){
        
        Complex c = new Complex(4,5);

        Complex d = new Complex();

        Complex e = new Complex(c,d );

        Complex f = new Complex(c,d);

        Complex g = new Complex(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
        

    }
}

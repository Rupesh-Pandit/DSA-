public class sumOfComplex {
    public static void main(String[] args) {
        Complex c1= new Complex(2, 7);
        Complex c2= new Complex(4, 7);
        Complex result1 = Complex.Add(c1, c2);
        result1.print();


    }
}

class Complex{

    int  imaginary;
     int real;

     Complex(int imaginary, int real){
        this.imaginary = imaginary;
        this.real = real;
     }

    public static Complex  Add(Complex c1, Complex c2){
        Complex result = new Complex(0, 0);
        result.imaginary = c1.imaginary + c2.imaginary;
        result.real = c1.real + c2.real;
        return result;
     }


     void print(){
        System.out.println("("+this.real + ", " + this.imaginary+"i"+")");
     }
}

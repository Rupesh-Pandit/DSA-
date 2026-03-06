/* package whatever; // don't place package name! */

import java.util.*;

class Complex
{
	int real;
	int imaginary;
	
	public Complex(int real, int imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public static Complex addition( Complex c1, Complex c2)
	{
		Complex result = new Complex(0,0);
		
		result.real = c1.real+ c2.real;
		result.imaginary = c1.imaginary +c2.imaginary;
		
		return result;
	}
	
	public static Complex subtraction( Complex c1, Complex c2)
	{
		Complex result = new Complex(0,0);
		
		result.real = c1.real - c2.real;
		result.imaginary = c1.imaginary - c2.imaginary;
		
		return result;
	}
	
	public static Complex product( Complex c1, Complex c2)
	{
		Complex result = new Complex(0,0);
		
		result.real = c1.real*c2.real - c1.imaginary*c2.imaginary;
		result.imaginary = c1.real* c2.imaginary + c1.imaginary*c2.real;
		
		return result;
	}
	
	void print()
	{
		System.out.println( this.real+" "+ this.imaginary+"i");
	}
	
}

class Ideone
{
	public static void main (String[] args) 
	{
		 Complex c1 = new Complex(3,2);
		 Complex c2 = new Complex(1,4);
		 
		 Complex result1= Complex.addition(c1,c2); // 4+6i
		 Complex result2= Complex.subtraction(c1,c2); //2-2i
		 Complex result3= Complex.product(c1,c2); // -5+14i
		 
		 result1.print();
		 result2.print();
		 result3.print();
	}
}



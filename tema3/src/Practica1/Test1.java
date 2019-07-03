package Practica1;

public class Test1{
public static void main(String[] args){
int a = 1;
int b = 2;
System.out.println("A: " + a + " y B: " + b);
cambiar(a,b);
System.out.println("A: " + a + " y B: " + b);
}

public static void cambiar(int a, int b){
int tmp = a;
a =  b;
b = tmp;
	}
}
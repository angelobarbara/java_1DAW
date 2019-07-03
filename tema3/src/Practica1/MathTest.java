package Practica1;

public class MathTest{
public static void main(String[] args){
System.out.println(Math.abs(-1));
System.out.println(Math.max(-1,5));
System.out.println(Math.min(-1,5));
System.out.println(Math.pow(4,2));
System.out.println(Math.sqrt(4));
System.out.println("Número entero aleatorio entre 0 y 100:");
System.out.println((int)Math.round(Math.random() * 100));
}
}
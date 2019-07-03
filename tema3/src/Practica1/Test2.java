package Practica1;

public class Test2 {
public static void main(String[] args){
MiClase a = new MiClase(1);
MiClase b = new MiClase(2);
System.out.println("A: " + a + " y B: " + b);
cambiar(a,b);
System.out.println("A: " + a + " y B: " + b);
}
public static void cambiar(MiClase a, MiClase b){
MiClase tmp = a;
a =  b;
b = tmp;
}
}
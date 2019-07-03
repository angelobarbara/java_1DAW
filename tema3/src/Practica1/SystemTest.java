package Practica1;

public class SystemTest{
public static void main(String[] args){
System.out.println(System.currentTimeMillis());
System.out.println(System.nanoTime());
System.out.println(System.getProperty("java.runtime.name"));
System.out.println(System.getProperties());
System.exit(0);
System.out.println("Aquí nunca llega.");
}
}
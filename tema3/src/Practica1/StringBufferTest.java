package Practica1;

public class StringBufferTest{
public static void main(String[] args) {
StringBuffer sb1 = new StringBuffer("abababab");
System.out.println(sb1.length());
System.out.println(sb1.capacity());
sb1.setCharAt(sb1.length()-1,'B');
System.out.println(sb1);
sb1.replace(2,3,"AB");
System.out.println(sb1);
sb1.insert(4,"CD");
System.out.println(sb1);
sb1.delete(0,2);
System.out.println(sb1);
}
}
package Practica1;

public class WrapperTest{
public static void main(String[] args){
String texto = new String("3");
byte b = Byte.parseByte(texto);
System.out.println(Byte.toString(b));
short s = Short.parseShort(texto);
System.out.println(Short.toString(s));
int i = Integer.parseInt(texto);
System.out.println(Integer.toString(i));
long l = Long.parseLong(texto);
System.out.println(Long.toString(l));
float f = Float.parseFloat(texto);
System.out.println(Float.toString(f));
double d = Double.parseDouble(texto);
System.out.println(Double.toString(d));
}
}
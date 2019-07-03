/**
Define la clase CuentaCaracteres. Lee caracteres desde el teclado hasta que el usuario introduce un asterisco. En ese caso, se mostrará un recuento de:

a.Los dígitos introducidos [0-9]
b.Las minúsculas introducidos [a-z]
c.Las mayúsculas introducidos [A-Z]
d.El resto de caracteres (Sin contar el asterisco)
@author Angelo Barbara
@version 1.0
*/
class CuentaCaracteres{
	public static void main (String[] args){
		char i;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		
		do{
			i=Teclado.leerCaracter("Introduzca un caracter o * para salir");
			if(i>='0' && i<='9')
				a++;
			else if(i>='a' && i<='z')
				b++;
			else if(i>='A' && i<='Z')
				c++;
			else if(i!='*')
				d++;
		}while(i!='*');
		System.out.println("Se han introducido "+a+" digitos\n");
        System.out.println("Se han introducido "+b+" minusculas\n");
        System.out.println("Se han introducido "+c+" mayusculas\n");
		System.out.println("Se han introducido "+d+" caracteres (Sin contar elasterisco*)\n");
	}
}
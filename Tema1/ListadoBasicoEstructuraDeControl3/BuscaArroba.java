/**
Define  la  clase BuscaArroba.Lee  caracteres  desde  teclado  hasta  que  introduzca  la arroba.
Una  vez  introducida,  se  mostrará  el  número  de  caracteres  introducidos  entre la B mayúscula y la T mayúscula.

@author Angelo Barbara
@version 1.0
*/
class BuscaArroba{
    public static void main(String[] args) {
        int contador=0;
        char c;
		
        do{
            caracter=Teclado.leerCaracter("Introduzca un caracter: ");
            if(caracter>'A' && caracter<'U'){
                contador++;
            }
        }while(caracter!='@');
        System.out.println("Has introducido " + contador + " caracteres entre B y T\n");
    }
}
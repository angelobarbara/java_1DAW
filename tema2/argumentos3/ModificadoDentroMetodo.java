package tema2.argumentos3;
class DeseaContinuar{
	public static void main (String[] args){
		boolean continuar = true;
		do{
			continuar=deseaContinuar();//En este caso lo modificado dentro del metodo deseaContinuar afecta a la variable continuar
		}while(continuar);
	}
	/**
	 Pregunta al usuario si desea continuar pidiendole un caracter (s/n)
	 @return true si la respuesta es s o S y false en cualquier otro caso
	 */
	public static boolean deseaContinuar(){
		char continuar;
		do{
			continuar=leerCaracter("Desea continuar?(s/n)");
		}while(continuar!='s' && continuar!='S' && continuar!='n' && continuar!='N');
		return (continuar=='s' || continuar=='S');
	}
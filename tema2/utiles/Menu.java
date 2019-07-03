package tema2.utiles;
public class Menu {
	private String titulo;
	private String [] opciones;
	private int numOpciones;
	
	public Menu(String titulo, String[] opciones){
		this.titulo=titulo;
		setNumeroOpciones(opciones.length + 1);
		setOpciones(opciones);
	}
	
	/**
	 * Escribe el array opciones añadiendo al final la opción Salir
	 * @param opciones array de cadenas con las opciones (sin la opción Salir)
	 */
	private void setOpciones(String[] opciones){
		int i=0;
		this.opciones= new String[numOpciones]; // Creamos un vector para las opciones
		for(i=0; i<numOpciones - 1;i++){				  // Recorremos el vector opciones para aignarlo a this.opciones
			this.opciones[i]=(i+1)+".-"+opciones[i];
		}
		this.opciones[numOpciones-1]= numOpciones+".-Salir";					  // Añadimos a this.opciones la opción Salir
	}
	
	/**
	 * Escribe el número de opciones (se suma uno más por la opción Salir)
	 * @param opciones array de cadenas con las opciones (sin la opción Salir)
	 */
	private void setNumeroOpciones(int numOpciones){
		this.numOpciones=numOpciones;
	}
	
	/**
	 * Lee el número de opciones del menú
	 * @return
	 */
	private int getNumeroOpciones() {
		return numOpciones;
	}

	/**
	 * Muestra el menú
	 */
	private void mostrarMenu(){
		System.out.println("*****"+titulo+"******\n");
		for(int i=0;i<numOpciones;i++){
			System.out.println(this.opciones[i]);
		}
	}
	
	/**
	 * Lee la opción introducida por el usuario
	 * @return opcion
	 */
	private int getOpcion(){
		int opcion;
		do{
			opcion=Teclado.leerEntero("\nIntroduzca una opcion: ");
			if(opcion<1 || opcion>numOpciones)
				System.out.println("Error. Opcion incorrecta");
		}while(opcion<1 || opcion>numOpciones);
		return opcion;
	}
	
	/**
	 * Muestra el menú y recoge una opción válida
	 * @return opción válida escogida
	 */
	public int gestionarMenu(){
		mostrarMenu();
		return getOpcion();
		
	}
	private boolean opcionValida(int opcion){
		return(opcion>0 && opcion<=numOpciones);
	}
}
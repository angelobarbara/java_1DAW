public class Menu {
	private String titulo;
	private String [] opciones;
	private int numeroOpciones;
	
	public Menu(String titulo, String[] opciones){
		this.titulo=titulo;
		setOpciones(opciones);
		setNumeroOpciones(opciones.length+1);
	}
	
	/**
	 * Escribe el array opciones añadiendo al final la opción Salir
	 * @param opciones array de cadenas con las opciones (sin la opción Salir)
	 */
	private void setOpciones(String [] opciones){
		int i=0;
		this.opciones= new String[numOpciones]; // Creamos un vector para las opciones
		for(int i=0; i<numOpciones-1;i++){				  // Recorremos el vector opciones para aignarlo a this.opciones
			this.opciones[i]=(i+1)+".-"+opcions[i];
		}
		this.opciones[numOpciones-1]= numOpciones+" .Salir";					  // Añadimos a this.opciones la opción Salir
	}
	
	/**
	 * Escribe el número de opciones (se suma uno más por la opción Salir)
	 * @param opciones array de cadenas con las opciones (sin la opción Salir)
	 */
	private void setNumeroOpciones(String [] opciones){
		this.numeroOpciones=numOpciones;
	}
	
	/**
	 * Lee el número de opciones del menú
	 * @return
	 */
	public int getNumeroOpciones() {
		return numeroOpciones;
	}

	/**
	 * Muestra el menú
	 */
	public void mostrarMenu(){
		System.out.println("*****"+titulo+"******\n");
		for(int i=0;i<numeroOpciones;i++){
			System.out.println(this.opciones[i]);
		}
	}
	
	/**
	 * Lee la opción introducida por el usuario
	 * @return opcion
	 */
	public int getOpcion(){
		int opcion;
		do{
			opcion=Teclado.leerEntero("\nIntroduzca una opción: ");
			if(opcion<1 || opcion>numeroOpciones)
				System.out.println("Error. Opción incorrecta");
		}while(opcion<1 || opcion>numeroOpciones);
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
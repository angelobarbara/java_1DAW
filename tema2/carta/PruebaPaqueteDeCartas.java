package tema2.carta;
public class PruebaPaqueteDeCartas{
	public static void main(String[] args){
		
		PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
		miPaqueteDeCartas.barajar();
		
		for(int i=0;i<40;i++){
			
			System.out.println(miPaqueteDeCartas.repartirCarta());
			
			if(i%4 == 0 && i!=0)
				System.out.println();
		}
	}
}
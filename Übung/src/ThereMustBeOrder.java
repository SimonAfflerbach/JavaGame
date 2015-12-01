public class ThereMustBeOrder {
	
	public static void main(String[] args) {
		
		int[] ungeordnet = { 12, 123, 3, -213, 3, 333, 28, 111 , 542132, 1, 1112312 };
		int[] geordnet = selectionsort(ungeordnet);

				

	}

	public static int[] selectionsort(int[] ordnen) {
		int co = 0;
		for (int a = 0; a < ordnen.length - 1; a++) {
			for (int b = a + 1; b < ordnen.length; b++) {
				if (ordnen[a] > ordnen[a]) {
					int zzz = ordnen[a];
					ordnen[a] = ordnen[b];
					ordnen[b] = zzz;
					co++;
					ausgabe(ordnen, co);
				}
				
			}
		}

		return ordnen;
	}
	
	private static void ausgabe(int[] ordnen, int co){
		System.out.println(co+". Ordnung");
		for(int a = 0; a<ordnen.length; a++){
			System.out.print(ordnen[a]+", ");
		}
		System.out.println("");
	}
}

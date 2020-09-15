package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] array: matrise) {
			for(int i: array) {
				if(i < 100) System.out.print(" ");
				if(i < 10) System.out.print(" ");
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String s = "";
		for(int[] array: matrise) {
			for(int i: array) {
				s += i + " ";
			}
			s += "\n";
		}
		
		return s;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] m = new int[matrise.length][];
		for(int i = 0; i < matrise.length; i++) {
			m = new int[matrise.length][matrise[i].length];
		}
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				m[i][j] = matrise[i][j] * tall;
			}
		}
		return m;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		//If og for l�kken sjekker om matrisene er like store
		if(a.length != b.length) return false;
		for (int i = 0; i < a.length; i++) {
			if(a[i].length != b[i].length) return false;
		}
		
		//Disse for l�kkene sjekker om innholder er likt
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++){
				if(a[i][j] != b[i][j]) return false;
			}
		}		
		return true; //Hvis alt g�r bra og alle verdier er helt like returnerer jeg true
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {				//Denne metoden kan bruke reaktang gi en error hvis matrisene ikke er rektangul�re
		int[][] m = new int[matrise[0].length][matrise.length];	
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = matrise[j][i];
			}
		}
		return m;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int [][] m = new int[a.length][b[0].length];
		b = speile(b); //Her bruker jeg den tidligere metoden "speile" for � flippe om p� b for � senere bruke den, det blir da enkelere � jobbe med den
		 
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				for(int x = 0; x < a[i].length; x++) {
					m[i][j] += a[i][x] * b[j][x];
				}
			}
		}
		
		return m;
	
	}
	
}

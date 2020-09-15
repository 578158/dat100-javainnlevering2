package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		for(int i = 0; i < tabell.length; i++) {
			System.out.print(" " + tabell[i]);
			if (i < tabell.length - 1) System.out.print(",");
		}
		System.out.println(" ]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String s = "[";
		for(int i = 0; i < tabell.length; i++) {
			s += tabell[i];
			if (i < tabell.length - 1) s += ",";
		}
		
		return s += "]";
		
	}

	// c)
	public static int summer(int[] tabell) { //Denne metoden bruker for each
		int sum = 0;
		for(int tall: tabell) sum += tall;
		return sum;
	}
	
	public static int summer1(int[] tabell) { //Denne metoden bruker while
		int sum = 0;
		int i = 0;
		while(i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}
	public static int summer2(int[] tabell) { //Denne metoden bruker for
		int sum = 0;
		for(int i= 0; i < tabell.length; i++) sum += tabell[i];
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) { 
		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) return true;
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) return i;
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] t = new int[tabell.length];
		for(int i = 0; i < tabell.length; i++) {
			t[tabell.length - i - 1] = tabell[i];
		}
		return t;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		for(int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i-1]) return false;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] t = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < t.length; i++) { 
			if (i < tabell1.length) t[i] = tabell1[i];
			else t[i] = tabell2[i - tabell1.length];
		}
		return t;
	}
}

package innlevering2;

import java.util.Scanner;

public class O1b {

	public static void main(String[] args) {
		int X[][] = new int [3][3];
		int y[][] = new int [3][3];
		
		
		skrivUt(y);
		tilStreng(X);
		skaler(X);
		erLik(X,y);		
	}
	public static void skrivUt(int[][] y) {
		Scanner r = new Scanner(System.in);
		System.out.print("Enter Elements av y:\n");
		for(int i=0; i<3;i++) {
			for(int j=0 ; j<3 ; j++) {
				y[i][j]=r.nextInt();
			}
		}
		System.out.print("y:\n");
		for(int i=0; i<3;i++) {
			for(int j=0 ; j<3; j++) {
				System.out.print(y[i][j]+" ");
			}
			System.out.print("\n");
			}
		System.out.println("--------------------");
		}
	
	// b)
	public static String tilStreng(int[][] X) {
		Scanner r = new Scanner(System.in);
		System.out.print("Enter Elements av X:\n");
		for(int i=0; i<3; i++) {
			for(int j=0 ; j<3 ; j++) {
				X[i][j]=r.nextInt();
			}
		}
		System.out.print("X:\n");
		for(int i=0; i<3;i++) {
			for(int j=0 ; j<3; j++) {
				System.out.print(X[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("--------------------");
		return null;
		
	}
	//c
	public static int[][] skaler( int[][] X) {
		int tall=4;
		System.out.print("X etter gang med tall 4 er:\n");
		for(int i=0 ; i<X.length; i++) {
		for(int j=0 ; j<X.length; j++) {
			System.out.print(tall*X[i][j]+" ");
		}	
			System.out.print("\n");
		}
		return X;
	}
	//d
	public static boolean erLik(int[][] X, int[][] y) {
		System.out.println(" ");
		System.out.println("--------------------");
		boolean status=true;
		if (X.length == y.length) {
			for (int i=0; i<X.length; i++ ) {
				for(int j=0 ; j<X.length; j++) {
			if(X[i][j] != y[i][j]) {
				status = false;
			}
		}
	}
}
		else {
			status = false;
		}
		if(status==true) {
			System.out.println("X og Y er like");
		}
		else {
			System.out.println("X og Y er ikke like");
			}
		
		return status;

	}

}

package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int [] tabell = {1,8,3,6,10};
		int [] tab = {42,67,89};
		int [] tabell1= {4,3,5,6};
		int [] tabell2= {9,4,7,3};


		skrivUt(tabell);
		tilStreng(tab);
		summer(tabell);
		summer2(tabell);
		summer3(tabell);
		System.out.print("inholder tabell tall? \n"+finnesTall(tabell,8));
		reverser(tabell);
		System.out.println("\n--------------------");
		erSortert(tabell);
		System.out.println("\n--------------------");
		posisjonTall(tabell,-1);
		System.out.println("\n--------------------");
		settSammen(tabell1,tabell2);


		
		}
		// a
		public static void skrivUt(int[] tabell) {
			System.out.print("tabell = [ ");
			for (int t : tabell) {
			System.out.print(t + " ");
			}
			System.out.println("]");
			}
		//b
		public static String tilStreng(int[]tab) {
			System.out.print("tab = [ ");
			for (int a : tab) {
				System.out.print(a + " ");
			}			
				System.out.println("]");
				System.out.println("--------------------");
				return null;
		}
		//c
		public static int summer (int[] tabell) {
			int sum = 0;
			for (int i=0;i<tabell.length;i++) {
				sum+=tabell[i];
			}
			System.out.println("summer av tabell = " +sum);
			System.out.println("--------------------");
			return sum;
		}
		public static int summer2(int[] tabell) {
            int sum2 =0;
            int i=-1;
            while(i<4) {
                i++;
                sum2 +=tabell[i];
            }
            System.out.println("summer2 av tabell = "+sum2);
             System.out.println("--------------------");
             return sum2;
        }
		public static int summer3(int[] tabell) {
	        int sum = 0; 
	        for (int num : tabell) {
	          sum = sum + num;


	        }
	        System.out.println("summer3 av tabell = "+sum);
	        System.out.println("--------------------");
	        return sum;
	        }

		
		//d
		public static boolean finnesTall(int[] tabell, int tall) {
			boolean funnet = false;
			int i = 0;
			while (!funnet && i < tabell.length) {
			if (tall == tabell[i]) {
			funnet = true;
			}
			i++;
			}
			return funnet;
			}
		//e
		public static int posisjonTall(int[] tabell, int tall) {
			tall=-1;
            System.out.println("first position = "+tabell[0]);
            tabell[0]=tall;
             System.out.print("tabell = [ ");
             for (int t : tabell) {
             System.out.print(t + " ");
             }
             System.out.print("]");
            return tall;
		}

		//f
		public static int[] reverser(int[] tabell) {
			System.out.println("\n--------------------");
			System.out.print("tabell etter reverse = [" );
            for (int i=tabell.length-1; i>=0;i--) {
                System.out.print(tabell[i] );
                System.out.print(" ");
            }
            System.out.print("]");
            return tabell;

        }
		
		// g)
		public static boolean erSortert(int[] tabell) {
			int b;
			System.out.print("tabell etter sort = [");

			for(int i=0;i<tabell.length;i++) {
				for(int j=i;j<tabell.length;j++) {
					if(tabell[i] > tabell[j]) {
						b=tabell[i];
						tabell[i]=tabell[j];
						tabell[j] = b;
					}
				}
			}
			
			for(int A : tabell) {
				System.out.print(A+ " ");
			}
			System.out.print("]");
			return true;
			}
		
		// h)
		public static int[] settSammen(int[] tabell1, int[] tabell2) {
			System.out.print("sammensetning av tabell1 og tabell2 er\n[");
			for (int i = 0 ; i < tabell1.length ; i++ ) {
					for (int j = 0 ; j < tabell2.length ; j++ ) {
					}
					int sum  = tabell1 [i] + tabell2[i];
					System.out.print(sum + " ");
					}					
					System.out.print("]");		
					return tabell2;
			}
		}

			



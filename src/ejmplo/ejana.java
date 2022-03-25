package ejmplo;

import java.util.Scanner;

public class ejana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static int[] ArregloTA;
		public static int[] ArregloTB;
		public static int[] ArregloTC;
	    public static Scanner Teclado;
		public static void main(String[] args) {
			// TODO Auto-generated method stub //inicializar varibles
			
				ArregloTA=new int[5];
				Teclado= new Scanner(System.in);
				
				System.err.println(" HECHO POR DARWIN RAFAEL CASTRO GARCIA MATRICULA: 200100049");
				System.out.println(" PROGRAMA PARA LEER DATOS Y MEZCLARLOS CON ARREGLOS A Y B ");
				
				for(int x=0;x<ArregloTA.length;x++) {
					System.out.println("Ingrese el numero de la tabla A a  la casilla " +x);
					ArregloTA[x]=Teclado.nextInt();		
				}
				
				for(int x=0;x<ArregloTA.length;x++) {
					System.out.println("El Valor que hay en la tabla A de la casilla " +x+" es " +ArregloTA[x]);
		}
				ArregloTB=new int[5];
				
				for(int x=0;x<ArregloTB.length;x++) {
					System.out.println("Ingrese el numero de la tabla B a  la casilla " +x);
					ArregloTB[x]=Teclado.nextInt();		
				}
				
				for(int x=0;x<ArregloTB.length;x++) {
					System.out.println("El Valor que hay en la tabla B a la casilla "+x+" es " +ArregloTB[x]);
		}
				ArregloTC=new int[10];
				
				ArregloTC[0]= ArregloTA[0] ;
				ArregloTC[1]= ArregloTB[0] ;
				ArregloTC[2]= ArregloTA[1] ;
				ArregloTC[3]= ArregloTB[1] ;
				ArregloTC[4]= ArregloTA[2] ;
				ArregloTC[5]= ArregloTB[2] ;
				ArregloTC[6]= ArregloTA[3] ;
				ArregloTC[7]= ArregloTB[3] ;
				ArregloTC[8]= ArregloTA[4] ;
				ArregloTC[9]= ArregloTB[4] ;
				
				
				System.out.println(ArregloTC [0]);
				System.out.println(ArregloTC [1]);
				System.out.println(ArregloTC [2]);
				System.out.println(ArregloTC [3]);
				System.out.println(ArregloTC [4]);
				System.out.println(ArregloTC [5]);
				System.out.println(ArregloTC [6]);
				System.out.println(ArregloTC [7]);
				System.out.println(ArregloTC [8]);
				System.out.println(ArregloTC [9]);
				
				Teclado.close();
		}
		}


	}

}

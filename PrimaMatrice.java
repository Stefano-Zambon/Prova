/*//Zambon Stefano 4^ SA

import java.util.Scanner;
import java.util.Random;
public class PrimaMatrice {

//PRIMO ESERCIZO MATRICI
	public static void main(String[] args) {
		System.out.println("PRIMO ESERCIZIO MATRICI");
		
		int Manuel [][] = {
				{1,2,3,4,5},
				{2,4,6,8,10},
				{3,6,9,12,15},
			};

		int Manuel2 [][] = new int[3][5];


		for (int i=0;i<3;i++)
		{
			for (int j=0;j<5;j++)
			{
				if (i%2==0)
					Manuel2[i][j]= Manuel[i][j]*3;
				else
					Manuel2[i][j]=1;

				System.out.print(Manuel2[i][j]+"\t");
			}
			System.out.println();

		}
		//SECONDO ESERCIZI MATRICI
		
		System.out.println();
		System.out.println("SECONDO ESERCIZIO MATRICI");
		System.out.println();
		
		System.out.print("Dimmi il numero di righe e di colonne");
		Scanner Matrice = new Scanner(System.in);
		int s = Matrice.nextInt();
		int z =Matrice.nextInt();
		int Manuel3[] [] = new int [s][z];
		 
		Random Numero = new Random ();
		if (s==z)
		{
			System.out.println("La matrice è quadrata ");	
			System.out.println();

			for (int a=0;a<s;a++)
			{
				for (int b=0;b<z;b++)
				{
					Manuel3[a][b]=Numero.nextInt(99);
					
					if (Manuel3[a][b]!= Manuel3[b][a])
						
					{
						System.out.print(Manuel3[a][b]+"\t");
					
				
					}
					else
						{System.out.print(Manuel3[a][a]+"\t");
						
						}
				}
				System.out.println("\t");
			}
		}
		else
		{
			System.out.println("La matrice è rettangolare");
			System.out.println();
			for (int a=0;a<s;a++)
			{
				for (int b=0;b<z;b++)
				{
					Manuel3[a][b]=Numero.nextInt(99);

					if (Manuel3[a][b]<15)

						Manuel3[a][b] = 0;
					
					System.out.print(Manuel3[a][b]+"\t");
				}
				System.out.println();
			}
		}

		System.out.println();
		
//TERZO ESERCIZIO MATRICI
		
System.out.println("TERZO ESERCIZIO MATRICI");

		int Matrice1[][] = {
				{2,4,6},
				{8,10,12},

		};
System.out.println(" ");
		int Matrice2[][] ={
				{12,14,16},
				{18,20,22},
		};
System.out.println(" ");
		int Matrice3[][] = new int [2][3];
		System.out.println("Prima matrice:");
		for(int d=0;d<2;d++)
		{

			for(int e=0;e<3;e++)
			{
			

				System.out.print(Matrice1 [d][e]+"\t" );

			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Seconda matrice:");

		for(int d=0;d<2;d++)
		{
			for(int e=0;e<3;e++)
			{
				
				System.out.print(Matrice2 [d][e]+"\t" );
			}
			System.out.println(" ");	
		}
		System.out.println(" ");
		System.out.println("somma delle matrici:");

		for(int d=0;d<2;d++)
		{
			for(int e=0;e<3;e++)
			{
				Matrice3[d][e] = Matrice1[d][e]+ Matrice2[d][e];
				System.out.print(Matrice3[d][e]+"\t" );	
			}
			System.out.println(" ");	
		}


	}
}*/

import java.util.Scanner;
public class aRray {
public static void main(String[] args) {
	
Scanner input= new Scanner(System.in);

System.out.print("Inserisci il numero: ");	

int[] aRray= {4, 5, 7, 11, 9, 13, 8, 12};
int somma= input.nextInt();
int ris;
	
for(int i=0; i<aRray.length; i++){
	for(int j=i+1; j<aRray.length; j++){
		ris= aRray[i] + aRray[j];
		if(ris ==somma)
			System.out.println(aRray[i]+"\t"+aRray[j] );
	}
	// Che bello il mondo!!!
}
} 
}
	
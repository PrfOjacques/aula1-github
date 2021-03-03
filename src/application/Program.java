package application;
import java.util.Locale;
import java.util.Scanner; //pacote de leitura

/************************************************
 * •Atalhos:                                    *
 *    •Importar classes: CTRL + SHIFT + O       *
 *    •Autoendentação: CTRL + SHIFT + F         *         
 *    •sysout CTRL + espaço                     *      
 ************************************************/

/************************************************
 * •File/New/JavaProject                        *
 *    •Nome do projeto                          *
 *    •src botaoDir New Class NomeClasse        *         
 *         •Nome do package                     *
 *         •public static void main             *      
 ************************************************/


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Locale.setDefault(Locale.US);
				Scanner sc= new Scanner(System.in); //objeto do tipo Scanner
				System.out.println("Quantidade de números: ");//sysou CTRL + ESPAÇO
				int n= sc.nextInt();
				double[] vect= new double[n];
				
				
				for(int i=0; i<n; i++) 
					vect[i] = sc.nextDouble();
				
				double sum= 0.0;
				
				for(int i=0; i<n; i++) 
					sum+= vect[i];
				
				double avg= sum/ n;
				
				System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
				sc.close();
				
				System.out.println();
				String[] vectStr= new String[] {"Maria", "Bob", "Alex"};
				for(int i=0; i< vectStr.length; i++) 
					System.out.println(vectStr[i]);
				
				for(String obj: vectStr) //for each
					System.out.println(obj);
				
				/*int x;
				String s1, s2, s3;
				x= sc.nextInt();
				s1= sc.nextLine();//necessário para capturar o enter de x
				s2= sc.nextLine();
				s3= sc.nextLine();
				System.out.println("DADOS DIGITADOS:");
				System.out.println(x);
				System.out.println(s1);
				System.out.println(s2);
		        System.out.println(s3);*/

	}

}
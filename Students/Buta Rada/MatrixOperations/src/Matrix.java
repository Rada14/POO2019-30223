import java.util.Scanner;
import java.math.BigDecimal;
public class Matrix {
	static Scanner  scan=new Scanner(System.in);
	  public  static void addMatrix()
			{   System.out.println("Introduceti nr de coloane ale matricelor: \n");
				int coloane3=scan.nextInt();
				System.out.println("Introduceti nr de linii ale matricelor: \n");
				int linii3=scan.nextInt();
				BigDecimal[][]  matrix3=new BigDecimal[linii3][coloane3];
				BigDecimal[][] matrix4=new BigDecimal[linii3][coloane3];
				BigDecimal[] w=new BigDecimal[linii3*coloane3];
				System.out.println("Elementele primei matrice sunt: \n");
				
				for(int i=0;i<linii3*coloane3;i++)
					w[i]=scan.nextBigDecimal();
				int z=0;
				for(int i=0;i<linii3;i++) {
					for(int j=0;j<coloane3;j++)
					{matrix3[i][j]=w[z++];
					System.out.print("  "+matrix3[i][j]);
					}
					System.out.print(" \n ");
				}
				System.out.println("Elementele  matricei 2  sunt: \n");
				for(int i=0;i<linii3*coloane3;i++)
					w[i]=scan.nextBigDecimal();
				for(int i=0;i<linii3;i++) {
					for(int j=0;j<coloane3;j++)
					{matrix4[i][j]=w[i];
					System.out.print("  "+matrix4[i][j]);
					}
					System.out.print(" \n ");
				}
					System.out.println("Matricea suma este: \n");
				BigDecimal[][] sum=new BigDecimal[linii3][coloane3];
				for(int i=0;i<linii3;i++) {
				for(int j=0;j<coloane3;j++)
				{  sum[i][j]=matrix3[i][j].add(matrix4[i][j]);
				   System.out.print("  "+sum[i][j]);
				}
				System.out.println("\n ");
			}
			}
	
	  public  static void subbMatrix()
		{   System.out.println("Introduceti nr de coloane ale matricelor: \n");
			int coloane3=scan.nextInt();
			System.out.println("Introduceti nr de linii ale matricelor: \n");
			int linii3=scan.nextInt();
			BigDecimal[][]  matrix3=new BigDecimal[linii3][coloane3];
			BigDecimal[][] matrix4=new BigDecimal[linii3][coloane3];
			BigDecimal[] w=new BigDecimal[linii3*coloane3];
			System.out.println("Elementele primei matrice sunt: \n");
			
			for(int i=0;i<linii3*coloane3;i++)
				w[i]=scan.nextBigDecimal();
			int z=0;
			for(int i=0;i<linii3;i++) {
				for(int j=0;j<coloane3;j++)
				{matrix3[i][j]=w[z++];
				System.out.print("  "+matrix3[i][j]);
				}
				System.out.print(" \n ");
			}
			System.out.println("Elementele  matricei 2  sunt: \n");
			for(int i=0;i<linii3*coloane3;i++)
				w[i]=scan.nextBigDecimal();
			for(int i=0;i<linii3;i++) {
				for(int j=0;j<coloane3;j++)
				{matrix4[i][j]=w[i];
				System.out.print("  "+matrix4[i][j]);
				}
				System.out.print(" \n ");
			}
				System.out.println("Matricea diferenta este: \n");
			BigDecimal[][] dif=new BigDecimal[linii3][coloane3];
			for(int i=0;i<linii3;i++) {
			for(int j=0;j<coloane3;j++)
			{  dif[i][j]=matrix3[i][j].subtract(matrix4[i][j]);
			   System.out.print("  "+dif[i][j]);
			}
			System.out.println("\n ");
		}
		}

 public static void multiplyMatrix()
 {  System.out.println("Introduceti nr de coloane ale matricelor: \n");
	int coloane3=scan.nextInt();
	System.out.println("Introduceti nr de linii ale matricelor: \n");
	int linii3=scan.nextInt();
	BigDecimal[][]  matrix3=new BigDecimal[linii3][coloane3];
	BigDecimal[][] matrix4=new BigDecimal[linii3][coloane3];
	BigDecimal[] w=new BigDecimal[linii3*coloane3];
	System.out.println("Elementele primei matrice sunt: \n");
	
	for(int i=0;i<linii3*coloane3;i++)
		w[i]=scan.nextBigDecimal();
	int z=0;
	for(int i=0;i<linii3;i++) {
		for(int j=0;j<coloane3;j++)
		{matrix3[i][j]=w[z++];
		System.out.print("  "+matrix3[i][j]);
		}
		System.out.print(" \n ");
	}
	System.out.println("Elementele  matricei 2  sunt: \n");
	for(int i=0;i<linii3*coloane3;i++)
		w[i]=scan.nextBigDecimal();
	z=0;
	for(int i=0;i<linii3;i++) {
		for(int j=0;j<coloane3;j++)
		{matrix4[i][j]=w[z++];
		System.out.print("  "+matrix4[i][j]);
		}
		System.out.print(" \n ");
	}
		System.out.println("Matricea produs  este: \n");
	BigDecimal[][] prod=new BigDecimal[linii3][coloane3];
	for(int i=0;i<linii3;i++) {
		
	for(int j=0;j<coloane3;j++)
	{ 
		for(int k=0;k<linii3*coloane3;k++)
		{   BigDecimal aux=matrix3[i][k].multiply(matrix4[k][j]);
		prod[i][j]=prod[i][j].add(aux);
		

	}

	}
	}
	
	for(int i=0;i<linii3;i++) {
		for(int j=0;j<coloane3;j++)
			System.out.print(" " + prod[i][j]);
		System.out.println("\n");
	}
}
	 
 
	
	
	public static void scalarMatrix()
			{   System.out.println("Introduceti nr de coloane al matricei: \n");
				int coloane3=scan.nextInt();
				System.out.println("Introduceti nr de linii al matricei: \n");
				int linii3=scan.nextInt();
				BigDecimal[][]  matrix3=new BigDecimal[linii3][coloane3];
		        BigDecimal[] w=new BigDecimal[linii3*coloane3];
				
				System.out.println("Elementele matricei sunt: \n");
				
				for(int i=0;i<linii3*coloane3;i++)
					w[i]=scan.nextBigDecimal();
				int z=0;
				for(int i=0;i<linii3;i++) {
					for(int j=0;j<coloane3;j++)
					{matrix3[i][j]=w[z++];
					System.out.print("  "+matrix3[i][j]);
					}
					System.out.print(" \n ");
				}
			System.out.println("Scalarul dorit este: \n");
			BigDecimal scalar=scan.nextBigDecimal();
			
					System.out.println("Matricea inmultita cu scalarul dat  este: \n");
				BigDecimal[][] scal=new BigDecimal[linii3][coloane3];
				for(int i=0;i<linii3;i++) {
				for(int j=0;j<coloane3;j++)
				{  scal[i][j]=matrix3[i][j].multiply(scalar);
				   System.out.print("  "+scal[i][j]);
				}
				System.out.println("\n ");
			}
			}
	public static void Determinant()
	{
	
	    Scanner scan=new Scanner(System.in);
	        int order=3;
	        int[][] matrix=new int[3][3];
	        System.out.println("Elementele matricei");
	        int i,j;
	        for(i=0;i<matrix.length;i++){
	            for(j=0;j<matrix[i].length;j++){
	                matrix[i][j]=scan.nextInt();
	                
	                }
	            }
	        
	      
	        int determinant,x,y;
	        int z ;
	        x=(matrix[0][0] * (matrix[1][1] * matrix[2][2]
	                       - matrix[1][2] * matrix[2][1]));
	        y=(matrix[0][1] * (matrix[1][0] * matrix[2][2]
	                       - matrix[1][2] * matrix[2][0]));
	        z=(matrix[0][2] * (matrix[1][0] * matrix[2][1]
	                       - matrix[1][1] * matrix[2][0]));
	        determinant= x - y + z;
	        System.out.println("Determinantul este  "+ determinant);
	 
	    }
	public static void equalMatrix()
	{
	 System.out.println("Introduceti nr de coloane ale matricelor: \n");
		int coloane3=scan.nextInt();
		System.out.println("Introduceti nr de linii ale matricelor: \n");
		int linii3=scan.nextInt();
		BigDecimal[][]  matrix3=new BigDecimal[linii3][coloane3];
		BigDecimal[][] matrix4=new BigDecimal[linii3][coloane3];
		BigDecimal[] w=new BigDecimal[linii3*coloane3];
		System.out.println("Elementele primei matrice sunt: \n");
		
		for(int i=0;i<linii3*coloane3;i++)
			w[i]=scan.nextBigDecimal();
		int z=0;
		for(int i=0;i<linii3;i++) {
			for(int j=0;j<coloane3;j++)
			{matrix3[i][j]=w[z++];
			System.out.print("  "+matrix3[i][j]);
			}
			System.out.print(" \n ");
		}
		System.out.println("Elementele  matricei 2  sunt: \n");
		for(int i=0;i<linii3*coloane3;i++)
			w[i]=scan.nextBigDecimal();
		z=0;
		for(int i=0;i<linii3;i++) {
			for(int j=0;j<coloane3;j++)
			{matrix4[i][j]=w[z++];
			System.out.print("  "+matrix4[i][j]);
			}
			System.out.print(" \n ");
		}
		
		int dif=0;
		for (int i=0;i<linii3;i++)
		for(int j=0;j<coloane3;j++)
			if(!(matrix3[i][j].equals(matrix4[i][j])))
				dif=1;
		if(dif==1)
				System.out.println("Matricele sunt diferite!");
               else
		 System.out.println("Matricele sunt identice!");
                
                
		


	}
	
	public static void identityMatrix()
	{int identity=1;
	   System.out.println("Introduceti nr de coloane ale matricei: \n");
				int coloane=scan.nextInt();
				System.out.println("Introduceti nr de linii ale matricei: \n");
				int linii=scan.nextInt();
				BigDecimal[][]  matrix=new BigDecimal[linii][coloane];
			
				BigDecimal[] w=new BigDecimal[linii*coloane];
				System.out.println("Elementele  matricei sunt: \n");
				
				for(int i=0;i<linii*coloane;i++)
					w[i]=scan.nextBigDecimal();
				int z=0;
				for(int i=0;i<linii;i++) {
					for(int j=0;j<coloane;j++)
					{matrix[i][j]=w[z++];
					System.out.print("  "+matrix[i][j]);
					if(i==j) {
						if(!(matrix[i][j].equals(1)))
							identity=0;
					}
					else
						if(i!=j)
							if(!(matrix[i][j].equals(0)))
								identity=0;
					}
					System.out.print(" \n ");
				}
		
			if(identity==1)
				System.out.println("Matricea e de identitate!");
			else
				System.out.println("Matricea nu e de identitate!");
		} 
	
	
	public static void isZero()
	{
		 System.out.println("Introduceti nr de coloane ale matricei: \n");
			int coloane=scan.nextInt();
			System.out.println("Introduceti nr de linii ale matricei: \n");
			int linii=scan.nextInt();
			BigDecimal[][]  matrix=new BigDecimal[linii][coloane];
		
			BigDecimal[] w=new BigDecimal[linii*coloane];
			System.out.println("Elementele  matricei sunt: \n");
			
			for(int i=0;i<linii*coloane;i++)
				w[i]=scan.nextBigDecimal();
			int z=0;
			for(int i=0;i<linii;i++) {
				for(int j=0;j<coloane;j++)
				{matrix[i][j]=w[z++];
				System.out.print("  "+matrix[i][j]);
				}
				System.out.print(" \n ");
			}
			int zero=1;
		for(int i=0;i<linii;i++)
			for(int k=0;k<coloane;k++)
			{
				if(!(matrix[i][k].equals(0)))
					zero=0;
			}
			
		if(zero==1)
			System.out.println("Matricea e formata doar din 0!");
		else
			System.out.println("Matricea nu e formata doar din 0!");
	}
		 
	public static void main(String args[])
	{   /*  BigDecimal[][] Matrix1=new BigDecimal[1000][1000];
		  BigDecimal[][] Matrix2=new BigDecimal[1000][1000];
		int i,j,z;

			Scanner scann=new Scanner(System.in);
			System.out.println("Construim prima matrice");
			System.out.println("Introduceti nr de linii pentru prima matrice: \n");
			int linii1=scann.nextInt();
			System.out.println("  \n Introduceti nr de coloane pentru prima matrice: \n");
			int  coloane1= scann.nextInt();
			System.out.println("Introduceti elementele matricii :\n");
			BigDecimal y[] = new BigDecimal[linii1*coloane1];
			for( z=0;z<linii1*coloane1;z++) {
				
			   y[z]=scann.nextBigDecimal();
			}
			z=0;
			for( i=0;i<linii1;i++) {
				for( j=0;j<coloane1;j++) {
					Matrix1[i][j]=y[z++];
				
					}
			
		  }
			System.out.println("Afisam prima matrice : \n");
			for( i=0;i<linii1;i++) {
				for( j=0;j<coloane1;j++) {
			System.out.print(Matrix1[i][j] + "   ");
					}
				System.out.println("\n");
		  }
		 
			System.out.println("Construim a doua matrice");
		     System.out.println("Introduceti nr de linii pentru a doua matrice: \n");
			int linii2=scann.nextInt();
			System.out.println("Introduceti nr de coloane pentru a doua  matrice: \n");
			int coloane2=scann.nextInt();
			System.out.println("Introduceti elementele matricii");
			BigDecimal w[] = new BigDecimal[linii2*coloane2];
			
			for( z=0;z<linii2*coloane2;z++) {
				
				   w[z]=scann.nextBigDecimal();
				}
				z=0;
				for( i=0;i<linii2;i++) {
					for( j=0;j<coloane2;j++) {
						Matrix2[i][j]=w[z++];
					
						}
				
			  }
			System.out.println("Afisam a doua  matrice : \n");
			for( i=0;i<linii2;i++) {
				for(j=0;j<coloane2;j++) {
			System.out.print(Matrix2[i][j] + "   ");
					}
				System.out.println("\n");
		  }*/
			addMatrix();
	       subbMatrix();
	       multiplyMatrix();
	       scalarMatrix();
	       Determinant();
		   equalMatrix();
		isZero();
		identityMatrix();
	}
}
			
			
			
			
				
	
	
	


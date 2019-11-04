public class Loterie_2 {
	public static void main(String[] args)
	{
	System.out.println("Extragerea a 6 numere random : ");
		int[] numbers =new int[6];
	    numbers[0]=(int) ((48*Math.random())+1);
	    numbers[1]=(int) ((48*Math.random())+1);
	    numbers[2]=(int) ((48*Math.random())+1);
	    numbers[3]=(int) ((48*Math.random())+1);
	    numbers[4]=(int) ((48*Math.random())+1);
	    numbers[5]=(int) ((48*Math.random())+1);
	    
	    System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " " + numbers[4] + " " + numbers[5]);
	    
	}
}

import java.lang.String;
import java.lang.Character;
public class NameInverter {


	public static boolean isBlankString(String s)
   
   {
	   return s==null ||s.trim().isEmpty();
   }
   
   public static boolean verifyContainsWhiteSpace(String s)
   { boolean containsWhiteSpace=false;
	   for (int i=0;i<s.length()&&!containsWhiteSpace;i++)
              if(Character.isWhitespace(s.charAt(i)))
            	  containsWhiteSpace=true;
	   return containsWhiteSpace;
   }
   public static boolean verifyContainsDot(String s)
   { boolean containsDot =false;
	   for (int i=0;i<s.length()&&!containsDot;i++)
              if(s.charAt(i)=='.')
            	  containsDot=true;
	   return containsDot;
   }
     
     public static void  inverterFunction(String t)
     { 
    	 
    	 String[] aux=t.split(" ");
    	 System.out.println("\n Numele dat pentru transformare  este : ");
          	for(int z=0;z<aux.length;z++){
                 System.out.print(aux[z]+ " ");
      }
          	System.out.println("\n");
    	System.out.println("Avem   "+ (aux.length) + "  elemente.");
        System.out.println(" Avem "+ t.length() + " caractere.");
    	
	String[] auxInvers= new String[aux.length];
  
    
    if(t.length()==0)
    {
    		System.out.println("Empty string!");
          
 
    	}
    	
    		if(isBlankString(t)==true) {
    		System.out.println("Blank string!");
    		     
    			
    		}
    		else if(verifyContainsWhiteSpace(t)==false) {
    			System.out.println("Avem doar un nume : "+t);
                
    		 }
    		else if(verifyContainsWhiteSpace(t)) 
    		{ int i=1;
    		    auxInvers[0]=aux[aux.length-1];
    		    for(int j=0;j<aux.length-1;j++)
    	          if(!verifyContainsDot(aux[j]))
    	        		  {
    	        	           auxInvers[i++]=aux[j];
    	        	       
    	        		  }
    	        for(int j=0;j<aux.length-1;j++)
    	        	if(verifyContainsDot(aux[j]))
    	        		auxInvers[i++]=aux[j];
    	        System.out.println("Numele dupa transformare:\n");
    	        for(int z=0;z<auxInvers.length;z++)
    	        System.out.print(auxInvers[z]+ " ");  
    		}

     }
     
    
    			
     
	
	public static void main (String[] args)
	{
		
		  System.out.println("Verificare functii: \n");
		  System.out.println(isBlankString("      "));//true
		System.out.println(verifyContainsWhiteSpace("Ana are multe mere "));//true
          System.out.println(verifyContainsDot("Ana are  mere . mutesl"));//true
          System.out.println(verifyContainsDot("Maria mananca un mar !"));//false
		inverterFunction("Ana");//Ana
		inverterFunction("Cristina Marginean");//Marginean Cristina
		inverterFunction("Mrs. Bianca Maria Ilovan");//Ilovan Bianca Maria Mrs.
		inverterFunction("Mrs. Dd. Mariana Cerasela Ormenisan");

		
	
}
}
	

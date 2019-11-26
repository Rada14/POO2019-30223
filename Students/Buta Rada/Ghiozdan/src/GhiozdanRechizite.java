
public class GhiozdanRechizite  {
 Rechizita[] rechizite;
 private int nrRechizite, nrManuale,nrCaiete;
 
     GhiozdanRechizite(int maximRechizite)
     {
    	 this.nrRechizite=0;
    	 this.nrManuale=0;
    	 this.nrCaiete=0;
    	 rechizite=new Rechizita[maximRechizite];
     }
       
       public void addCaiet(Caiet a)
       {
    	   rechizite[nrRechizite++]=a;
    	    this.nrCaiete++;
       }
       
       public void addManual(Manual a )
       {
    	    rechizite[nrRechizite++]=a;
    	    this.nrManuale++;
       }
       
       public void listItems()
       {System.out.println("\n Lista cu toate rechizitele: \n");
    	   for(int i =0;i<nrRechizite;i++)
    	   {
    		   System.out.println(rechizite[i].getNume());
    	   }
       }
       
       public void listManuals()
       {
    	   System.out.println("\n Lista manualelor: \n");
    	   for(int i=0;i<nrRechizite;i++)
    	   {
    		    if(rechizite[i] instanceof Manual)
    		    	System.out.println(rechizite[i].getNume());
    		   
    	   }
    	   System.out.println("\n Nr manualelor este "+ nrManuale);
       }
       public void listCaiete()
       {
    	   System.out.println("Lista caietelor: \n");
    	   for(int i=0;i<nrRechizite;i++)
    	   {
    		    if(rechizite[i] instanceof Caiet)
    		    	System.out.println(rechizite[i].getNume());
    		       
    	   }
    	   System.out.println("\nLista caietelor este "+ nrCaiete);
       }
       
       public int getNrRechizite()
       {
    	   return nrRechizite;
       }
       
       public int getNrCaiete()
       {
    	   return nrCaiete;
    	   
       }
       public int getNrManuale()
       {
    	   return nrManuale;
       }
}

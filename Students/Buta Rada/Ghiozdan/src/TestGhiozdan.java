
public class TestGhiozdan {
public static void   main (String[] args)
{  GhiozdanRechizite ghiozdan=new GhiozdanRechizite(100);
	Caiet caiet1=new Caiet("Informatica");
	Caiet caiet2=new Caiet("Matematica");
	Caiet caiet3=new Caiet("Lb. Romana");
	Caiet caiet4=new Caiet("Lb.Engleza");
	Caiet caiet5=new Caiet("Lb.Franceza");
	Caiet caiet6=new Caiet("Geografie");
	Caiet caiet7=new Caiet("Istorie");
	Caiet caiet8=new Caiet("Biologie");
	Caiet caiet9=new Caiet("Fizica");
	Caiet caiet10=new Caiet("Chimie");
	Caiet caiet11=new Caiet("Religie");
	Manual manual1=new Manual("Informatica");
	Manual manual2=new Manual("Matematica");
	Manual manual3=new Manual("Lb. Romana");
	Manual manual4=new Manual("Lb.Engleza");
	Manual manual5=new Manual("Lb.Franceza");
	Manual manual6=new Manual("Geografie");
	Manual manual7=new Manual("Istorie");
	Manual manual8=new Manual("Biologie");
	Manual manual9=new Manual("Fizica");
	Manual manual10=new Manual("Chimie");
	Manual manual11=new Manual("Religie");
	Manual manual12=new Manual("Stiintele naturii");
	Manual manual13=new Manual("Cultura Civica");
	
     ghiozdan.addCaiet(caiet1);
     ghiozdan.addCaiet(caiet2);
     ghiozdan.addCaiet(caiet3);
     ghiozdan.addCaiet(caiet4);
     ghiozdan.addCaiet(caiet5);
     ghiozdan.addCaiet(caiet6);
     ghiozdan.addCaiet(caiet7);
     ghiozdan.addCaiet(caiet8);
     ghiozdan.addCaiet(caiet9);
     ghiozdan.addCaiet(caiet10);
     ghiozdan.addCaiet(caiet11);
     ghiozdan.addManual(manual1);
     ghiozdan.addManual(manual2);
     ghiozdan.addManual(manual3);
     ghiozdan.addManual(manual4);
     ghiozdan.addManual(manual5);
     ghiozdan.addManual(manual6);
     ghiozdan.addManual(manual7);
     ghiozdan.addManual(manual8);
     ghiozdan.addManual(manual9);
     ghiozdan.addManual(manual10);
     ghiozdan.addManual(manual11);
     ghiozdan.addManual(manual12);
     ghiozdan.addManual(manual13);
     ghiozdan.listItems();
     ghiozdan.listManuals();
     ghiozdan.listCaiete();
     System.out.println(" \n Nr rechizite : \n "+ ghiozdan.getNrRechizite() + " \n Nr manuale : \n "+ ghiozdan.getNrManuale() + "\n Nr caiete: \n"+ ghiozdan.getNrCaiete()); 
     
    

}
}

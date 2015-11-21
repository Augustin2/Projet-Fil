import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Evaluation {
	
	static HashMap<String,String> liste = new HashMap();
	static List<String> liste2 = new ArrayList();
	static double Somme=0;
	static String [] parts;
	static int n;
	
	
	public static void main(String args[]){
		
		ModeleBigramme m = new ModeleBigramme();
		String chaine = "";
		ReadFile1 r = new ReadFile1();
		chaine = r.lire_fichier();
		parts = chaine.split(" ");
		n = parts.length;
		liste=m.bigramme();
		//System.out.println(liste);
	
		for (Map.Entry list : liste.entrySet()) {
			Somme=Somme+Double.parseDouble(list.getValue().toString())/n;
			
			
			
			
		}
	System.out.println(-Math.log(Somme/n));
	}

}

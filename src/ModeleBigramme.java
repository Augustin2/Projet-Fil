import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ModeleBigramme {

	static String[] parts;
	static int occu2;
	static int occu3,n;
	static double s=0;
	static List<String> l = new ArrayList();
	static List<String> bigramme = new ArrayList();
	static List<String> bigramme_log = new ArrayList();
	static HashMap<String,String> evaluation = new HashMap();
	
	public HashMap<String,String> bigramme(){
		
		ModeleUnigramme m = new ModeleUnigramme();
		String chaine = "";
		String chaine2 = "";
		ReadFile1 r = new ReadFile1();

		chaine = r.lire_fichier();
		parts = chaine.split(" ");
		n=parts.length;
		for (int i = 0; i < parts.length; i++) {
			for (int j = i + 1; j < parts.length; j++) {

				l.add(parts[i] + "/" + parts[j]);

			}
		}

		for (int i = 0; i < parts.length; i++) {
			for (int j = i + 1; j < parts.length; j++) {
				occu2 = m.nombreOccurrence(parts[i], parts);

				occu3 = Collections.frequency(l, parts[i] + "/" + parts[j]);

				bigramme.add(parts[i] + "/" + parts[j] + " =  "
						+ String.valueOf(occu3 / occu2));
			
				bigramme_log.add(parts[i] + "/" + parts[j] + "="
						+ String.valueOf(-Math.log(occu3/occu2)));
				
				evaluation.put(parts[i] + "/" + parts[j],String.valueOf((occu3/occu2)));
			
				
			

			}

		}
		
		
		
		
		System.out.println(bigramme);
		System.out.println(bigramme_log);
		//System.out.println(evaluation);
	
		return evaluation;
		
	}
	
	
	

	public static void main(String args[]) throws IOException {
		
		ModeleBigramme m= new ModeleBigramme();
		m.bigramme();

		
	}
}

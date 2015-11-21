import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Traduction {

	static String[] parts;
	static String[] parts2;
	static String chaine;
	static String fichier = "table_taduction.txt";
	
	static List<String> corpus_traduit = new ArrayList();
	static List<String> liste = new ArrayList();
static List<String> c = new ArrayList();
static List<String>text_traduit= new ArrayList();
static HashMap<String, String> text_traduit2 = new HashMap();
static HashMap<String, String> traduction = new HashMap();
	static List<String> corpus = new ArrayList();
	//static HashMap<String, String> MaxProp = new HashMap();
	static HashMap<String, String> liste2 = new HashMap();
    //static double somme=0;
	public static void main(String args[]) {
		Lire_Corpus l= new Lire_Corpus();
		c=l.lire_fichier();
		text_traduit=l.lire_text();
		for (int i = 0; i < text_traduit.size(); i++) {

			String[] string = text_traduit.get(i).split(" ");

			String motAn = string[0];
			//System.out.println(string[0]);
			String codeAn = string[1];
			//String prop = string[2];
			//System.out.println(string[2]);
			text_traduit2.put(motAn,codeAn);

		}
	
		
/////////////////////////////////////////////////////////////
		for(int i=0;i<c.size();i++){
			
			parts=c.get(i).split(" ");
			
		}
for(int j= 0;j<parts.length;j++){
	
	corpus.add(parts[j]);
	
}
		try {

			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			while ((ligne = br.readLine()) != null) {

				liste.add(ligne);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());

		}
		// System.out.println(liste);

		for (int i = 0; i < liste.size(); i++) {

			String[] string = liste.get(i).split(" ");

			String codeFR = string[0];
			//System.out.println(string[0]);
			String codeAn = string[1];
			//String prop = string[2];
			//System.out.println(string[2]);
			liste2.put(codeFR,codeAn);

		}

//System.out.println(corpus);
  ///System.out.println(text_traduit2);
  //Collection c= liste2.values();
		for (Map.Entry list : liste2.entrySet()) {
		//Collections c = list.getValue();
	for(String o:corpus){
		
		if(list.getKey().equals(o)){
			
			traduction.put(String.valueOf(list.getKey()),String.valueOf(list.getValue()));
			
			
		}
		
	
	}
         
		}
		System.out.println(traduction);
		
	for (Map.Entry list : text_traduit2.entrySet()) {
		for (Map.Entry list2 : traduction.entrySet()) {
		if(list.getValue().equals(list2.getValue())){
			
			
			corpus_traduit.add(list.getKey().toString());
		}
			
		}
			
			
		}
		System.out.println(corpus_traduit);
	}

}

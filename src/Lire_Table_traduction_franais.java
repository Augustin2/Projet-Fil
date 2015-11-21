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

public class Lire_Table_traduction_français {

	static String[] parts;

	static String chaine;
	static String fichier = "table_taduction.txt";
	static List<String> liste = new ArrayList();
	static List<String> c = new ArrayList();
	static List<String> corpus = new ArrayList();
	static HashMap<String, String> MaxProp = new HashMap();
	static HashMap<String, String> liste2 = new HashMap();
    static double somme=0;
	public static void main(String args[]) {
		Lire_Corpus l= new Lire_Corpus();
		c=l.lire_fichier();
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
			String prop = string[2];
			//System.out.println(string[2]);
			liste2.put(codeFR,prop);

		}

//System.out.println(corpus);
  // System.out.println(liste2);
  //Collection c= liste2.values();
		for (Map.Entry list : liste2.entrySet()) {
		//Collections c = list.getValue();
	for(String o:corpus){
		
		if(list.getKey().equals(o)){
			
			MaxProp.put(String.valueOf(list.getKey()),String.valueOf(list.getValue()));
			
			
		}
		
	
	}
         /*for(int i=0;i<corpus.size();i++){
        	if(corpus.contains(list.getKey())) {
        		
        		MaxProp.add(list.getKey()+":"+list.getValue());
        		
        	}
        	 
        	 
         }*/
		}
		
		
		//System.out.println(MaxProp);
		for (Map.Entry list : MaxProp.entrySet()){
		
			somme=somme+Double.parseDouble(list.getValue().toString());
			
			
			
		}
		System.out.println(somme);

	}

}

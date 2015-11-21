
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ModelUnigram {

	
	public static String [] mot;
	 static int n;
 static HashMap hm = new HashMap();
 static int occurence;	static String[] parts;
 
 
 public static int nombreOccurrence(String mot, String [] array){
int nb = 0;
for(String s : array)
 if(s.equals(mot))
nb++;
return nb;
 }

	
 public static void main(String []args){
		String chaine="";
Rread_file r= new Rread_file();
chaine=r.lire_fichier();
				parts = chaine.split(" ");
				n=parts.length;
		for(int i=0;i<parts.length;i++){
			occurence=nombreOccurrence(parts[i],parts);
			//System.out.println(occurence);
		    hm.put(parts[i],occurence % n);
		
		 
				}	
		   System.out.println(hm);
				}
			

	

}
		
					
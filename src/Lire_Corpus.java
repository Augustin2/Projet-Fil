import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Lire_Corpus {
	static List<String> liste= new ArrayList();
	static List<String> text= new ArrayList();
	static String fichier ="exemple.txt";
	static String texte ="lextable.english.txt";

	public List<String> lire_fichier(){

	
	//String chaine="";

	try{
	
		InputStream ips=new FileInputStream(fichier); 
		InputStreamReader ipsr=new InputStreamReader(ips);
		BufferedReader br=new BufferedReader(ipsr);
		String ligne;
		while ((ligne=br.readLine())!=null){
		
			liste.add(ligne);
		
			
		}
	
	br.close(); 
}		
catch (Exception e){
	System.out.println(e.toString());
	
}
	return liste;
}
	
	public List<String> lire_text(){
		

		try{
		
			InputStream ips=new FileInputStream(texte); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
			
				text.add(ligne);
			
				
			}
		
		br.close(); 
	}		
	catch (Exception e){
		System.out.println(e.toString());
		
	}
		
		
		
		
		return text;
	}
	
	
	
public static void main(String args[]){
	
	Lire_Corpus r= new Lire_Corpus();
	System.out.println(r.lire_fichier());
	
	
	
	
	
}

}
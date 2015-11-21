import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Lire_Lexique {
	
	public String lire_fichier(){

	
	String chaine="";
	String fichier ="lexique_np.fr.code";

	try{
	
		InputStream ips=new FileInputStream(fichier); 
		InputStreamReader ipsr=new InputStreamReader(ips);
		BufferedReader br=new BufferedReader(ipsr);
		String ligne;
		while ((ligne=br.readLine())!=null){
		
			chaine+=ligne;
		
			
		}
	
	br.close(); 
}		
catch (Exception e){
	System.out.println(e.toString());
	
}
	return chaine;
}
	
public static void main(String args[]){
	
	Lire_Lexique r= new Lire_Lexique();
	System.out.println(r.lire_fichier());
	
	
	
	
	
}

}
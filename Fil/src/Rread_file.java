import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Rread_file {
	
	public String lire_fichier(){

	
	String chaine="";
	String fichier ="train.fr.code";

	try{
	
		InputStream ips=new FileInputStream(fichier); 
		InputStreamReader ipsr=new InputStreamReader(ips);
		BufferedReader br=new BufferedReader(ipsr);
		String ligne;
		while ((ligne=br.readLine())!=null){
		
			chaine+=ligne+"\n";
		
			
		}
	
	br.close(); 
}		
catch (Exception e){
	System.out.println(e.toString());
	
}
	return chaine;
}
	
public static void main(String args[]){
	
	Rread_file r= new Rread_file();
	System.out.println(r.lire_fichier());
	
	
}

}
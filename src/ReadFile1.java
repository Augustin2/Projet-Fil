import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile1 {
	
	public String lire_fichier(){

	
	String chaine="";
	String fichier ="exemple.txt";

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
	
	ReadFile1 r= new ReadFile1();
	System.out.println(r.lire_fichier());
	
	
	
	
	
}

}
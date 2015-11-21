import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Tp1 {
	public String [] mot;
	public String [] lireFichier(){
		String chaine="";
		String fichier ="fichier.txt";
	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
			
				chaine+=ligne+"\n";
				String[] parts = chaine.split(" ");
			
				for(int i=0;i<parts.length;i++){
			
					System.out.println(parts[i]);
					mot=parts[i].split("");
					for(int j=0;j<mot.length;j++){
				System.out.println(mot[j]);
			
					}}}
		
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
		
		return mot;
	}
	
	public static void main(String[] args){
		Tp1 t= new Tp1();
		t.lireFichier();
		
}}

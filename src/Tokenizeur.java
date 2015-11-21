import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Tokenizeur {
    static Lire_Corpus c =new Lire_Corpus();
    static Lire_Lexique l =new Lire_Lexique();
    static String chaine1,chaine2;
    static String [] parts1;
    static String [] parts2;
    
    public static void main(String args[]){
    	
    	//chaine1=c.lire_fichier();
    	chaine2=l.lire_fichier();
    	parts1=chaine1.split("[-.,;:?!' ]+");
    	parts2=chaine2.split(" ");
   
    	///Prefixe f = new Prefixe();
    	
    	for(int i=0;i<parts2.length;i++){
    		
    		System.out.println(parts2[i]);
    		
    		
    		
    	}
    	
    	
    	
    }
 
    }

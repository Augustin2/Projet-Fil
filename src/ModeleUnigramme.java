import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModeleUnigramme {

	static String[] parts;
	static int occurence, n;
	static HashMap hm = new HashMap();
	static List<String> l = new ArrayList();

	public static int nombreOccurrence(String mot, String[] array) {
		int nb = 0;
		for (String s : array)
			if (s.equals(mot))
				nb++;
		return nb;
	}
	

	
	
	
public List<String>  unigramme(){
	
	String chaine = "";
	ReadFile1 r = new ReadFile1();
	chaine = r.lire_fichier();
	parts = chaine.split(" ");
	n = parts.length;
	for (int i = 0; i < parts.length; i++) {
		occurence = nombreOccurrence(parts[i], parts);
		l.add(parts[i] + "=" + occurence % n);
	
	}
	
	
	
	
	
	return l ;
	
	
	
	
	
	
}
	public static void main(String[] args) {
		
		ModeleUnigramme m= new ModeleUnigramme();
		System.out.println(m.unigramme());
	

		
	}

}

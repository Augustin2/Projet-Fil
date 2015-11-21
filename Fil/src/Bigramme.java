import java.util.HashMap;
import java.util.StringTokenizer;

public class Bigramme {
	
	 static HashMap hm = new HashMap();
	public static void main(String args []){
		ModelUnigram u= new ModelUnigram();int n;
String chaine,ligne;
String [] parts;
		Rread_file r= new Rread_file();
				chaine=r.lire_fichier();
				//System.out.println(chaine);
		
				
				/*for(int i=0;i<parts.length-1;i++){
				//for(int j=i+1;j<parts.length;j++){
						//System.out.println(parts[i]);
						hm.put(parts[i],parts[i]+"/"+parts[i+1]);
					
						//n=u.nombreOccurrence(parts[i], parts);
						//System.out.println(hm);	
						
					//}
				}*/
				
				System.out.println(hm);
		
	}
	
	
	
	
	

}

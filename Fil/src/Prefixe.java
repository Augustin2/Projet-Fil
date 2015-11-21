import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Prefixe {
    private String c;
    private static String tab[];
    private Prefixe gauche, droit;   
	public static String [] mot; static String chaine="";
	static String fichier ="fichier.txt";
   // CONSTRUCTEURS
    public Prefixe(String c) {
       this.c= c;
    }

    public Prefixe( Prefixe g) {
     
        gauche = g;
 
    } 

    // ACCESSEURS
    public String getValeur() {
        return(c);
    }

    public Prefixe getSousArbreGauche() {
        return(gauche);
    }   

    public Prefixe getSousArbreDroit() {
        return(droit);
    }

    // AFFICHAGE
    public String toString() {
        return toString("\t");
    }

    public String toString(String s) {
	if (gauche!=null) {
	if (droit!=null) 
	    return(s+c+"\n"+gauche.toString(s+"\t")+droit.toString(s+"\t"));
	else
	    return(s+c+"\n"+gauche.toString(s+"\t")+"\n");
        }
        else 
	if (droit!=null) 
	    return(s+c+"\n\n"+droit.toString(s+"\t"));
	else
	    return(s+c+"\n");
    }

   /**
     * Affiche l'arbre selon un parcours prefixe
     */
    public void ParcoursPrefixe() {
	System.out.println(getValeur());
	if (getSousArbreGauche() != null)
	    getSousArbreGauche().ParcoursPrefixe();
	if (getSousArbreDroit() != null)
	    getSousArbreDroit().ParcoursPrefixe();
    }

    public void insertion(String c) {
    	
    	if (c ==getValeur()) {
    	    if (getSousArbreGauche() != null)
    		getSousArbreGauche().insertion(c);
    	    else
    		gauche = new Prefixe(c);
    	}
    	if (c.equals(getValeur())==false) {
    	    if (getSousArbreDroit() != null)
    		getSousArbreDroit().insertion(c);
    	    else 
    		droit = new Prefixe(c);
    	}
        }


   
    public static void main(String[] arg) {
  

    	try{
    		InputStream ips=new FileInputStream(fichier); 
    		InputStreamReader ipsr=new InputStreamReader(ips);
    		BufferedReader br=new BufferedReader(ipsr);
    		String ligne;
    		while ((ligne=br.readLine())!=null){
    		
    			chaine+=ligne+"\n";
    			String[] parts = chaine.split(" ");
    		
    			for(int i=0;i<parts.length;i++){
    		
    				//System.out.println(parts[i]);
    				mot=parts[i].split("");}
    				for(int j=0;j<mot.length;j++){
    		
    			 Prefixe   p=new Prefixe(mot[0]);
    				p.insertion(mot[j]); 
    				p.ParcoursPrefixe();}
    			
    				}
    				
    		
    				
    			
    		
    	
    		br.close(); 	
    	}		
    	catch (Exception e){
    		System.out.println(e.toString());
    	}
    	


    		
  
    
    	
    	}
    	

    }

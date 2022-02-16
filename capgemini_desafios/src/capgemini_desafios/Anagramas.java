package capgemini_desafios;

import java.util.Arrays;
import java.util.HashMap;

	public class Anagramas {
	    public static void main(String[] args) {
	    	subString("ovo");
	    	subString("ifailuhkqq");
			
		}
	    
	    static void subString(String palavra) {
	    	
	    	HashMap<String, Integer> map = new HashMap<>();
	    	
	    	for(int i = 0; i < palavra.length(); i++) {
	    		for(int j = i; j < palavra.length(); j++) {
	    			
	    			char[] letras = palavra.substring(i, j+1).toCharArray();
	    			Arrays.sort(letras);
	    			String numero = new String(letras);
	    			if(map.containsKey(numero)) {
	    				map.put(numero, map.get(numero)+1);
	    			}else {
	    				map.put(numero, 1);
	    			}
	    		}
	    		
	    	}
	    	int contagemAnagramas = 0;
	    	for(String chave: map.keySet()) {
	    		int n = map.get(chave);
	    		contagemAnagramas += (n *(n-1))/2;
	    	}
	    	System.out.println(contagemAnagramas);
	    }
	}
	


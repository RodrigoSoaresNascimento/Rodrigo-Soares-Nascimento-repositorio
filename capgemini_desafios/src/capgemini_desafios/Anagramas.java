package capgemini_desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Anagramas {
 
    public static int isSubstring(String str) {
         	int pairsAnagram = 0;
         	
        // Lista de todas as substrings	
        List<String> substringList = new ArrayList<String>();
         
 
        // interações necessarias para se adicionar substrings a uma lista
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length() ; j++) {
            	
            
            	// formando as subtrings necessarias de acordo com o tamanho da palavra
            	String currentSubString = str.substring(i,j);
            	//adicionando todas as subtrings formadas a lista
            	substringList.add(currentSubString);
            }
        }
        
        for (int h = 0; h < substringList.size(); h++) {
            for (int k = h + 1; k < substringList.size(); k++) {
            			//convertendo as strings da lista em caracteres
            			char[] chars1 = substringList.get(h).toCharArray();
            			char[] chars2 = substringList.get(k).toCharArray();
            			//ordenando as strings para poderem ser verificadas
            			Arrays.sort(chars1);
            			Arrays.sort(chars2);
            			//verificando se as substrings dentro da lista são anagramas
            			if(Arrays.equals(chars1, chars2) == true) {
            				pairsAnagram++;
            			
            	}
            }
        }
 
        
        return pairsAnagram;
    }
 
    public static void main(String[] args) {
        
        String str = "ovo";
        System.out.println(isSubstring(str));
    }
}


package capgemini_desafios;


public class Password {

	private String value;
	
	public Password(String value) {
		this.value = value;
	}
	 public String getValue() {
	        return value;
	    }
	// retorna o numero de caracteres que faltam para deixar uma senha segura
	 public int validateValue() {
		 // como a senha para ser segura tem que possuir ao menos 4 tipos de caracteres diferentes
	        boolean[] requirementsList = new boolean[4];
	        int needCaracteres = 0;

	        for (int i = 0; i < this.value.length(); i++) {
	        	// verifica se a string passada tem um numero
	            if (Character.isDigit(this.value.charAt(i))) {
	                requirementsList[0] = true;
	            }
	            // verifica se a string passada possui letra maiscula
	            if (Character.isUpperCase(this.value.charAt(i))) {
	                requirementsList[1] = true;
	            }
	            // verifica se a string passada possui letra miniscula
	            if (Character.isLowerCase(this.value.charAt(i))) {
	                requirementsList[2] = true;
	            }
	        }
	        // verifica se a string passada possui caracterer especial
	        if (this.value.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$")) {
	            requirementsList[3] = true;
	        }

	        // verifica quantos itens da condição senha segura existem.
	        for (int i = 0; i < requirementsList.length; i++) {
	            if (!requirementsList[i]) {
	                needCaracteres += 1;
	            }
	        }
	        // se a senha possui tamanho menor que 6 verifica quais faltam e quantos precisam ser adicionados
	        if (this.value.length() <= 6) {
	            int sizeDifference = 6 - this.value.length();
	            if(needCaracteres < sizeDifference) {
	                needCaracteres += sizeDifference - needCaracteres;
	            }
	        }
	        

	        return needCaracteres;
	    }
	
	
}

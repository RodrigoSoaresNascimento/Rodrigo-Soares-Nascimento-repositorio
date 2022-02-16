package capgemini_desafios;


public class SenhaComRequisitos {

	String senha;
	
	
	
	boolean contemNumero() {
		
		String temNumero = senha;
		
		boolean valido = false;
		for(int i = 0 ; i < temNumero.length(); i++) {
			if(Character.isDigit(temNumero.charAt(i))) {
				valido = true;
			}
		}
		
		
		return valido;
	}
	
	boolean tamanhoValido() {
		
		String tamanhoValido = senha;
		
		boolean valido = true;
		
		if(tamanhoValido.length() < 6) {
			
			valido = false;
			
		}
		
		return valido;
	}
	
	boolean contemLetraMaiuscula(){
		
		String temMaiscula = senha;
		
		boolean valido = false;
		
		for(int i = 0; i < temMaiscula.length(); i++) {
			
			if(Character.isUpperCase(temMaiscula.charAt(i))) {
				valido = true;
			}
			
		}
		return valido;
		
	}
	
	boolean contemLetraMinuscula() {
		
		String temMinuscula = senha;
		
		boolean valido = false;
		
		for(int i = 0; i < temMinuscula.length(); i++) {
			
			if(Character.isLowerCase(temMinuscula.charAt(i))) {
				valido = true;
			}
			
		}
		return valido;
	}
	
	boolean caracterer() {
		
		String temCaracter = senha;
		boolean valido = false;
		
		if(!temCaracter.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$")) {
			
			valido = true;
			
		}
		return valido;
		
	}
	
	Integer contagem() {
		
		int cont = 0;
		
		if(caracterer() == false) {
			cont++;
		}
		if(contemLetraMinuscula() == false) {
			cont++;
		}
		if(contemLetraMaiuscula() == false) {
			cont++;
		}
		if(contemNumero() == false) {
			cont++;
		}
		
		return cont;
	}
	
	Integer senhaSegura() {
		
		String seguranca = senha;
		int carateresfaltando = 0;
		
		if(tamanhoValido() == false) {
			
			carateresfaltando = 6 - seguranca.length();
			
		}else {
			
			carateresfaltando = contagem();
		}
		
		return carateresfaltando;
	}
	
	
}

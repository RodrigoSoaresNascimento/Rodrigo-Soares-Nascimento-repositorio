package capgemini_desafios;

public class RunAplication {

	public static void main(String[] args) {
		// classe que roda a aplica��o principal da classe Password
		Password password = new Password("Ya3");
        int needCharacters = password.validateValue();
        // condicional que verifica se a senha est� correta
        if(needCharacters == 0) {
            System.out.println(password.getValue());
        } else {
            System.out.println(needCharacters);
        }

	}

}

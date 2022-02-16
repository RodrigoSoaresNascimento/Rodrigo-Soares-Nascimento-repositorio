package capgemini_desafios;

public class Senha {

	public static void main(String[] args) {

		SenhaComRequisitos senha1 = new SenhaComRequisitos();
		
		senha1.senha = "Ya3$";
		
		System.out.println(senha1.senhaSegura());

	}

}

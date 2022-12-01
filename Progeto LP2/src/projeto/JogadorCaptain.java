package projeto;

public class JogadorCaptain extends Jogador {

	public JogadorCaptain(String nome, String sobrenome, String nick, String email, int idade, String senha) {
		super(nome,sobrenome,nick,email,idade,senha);
	}


	@Override
	public double CalcularInfluencia() {
		return getCurtidas()*2.3;
	}

}

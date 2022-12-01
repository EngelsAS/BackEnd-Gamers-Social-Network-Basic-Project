package projeto;

public class JogadorNoob extends Jogador {

	public JogadorNoob(String nome, String sobrenome, String nick, String email, int idade, String senha) {
		super(nome,sobrenome,nick,email,idade,senha);
	}

	@Override
	public double CalcularInfluencia() {
		return getCurtidas()*1.8;
	}

}

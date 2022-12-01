package projeto;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Jogador implements Posts {
	
	private String nome;
	private String sobrenome;
	private String nick;
	private String email;
	private int idade;
	private String senha;
	private int curtidas;
	private ArrayList<String> midias;
	private ArrayList<String> todosposts;
	private ArrayList<Jogos> MeusJogos;
	
	public Jogador() {
		
		nome = "--";
		sobrenome  = "--";
		nick = "--";
		email = "--";
		idade = 00;
		senha = "0000";
		curtidas = 0;
		midias = new ArrayList<String>();
		todosposts = new ArrayList<String>();
		MeusJogos = new ArrayList<Jogos>();
		
	}
	
	public Jogador(String nome, String sobrenome, String nick, String email, int idade, String senha) {
		
		if(nome != null && sobrenome != null && nick != null && email != null && idade >=18 && senha != null ) {
			
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.nick = nick;
			this.email = email;
			this.idade = idade;
			this.senha = senha;
			midias = new ArrayList<String>();
			todosposts = new ArrayList<String>();
			MeusJogos = new ArrayList<Jogos>();
			
		}
		else {
			System.out.println("informaçoes invalidas");
			nome = "--";
			sobrenome  = "--";
			nick = "--";
			email = "--";
			idade = 00;
			senha = "0000";
		}
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getNick() {
		return nick;
	}

	public String getEmail() {
		return email;
	}

	public int getIdade() {
		return idade;
	}

	public String getSenha() {
		return senha;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(nick);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		if(Objects.equals(email, other.email) || Objects.equals(nick, other.nick)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Nome: "+ nome+ " " + sobrenome +"\nNickname: "+ nick +"\nidade: "+ idade;
				
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public void Postar(String texto, String midia) {
		if(texto.length()<=100) {
			midias.add(midia);
			todosposts.add(texto+"\n"+midia);
		}
		else {
			System.out.println("o texto ultrapassou o numero de caracteres");
		}
		
	}
	
	public void ImprimirPost() {
		for(String post:todosposts) {
			
			System.out.println(post);
			
		}
	}

	@Override
	public void curtir() {
		curtidas++;
	}
	
	public double getCurtidas() {
		return curtidas;
	}
	
	public void addJogo(String nome) {
		for(Jogos jogo:Sistema.ListaJogos) {
			if(jogo.getID()==nome.hashCode()) {
				MeusJogos.add(jogo);
				return;
			}
		}
		System.out.println("jogo não encontrado no sistema");
	}
	
	public void ImprimeJogos() {
		for(Jogos jogo:Sistema.ListaJogos) {
			System.out.println(jogo);
		}
	}
	
	public abstract double CalcularInfluencia();

	

}

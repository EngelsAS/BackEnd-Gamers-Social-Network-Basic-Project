package projeto;
import java.util.ArrayList;

public class Sistema{
	
	private ArrayList<Jogador> ListaJogador; 
	static ArrayList<Jogos> ListaJogos; 
	
	public Sistema(){
		
		this.ListaJogador = new ArrayList<Jogador>();
		Sistema.ListaJogos = new ArrayList<Jogos>();
	
		
	}
	
	public void AdicionaJogador(Jogador j) {
		
		if(ListaJogador.size()==0) {
			ListaJogador.add(j);
			return;
		}
		for(Jogador jogador:ListaJogador) {
			
			if(jogador.equals(j)) {
				System.out.println("ja existe um jogador com estes dados");
				return;
			}
		}
		ListaJogador.add(j);
	}
		
	public void AtualizarJogador(String nick, String NovoNick) {
		for(Jogador jogador:ListaJogador) {
			if(jogador.hashCode()==nick.hashCode()){
				jogador.setNick(NovoNick);
				return;
			}
		}
		System.out.println("jogador não encontrado");
	}
	
	public void RemoverJogador(String nick) {
		for(Jogador jogador:ListaJogador) {
			if(jogador.getNick()==nick){
				ListaJogador.remove(jogador);
				System.out.println(nick+" foi removido");
				return;
			}
		}
		System.out.println("jogador não encontrado");
		
	}
	public void ImprimirJogadores() {
		
		
			for(Jogador jogador:ListaJogador) {
				System.out.println(jogador);
			}
			
		}
	
	public void CriarJogos(Jogos j) {
		if(ListaJogos.size()==0) {
			ListaJogos.add(j);
			return;
		}
		for(Jogos jogo:ListaJogos) {
			if(jogo.equals(j)) {
				System.out.println("Esse jogo ja foi adicionado ao sistema");
				return;
			}
		}
		ListaJogos.add(j);
	}
	
	public void AtualizarJogos(String nome, String novoNome) {
		for(Jogos jogo:ListaJogos) {
			if(jogo.getID()==nome.hashCode()) {
				jogo.setNome(novoNome);
				return;
			}
		}
		System.out.println("jogo não encontrado");
	}
	
	public void RemoverJogo(String nome) {
		for(Jogos jogo:ListaJogos) {
			if(jogo.getID()==nome.hashCode()) {
				ListaJogos.remove(jogo);
				return;
			}
		}
		System.out.println("jogo não encontrado");
	}
		
	}
	
	
	



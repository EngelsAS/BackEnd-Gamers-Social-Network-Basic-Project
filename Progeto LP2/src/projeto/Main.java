package projeto;

public class Main {

	public static void main(String[] args) {
		JogadorCaptain player = new JogadorCaptain("engels","antero","engelsas","engelsantero@gmail.com",18,"40028922");
		JogadorNoob player2= new JogadorNoob("angelo","silva","anjin","angelosilva@hotmail.com",37,"6mole6dura");
		Sistema sistema = new Sistema();
		sistema.AdicionaJogador(player);
		sistema.AdicionaJogador(player2);
		sistema.ImprimirJogadores();
		sistema.RemoverJogador("engelsas");
		sistema.ImprimirJogadores();
		player.Postar("Fala tu!", "\"D:\\Steam Games\\steamapps\\common\\Yakuza Kiwami\\EXTRAS\\WALLPAPERS\\1920X1080\\YK_DLUX_DESK_WALLPAPER_8_1920X1080_V3.jpg\"");
		player.ImprimirPost();
		sistema.CriarJogos(new Jogos("FIFA",60.50));
		player.addJogo("FIFA");
		player.ImprimeJogos();
		sistema.CriarJogos(new Jogos("Bomberman",23.80));
		player.addJogo("Bomberman");
		player.ImprimeJogos();
	}
}

package iphone;

public class FuncionalidadesIphone {
	public interface ReprodutorMusical {
	    void tocar();
	    void pausar();
	    void selecionarMusica(String musica);
	}

	public interface AparelhoTelefonico {
	    void ligar(String numero);
	    void atender();
	    void desligar();
	}

	public interface NavegadorInternet {
	    void abrirPagina(String url);
	    void adicionarNovaAba();
	    void atualizarPagina();
	}


}

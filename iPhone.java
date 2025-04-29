package iphone;

import iphone.FuncionalidadesIphone.AparelhoTelefonico;
import iphone.FuncionalidadesIphone.NavegadorInternet;
import iphone.FuncionalidadesIphone.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	@Override
    public void selecionarMusica(String musica) {
        System.out.print("\nSelecionando a música: " + musica);
    }
	
	@Override
    public void tocar() {
        System.out.println("\nTocando música"); // reprodutor musical
    }

	@Override
    public void pausar() {
        System.out.println("Música pausada\n");
    }

	@Override
    public void ligar(String numero) {
        System.out.print("Ligando para: " + numero); // aparelho telefônico
    }

	@Override
    public void atender() {
        System.out.println("\nAtendendo a chamada");
    }
	
	@Override
    public void desligar() {
        System.out.println("Desligando a chamada\n");
    }

	@Override
    public void abrirPagina(String url) {
        System.out.print("Abrindo a página: " + url); // navegador 
    }

	@Override
    public void adicionarNovaAba() {
        System.out.println("\nNova aba adicionada");
    }

	@Override
    public void atualizarPagina() {
        System.out.println("Atualizando página\n");
    }

}

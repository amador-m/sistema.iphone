package iphone;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		iPhone meuIphone = new iPhone();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Iphone de: ");
		String nome = input.nextLine();

        meuIphone.selecionarMusica("Stand by me - Ben E. King");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("01 2345-6789");
        meuIphone.atender();
        meuIphone.desligar();

        meuIphone.abrirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
	}

}

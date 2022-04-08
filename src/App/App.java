package App;

import data.Dados;
import visualizacao.MenuVisual;

/**
 * Criado para ser o menu principal do programa
 */
public class App {
	public static void main(String[] args) {
		Dados.adicionarDono();
		new MenuVisual().setVisible(true);
	}
}

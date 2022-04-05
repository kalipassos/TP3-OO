package controles;

import javax.swing.JButton;

import visualizacao.DonoVisual;
import visualizacao.MenuVisual;

public class MenuControle {
	private final MenuVisual view;

	public MenuControle(MenuVisual view) {
		super();
		this.view = view;
	}

	public void executarBotao(JButton botaoSelecionado) {
		if (botaoSelecionado.equals(view.getBotaoOpcaoDono())) {

		} else if (botaoSelecionado.equals(view.getBotaoOpcaoAnimal())) {
			new DonoVisual().setVisible(true);
			view.dispose();
		} else if (botaoSelecionado.equals(view.getBotaoOpcaoAnfitriao())) {

		} else if (botaoSelecionado.equals(view.getBotaoOpcaoHospedagem())) {

		} else if (botaoSelecionado.equals(view.getBotaoSair())) {
			view.dispose();
		}
	}

}


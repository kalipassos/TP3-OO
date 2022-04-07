package controles;

import javax.swing.JButton;

import visualizacao.AnfitriaoVisual;
import visualizacao.AnimalVisual;
import visualizacao.DonoVisual;
import visualizacao.HospedagemVisual;
import visualizacao.MenuVisual;

public class MenuControle {
	private final MenuVisual view;

	public MenuControle(MenuVisual view) {
		super();
		this.view = view;
	}

	public void executarBotao(JButton botaoSelecionado) {
		if (botaoSelecionado.equals(view.getBotaoOpcaoDono())) {
			new DonoVisual().setVisible(true);
			view.dispose();
		} else if (botaoSelecionado.equals(view.getBotaoOpcaoAnimal())) {
			new AnimalVisual().setVisible(true);
			view.dispose();
		} else if (botaoSelecionado.equals(view.getBotaoOpcaoAnfitriao())) {
			new AnfitriaoVisual().setVisible(true);
			view.dispose();
		} else if (botaoSelecionado.equals(view.getBotaoOpcaoHospedagem())) {
			new HospedagemVisual().setVisible(true);
			view.dispose();
		} else if (botaoSelecionado.equals(view.getBotaoSair())) {
			view.dispose();
		}
	}

}

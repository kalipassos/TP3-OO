package App;

import javax.swing.JFrame;

import data.Dados;
import visualizacao.MenuVisual;

public class App {

    public static void main(String[] args) {
        Dados.adicionarDono();
        JFrame MenuVisual = new JFrame();
        new MenuVisual().setVisible(true);
    }

}

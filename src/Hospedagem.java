import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hospedagem {
	static Scanner ler = new Scanner(System.in);
	private String dataEntrada, dataSaida;
	private Date dataConvertidaEntrada, dataConvertidaSaida;
	private String adicionaHospedagem;

	public Date cadastraData(String dataEntrada, String dataSaida, Date dataConvertidaEntrada,
			Date dataConvertidaSaida) {
		System.out.println("Digite a data de entrada do seu bichinho: ");
		dataEntrada = ler.next();
		ler.nextLine();
		Date dataConvertidaEntrada = f.parse("" + dataEntrada);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Digite a data de saida do seu bichinho: ");
		dataSaida = ler.next();
		ler.nextLine();
		Date dataConvertidaSaida = f.parse("" + dataSaida);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	}

	public void cadastrarHospedagem() {

	}

	public void visualizarHospedagem() {

	}

	public void editarHospedagem() {

	}
}

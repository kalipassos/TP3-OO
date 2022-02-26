
public abstract class Pessoa {
	Pessoa() {
		System.out.println("help");
	}

	public static void main(String[] args) {
		Animal cachorro1 = new Animal();
		cachorro1.nome = "Pluto";
		cachorro1.idade = 2;
		cachorro1.especie = "cachorro";
		cachorro1.cuidados = "banho e tosa";
		cachorro1.dono = new Dono();
		cachorro1.dono.nome = "Carlos";
		cachorro1.dono.cpf = "123.456.789-10";
		cachorro1.status();

	}

}

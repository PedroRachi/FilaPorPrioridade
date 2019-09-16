package estruturadados.fila.teste;

import estruturadados.fila.FilaComPrioridade;

public class Main {

	public static void main(String[] args) {
		
		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
		
		fila.enfileira(new Paciente("A", 2));
		fila.enfileira(new Paciente("C", 2));
		fila.enfileira(new Paciente("B", 3));
		fila.enfileira(new Paciente("D", 1));

		System.out.println(fila); //1 2 3 e nao 1 3 2
		
		System.out.println(fila.desenfileira() );
		
		System.out.println(fila + "\n");
	}

}

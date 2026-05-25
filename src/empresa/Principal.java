package empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta("Mario", 3000);
		Conta c2 = new Conta("Luigi", 2500);
		
		Scanner teclado = new Scanner(System.in);
		boolean sucessoLeitura = false;
		
		// O loop envolve todo o processo de entrada de dados
		while (!sucessoLeitura) {
			try {
				System.out.println("Insira um valor de transferência: ");
				double valorTransferir = teclado.nextDouble();
				
				c1.transferir(valorTransferir, c2);
				
				System.out.println("\n--- Transferência Realizada com Sucesso! ---");
				c1.info();
				c2.info();
				
				sucessoLeitura = true; // Quebra o loop
				System.out.println("Encerrando o programa.");
				
			} catch (InputMismatchException e) {
				System.out.println("Erro: Entrada inválida! Por favor, digite apenas números.");
				teclado.nextLine(); //Limpa o buffer para não travar em loop infinito
				System.out.println("Tente novamente.\n");
				
			} catch (Exception e) {
				// Captura os erros de negócio lançados pela classe Conta
				System.out.println("Erro na operação: " + e.getMessage());
				System.out.println("Tente novamente.\n");
			}
		}
		teclado.close();
	}
}
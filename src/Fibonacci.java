package controle;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	
 
    	System.out.println("digite um numero");
        int numeroInformado = entrada.nextInt(); // Número a ser verificado se pertence à sequência de Fibonacci

        // Inicializando os primeiros dois números da sequência de Fibonacci
        int numeroAnterior = 0;
        int numeroAtual = 1;

        boolean pertenceSequencia = false;

        // Loop para calcular a sequência de Fibonacci até que o número atual seja maior ou igual ao número informado
        while (numeroAtual <= numeroInformado) {
            // Verifica se o número informado é igual ao número atual da sequência
            if (numeroInformado == numeroAtual) {
                pertenceSequencia = true;
                break; // Sai do loop se o número informado pertencer à sequência
            }

            // Calcula o próximo número na sequência de Fibonacci
            int proximoNumero = numeroAnterior + numeroAtual;
            // Atualiza os números anteriores para a próxima iteração
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }

        // Exibe mensagem informando se o número informado pertence ou não à sequência de Fibonacci
        if (pertenceSequencia) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }
        entrada.close();
    }
}




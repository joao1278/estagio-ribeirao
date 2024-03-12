package controle;

public class InverterString {
	public static void main(String[] args) {
        String original = "Joao mauricio"; // String original
        String invertida = inverterString(original); // Chama a função para inverter a string
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
	 public static String inverterString(String str) {
	        char[] caracteres = str.toCharArray(); // Converte a string em um array de caracteres
	        int inicio = 0;
	        int fim = caracteres.length - 1;

	        // Percorre o array de caracteres da string, invertendo os caracteres
	        while (inicio < fim) {
	            // Troca os caracteres de posição
	            char temp = caracteres[inicio];
	            caracteres[inicio] = caracteres[fim];
	            caracteres[fim] = temp;

	            // Move os ponteiros de início e fim para o próximo par de caracteres
	            inicio++;
	            fim--;
	        }

	        // Constrói a string invertida a partir do array de caracteres invertidos
	        return new String(caracteres);
	    }

}

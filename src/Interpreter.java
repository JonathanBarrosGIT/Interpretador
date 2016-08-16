import java.util.Scanner;

public class Interpreter {

	public static void main(String[] args) {

		System.out.println("Digite a instrução que queira realizar ou digite '?' para ajuda:");

		Scanner input = new Scanner(System.in);

		String userInput = input.nextLine();

		String[] command = userInput.split(" ");

		if(userInput.equals("?")){
			System.out.println("Funções disponíveis: somar, multiplicar, dividir, "
					+ "subtrair, stringComp, numberEqual, maior, menor, and e or.");
		} else{
			switch(command[0]){
			case "somar":
				System.out.println(Aritmetica.somar(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
				break;
			case "multiplicar":
				System.out.println(Aritmetica.multiplicar(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
				break;
			case "dividir":
				System.out.println(Aritmetica.dividir(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
				break;
			case "subtrair":
				System.out.println(Aritmetica.subtrair(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
				break;
			case "and":
				System.out.println(Booleano.and(Boolean.parseBoolean(command[1]), Boolean.parseBoolean(command[2])));
				break;
			case "or":
				System.out.println(Booleano.or(Boolean.parseBoolean(command[1]), Boolean.parseBoolean(command[2])));
				break;
			case "stringComp":
				System.out.println(BitWise.stringComp(command[1], command[2]));
				break;
			case "igual":
				System.out.println(BitWise.numberEqual(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
				break;
			case "maior":
				System.out.println(BitWise.numberR1Great(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
				break;
			case "menor":
				System.out.println(BitWise.numberR1Lower(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
				break;
			default:
				System.out.println("Instrução não encontrada.");
			}
		}
	}

}

import java.util.Scanner;

public class Interpreter {

	public static void main(String[] args) {
		String userInput;
		int resultadoA = 0, r1, r2;
		boolean resultadoB = false, rb1, rb2;
		
		System.out.println("Digite a instrução que queira realizar ou digite '?' "
				+ "para ajuda:");
		
		Scanner input = new Scanner(System.in);
		
		userInput = input.nextLine();
		
		if(userInput == "?"){
			System.out.println("Funções disponíveis: somar, multiplicar, dividir, "
					+ "subtrair, stringComp, numberEqual, maior, menor, and e or.");
		}
		
		else{
			switch(userInput){
			case "somar":
				resultadoA = Aritmetica.somar(r1, r2);
				break;
			case "multiplicar":
				resultadoA = Aritmetica.multiplicar(r1, r2);
				break;
			case "dividir":
				resultadoA = Aritmetica.dividir(r1, r2);
				break;
			case "subtrair":
				resultadoA = Aritmetica.subtrair(r1, r2);
				break;
			case "and":
				resultadoB = Booleano.and(rb1, rb2);
				break;
			case "or":
				resultadoB = Booleano.or(rb1, rb2);
				break;
			case "stringComp":
				resultadoB = BitWise.stringComp(rb1, rb2);
				break;
			case "igual":
				resultadoB = BitWise.numberEqual(rb1, rb2);
				break;
			case "maior":
				resultadoB = BitWise.numberR1Great(rb1, rb2);
				break;
			case "menor":
				resultadoB = BitWise.numberR1Lower(rb1, rb2);
				break;
			default:
				System.out.println("Instrução não encontrada.");
			}
		}
	}

}

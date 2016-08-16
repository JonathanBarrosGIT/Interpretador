public class BitWise{
	public static boolean stringComp(String register1, String register2){
		return register1.equals(register2);
	}

	public static boolean numberEqual(int register1, int register2){
		return (register1 == register2);
	}

	public static boolean numberR1Great(int register1, int register2){
		return (register1 > register2);
	}

	public static boolean numberR1Lower(int register1, int register2){
		return (register1 < register2);
	}
}

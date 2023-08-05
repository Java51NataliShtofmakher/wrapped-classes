
public class WrappedHW {

	public static void main(String[] args) {
		if (args.length == 0) {
			printMinMaxValues("byte", "int", "short", "long", "char", "float", "double");
		} else {
			printMinMaxValues(args);
		}
	}

	public static void printMinMaxValues(String... types) {
		for (String type : types) {
			switch (type) {
			case "byte":
				System.out.println("Byte Min: " + Byte.MIN_VALUE + ", Max: " + Byte.MAX_VALUE);
				break;
			case "int":
				System.out.println("Int Min: " + Integer.MIN_VALUE + ", Max: " + Integer.MAX_VALUE);
				break;
			case "short":
				System.out.println("Short Min: " + Short.MIN_VALUE + ", Max: " + Short.MAX_VALUE);
				break;
			case "long":
				System.out.println("Long Min: " + Long.MIN_VALUE + ", Max: " + Long.MAX_VALUE);
				break;
			case "char":
				System.out.println("Char Min: " + (int) Character.MIN_VALUE + ", Max: " + (int) Character.MAX_VALUE);
				break;
			case "float":
				System.out.println("Float Min: " + Float.MIN_VALUE + ", Max: " + Float.MAX_VALUE);
				break;
			case "double":
				System.out.println("Double Min: " + Double.MIN_VALUE + ", Max: " + Double.MAX_VALUE);
				break;
			default:
				System.out.println(type + " Wrong type");
			}
		}
	}

}

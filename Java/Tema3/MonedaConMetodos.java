public class MonedaConMetodos {
	static final double EUROS_A_DOLARES = 1.16;
	static final double DOLARES_A_EUROS = 0.86;

	public static void main (String[] args){
	
		double monedaACambiar1 = 7.5;
		double monedaACambiar2 = 117.5;
		double monedaACambiar3 = 677.5;
		
		convertirDolaresAEuros(monedaACambiar1);
		convertirDolaresAEuros(monedaACambiar2);
		convertirDolaresAEuros(monedaACambiar3);
		
		System.out.println("\n");
		
		convertirEurosADolares(monedaACambiar1);
		convertirEurosADolares(monedaACambiar2);
		convertirEurosADolares(monedaACambiar3);

	}
	
	public static void convertirDolaresAEuros(double dolares){
	
		double euros = dolares * DOLARES_A_EUROS;
		System.out.println(dolares + "$: " + euros + "€.");
	
	}
	
	public static void convertirEurosADolares(double euros){
	
		double dolares = euros * EUROS_A_DOLARES;
		System.out.println(euros + "€: " + dolares + "$.");
	
	}
}

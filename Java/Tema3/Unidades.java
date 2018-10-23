public class Unidades {

	public static void main (String[] args){
	
		double valor = 6.5;
		
		double kilogramos = FuncionesUnidades.convertirLibrasAKilogramos(valor);
		double metrosP = FuncionesUnidades.convertirPiesAMetros(valor);
		double metrosY = FuncionesUnidades.convertirYardasAMetros(valor);
		double metrosM = FuncionesUnidades.convertirMillasAMetros(valor);
		double hectareas = FuncionesUnidades.convertirAcresAHectareas(valor);
		double mililitros = FuncionesUnidades.convertirOnzasAMililitros(valor);
		double litros = FuncionesUnidades.convertirGalonesALitros(valor);
		
		System.out.println(valor + " libras equivale a " + Math.round(kilogramos * 100) / 100.0 + " kilogramos.\n");
		System.out.println(valor + " pies equivale a " + Math.round(metrosP * 100) / 100.0 + " metros.\n");
		System.out.println(valor + " yardas equivale a " + Math.round(metrosY * 100) / 100.0 + " metros.\n");
		System.out.println(valor + " millas equivale a " + Math.round(metrosM * 100) / 100.0 + " metros.\n");
		System.out.println(valor + " acres equivale a " + Math.round(hectareas * 100) / 100.0 + " hectáreas.\n");
		System.out.println(valor + " onzas equivale a " + Math.round(mililitros * 100) / 100.0 + " mililitros.\n");
		System.out.println(valor + " galones equivale a " + Math.round(litros * 100) / 100.0 + " litros.\n");
		
	}
	
}

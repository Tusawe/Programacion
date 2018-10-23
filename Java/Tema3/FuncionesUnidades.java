/**
 * Clase FuncionesUnidades, que nos sirve
 * para convertir distintos tipos de unidades
 * @author José Luis Gómez
 * @version 1.0
*/

import java.lang.Math;

public class FuncionesUnidades {
	
	/** Distintas constantes */
	static final double LIBRAS_A_KILOGRAMOS = 0.453592;
	static final double PIES_A_METROS = 0.3048;
	static final double YARDAS_A_METROS = 0.9144;
	static final double MILLAS_A_METROS = 1609.34;
	static final double ACRES_A_HECTAREAS = 0.404686;
	static final double ONZAS_A_MILILITROS = 29.5735;
	static final double GALONES_A_LITROS = 3.78541;
	
	/** Metodo convertirLibrasAKilogramos que convierte
	 * las libras a kilogramos
	 * @param libras a convertir
	 * @return operación a convertir libras a kilogramos
	*/
	public static double convertirLibrasAKilogramos(double libras){
	
		return libras * LIBRAS_A_KILOGRAMOS;

	}
	
	public static double convertirPiesAMetros(double pies){
	
		return pies * PIES_A_METROS;
	
	}
	
	public static double convertirYardasAMetros(double yardas){
	
		return yardas * YARDAS_A_METROS;
	
	}
	
	public static double convertirMillasAMetros(double millas){
	
		return millas * MILLAS_A_METROS;
	
	}
	
	public static double convertirAcresAHectareas(double acres){
	
		return acres * ACRES_A_HECTAREAS;
	
	}
	
	public static double convertirOnzasAMililitros(double onzas){
	
		return onzas * ONZAS_A_MILILITROS;
	
	}
	
	public static double convertirGalonesALitros(double galones){
	
		return galones * GALONES_A_LITROS;
	
	}
}

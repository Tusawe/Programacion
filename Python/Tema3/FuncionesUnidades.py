LIBRAS_A_KILOGRAMOS = 0.45
PIES_A_METROS = 0.31
YARDAS_A_METROS = 0.91
MILLAS_A_METROS = 1609.34
ACRES_A_HECTAREAS = 0.41
ONZAS_A_MILILITROS = 29.57
GALONES_A_LITROS = 4.55

def convertirLibrasAKilogramos(libras):
	kilogramos = libras * LIBRAS_A_KILOGRAMOS
	print(f'{libras} libras equivale a {kilogramos} kilogramos.')
	
def convertirPiesAMetros(pies):
	metros = pies * PIES_A_METROS
	print(pies,"pies equivale a",metros,"metros.")
	
def convertirYardasAMetros(yardas):
	metros = yardas * YARDAS_A_METROS
	print(yardas,"yardas equivale a",metros,"metros.")
	
def convertirMillasAMetros(millas):
	metros = millas * MILLAS_A_METROS
	print(millas,"millas equivale a",metros,"metros.")
	
def convertirAcresAHectareas(acres):
	hectareas = acres * ACRES_A_HECTAREAS
	print(acres,"acres equivale a",hectareas,"hectareas.")
	
def convertirOnzasAMililitros(onzas):
	mililitros = onzas * ONZAS_A_MILILITROS
	print(onzas,"onzas equivale a",mililitros,"mililitros.")
	
def convertirGalonesALitros(galones):
	litros = galones * GALONES_A_LITROS
	print(galones,"galones equivale a",litros,"litros.")

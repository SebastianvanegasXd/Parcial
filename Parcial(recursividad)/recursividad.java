public class Recursividad {

	public static void main(String[] args){

	int = numero = 8;
	int = divisor = 2;
	int calculo = dividirNumeros(numero,divisor);

	system.out.println("El resultado de la division es: "+calculo);
}

	public static int dividirNumeros(in numero, int divisor){

	if(numero == 1){
	return 1;
	} else{
	return dividirNumeros(numero / divisor, divisor);
}
}
}
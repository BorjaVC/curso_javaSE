package principal;
import java.util.Scanner;
public class Presupuesto {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		var precios = new String[]{"VOLVO-19_500","Audi-23_890","Totota-33_000","BMW-30_550","Mercedes-40_900"};//Utilizar var en variables locales INICIALIZADAS
		int presupuesto;
		int guion ;
		int precioCoche;
		String marcaCoche;
		
		System.out.println("Indique su presupuesto");
		presupuesto = scr.nextInt();
		for (String precio : precios) {
			precio = precio.replace("_", "");//Remplazar _ de los precios en String
			guion = precio.indexOf("-");
			precioCoche = Integer.parseInt(precio.substring(guion+1, precio.length()));
			marcaCoche = precio.substring(0,guion);
			if(precioCoche <= presupuesto) {
				System.out.println(marcaCoche + " " + precioCoche);
			}
			
		}

		
	}

}

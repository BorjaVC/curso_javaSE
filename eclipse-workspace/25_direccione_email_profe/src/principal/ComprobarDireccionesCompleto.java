package principal;

public class ComprobarDireccionesCompleto {

	public static void main(String[] args) {
		String email = "aaa@gmail.com,bbb@tel.es,ccc@gmail.es,ddd@gmail.com,,abcd@gmail.org,bvc@gmail.net";
		String emails []= email.split(",");
		//String dominio = "";
		String [] arrayDom;
		String resultado;
		

		
		
		
		

	}
	//Método encontrar y guardar en array cada tipopde dominio encontrado
			/*static String dominios(String dirs[]) {
				for(int i = 0 ; i < emails.length;i++) {
					String d = emails[i].substring(emails[i].indexOf(".") + 1 , emails[i].length());		
					if(d != dominio) {
						dominio = d;
						arrayDom[i] = dominio;
					}
					for(String dom : arrayDom) {
						resultado = dom;
					}
				}
				return resultado;
				
			}*/
	
	//Profe
			//Recibe array de direcciones y devuelve array con dominios
			static String[] dominios(String[] dirs) {
				String cadenaDominios ="";
				for(String dir : dirs) {
					//Obtenemos dominio de de la direccion que estamos recorriendo
					String dominio = dir.substring(dir.indexOf(".") + 1 , dir.length());
					//if(cadenaDominios.indexOf(dominio)==- 1) {;
					if(!cadenaDominios.contains(dominio)) {
						//Añadimnos domnio a la cadenaDominios
						cadenaDominios += dominio + ",";
					}
				}
				cadenaDominios =cadenaDominios.substring(0,cadenaDominios.length() -1 );
				return cadenaDominios.split(",");
			}

}

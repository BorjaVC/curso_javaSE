package principal;

public class ComprobarDirecciones {

	public static void main(String[] args) {
		String email = "aaa@gmail.com,bbb@tel.es,ccc@gmail.es,ddd@gmail.com,abc@gmail.com";
		String emails[] = email.split(",");
		int contador1 = 0;
		int contador2 = 0;
		
		for(String em : emails) {
			if(em.endsWith(".com")) {
				contador1++;
			}else {
				contador2++;
			}
			/*
			//Profe
			switch(em.substring(em.indexOf(".") , em.length())) {
			case "com":
				contador1++;
			break;
			case "es":
				contador2++;
			break;
			}*/
		}
		
		System.out.println("Dominios .com: " + contador1);
		System.out.println("Dominios .es: " + contador2);
		
		
	}

}

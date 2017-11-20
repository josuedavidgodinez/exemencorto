package examen_corto;

public class cesar {
 String cifrarCesar(String frase,int Distancia) {
	 CircularLinkedList<String> abecedario=new  CircularLinkedList<String>  ();
	 abecedario.addFirst("a");
	 abecedario.addLast("b");
	 abecedario.addLast("c");
	 abecedario.addLast("d");
	 abecedario.addLast("e");
	 abecedario.addLast("f");
	 abecedario.addLast("g");
	 abecedario.addLast("h");
	 abecedario.addLast("i");
	 abecedario.addLast("j");
	 abecedario.addLast("k");
	 abecedario.addLast("l");
	 abecedario.addLast("m");
	 abecedario.addLast("n");
	 abecedario.addLast("o");
	 abecedario.addLast("p");
	 abecedario.addLast("q");
	 abecedario.addLast("r");
	 abecedario.addLast("s");
	 abecedario.addLast("t");
	 abecedario.addLast("u");
	 abecedario.addLast("v");
	 abecedario.addLast("w");
	 abecedario.addLast("x");
	 abecedario.addLast("y");
	 abecedario.addLast("z");
	 
	 char [] cadena=frase.toCharArray();
	 String [] cadenaconver=new String [frase.length()];
	for(int i=0;i<frase.length();i++) {
		cadenaconver[i]=Character.toString(cadena[i]);
		
	}

	for(int i=0;i<frase.length();i++){
	do {
		if(abecedario.first()==cadenaconver[i]) {
			
			for(int x=0;x<Distancia;x++) {
				abecedario.rotate();				
			}
			
			cadenaconver[i]=abecedario.first();
		}
		abecedario.rotate();	
		
	}while(abecedario.first()!="a");

	}
	String cadena_devolver = "";
	
	for(int j=0;j<frase.length();j++) {
		cadena_devolver+=cadenaconver[j];
		
	}
	return cadena_devolver;
	 
	 
	 
 }
}

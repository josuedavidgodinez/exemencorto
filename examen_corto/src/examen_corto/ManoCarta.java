package examen_corto;

import examen_corto.LinkedPositionalList;

public class ManoCarta<E> {
	
	LinkedPositionalList lista=new LinkedPositionalList();
	Position<E> corazones;
	Position<E> espadas;
	Position<E> diamantes;
	Position<E> treboles;
	

public ManoCarta() {
	E value = null;
	 corazones=lista.addFirst(value);
espadas=lista.addFirst(value);
	 diamantes=lista.addFirst(value);
 treboles=lista.addFirst(value);
	
}

public void agregarCarta(E value,String categoria) {
	
	if(categoria=="corazones") {
		lista.addBefore(corazones, value);
		
		
	}else if(categoria=="espadas") {
		
		
		lista.addBefore(espadas, value);
	}else if(categoria=="diamantes") {
		lista.addBefore(diamantes, value);
		
		
	}else if(categoria=="treboles") {
		
		Position<E> aux;
		aux=lista.before(corazones);
		lista.remove(aux);
		
	}else {
		
		
		System.out.println("Ingrese una categoria valida");
	}
}


public void jugar(String categoria) {
	
	if(categoria=="corazones") {
		Position<E> aux;
		aux=lista.before(corazones);
		if(aux.getElement()!=null) {
			
			lista.remove(aux);
		}
		
		
		
	}else if(categoria=="espadas") {
		
		Position<E> aux;
		aux=lista.before(espadas);
		lista.remove(aux);
		
	}else if(categoria=="diamantes") {
		
		Position<E> aux;
		aux=lista.before(espadas);
		lista.remove(aux);
		
		
	}else if(categoria=="treboles") {
		Position<E> aux;
		aux=lista.before(espadas);
		lista.remove(aux);
		
		
	}else {
		
		
		System.out.println("Ingrese una categoria valida");
	}
}

public void removeraleatoriamente(){
	
	
	int numero=0;
	
	numero=(int )(Math.random()*(lista.size()-1))+1;
			
	
	Position<E> aux=lista.positionAtIndex(numero);
			
			lista.remove(aux);
}



}

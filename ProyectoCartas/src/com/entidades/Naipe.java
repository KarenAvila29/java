package com.entidades;

import java.util.ArrayList;

public class Naipe {
	
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	public Naipe() {
		numerosPosibles = new ArrayList<>();
        cartas = new ArrayList<>();
        Palos palos=new Palos();
		//palos.getCorazonRojo();
        
        
        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));
        
        for (int i=0; i<numerosPosibles.size();i++) {
        	 Numero n = numerosPosibles.get(i);
        	 cartas.add(new Carta(n, palos.getCorazonRojo()));
        	 cartas.add(new Carta(n, palos.getCorazonNegro()));
        	 cartas.add(new Carta(n, palos.getDiamante()));
        	 cartas.add(new Carta(n, palos.getTrebol()));
        }
	}
	public ArrayList<Carta> barajar() {
	    ArrayList<Carta> auxiliar = new ArrayList<>();

	    // 100 intentos para tomar cartas al azar
	    for (int i = 0; i < 100; i++) {
	        int posicion = Random.obtenerPosicion();
	        Carta carta = cartas.get(posicion);

	        if (carta.getEstado().equals("N")) {
	            auxiliar.add(carta);
	            carta.setEstado("C");
	        }
	    }

	    // Si faltan cartas, agregarlas en orden
	    for (int i = 0; i < cartas.size(); i++) {
	        Carta carta = cartas.get(i);

	        if (carta.getEstado().equals("N")) {
	            auxiliar.add(carta);
	            carta.setEstado("C");
	        }
	    }
	    // Reset de estado para próxima barajada
	    for (Carta carta : cartas) {
	        carta.setEstado("N");
	    }

	    return auxiliar;
	}

	
	
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	

	
}

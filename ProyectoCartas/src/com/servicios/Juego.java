package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;
import com.entidades.Random;

public class Juego {
		
	private ArrayList<String> jugadores;
    private ArrayList<ArrayList<Integer>> cartasJugadores;
    private Random random = new Random();

    // CONSTRUCTOR PRINCIPAL
    public Juego(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
        inicializarCartas();
    }

    // POR SI EXISTE OTRO CONSTRUCTOR (te salva del NPE)
    public Juego() {
        this.jugadores = new ArrayList<>();
        inicializarCartas();
    }

    // MÉTODO OBLIGATORIO PARA EVITAR NPE
    private void inicializarCartas() {
        cartasJugadores = new ArrayList<>();

        // Si jugadores está vacío, no se crean listas
        for (int i = 0; i < jugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<>());
        }
    }

    // ENTREGAR CARTAS
    public void entregarCartas(int cantidad) {

        // Asegurar que cartasJugadores está creado
        if (cartasJugadores == null || cartasJugadores.size() == 0) {
            inicializarCartas();
        }

        for (int i = 0; i < jugadores.size(); i++) {
            for (int j = 0; j < cantidad; j++) {
                int carta = random.nextInt(10) + 1;
                cartasJugadores.get(i).add(carta);
            }
        }
    }

    // EJERCICIO 7: devolver total
    public int devolverTotal(int idJugador) {
        int suma = 0;

        // Prevención de errores
        if (cartasJugadores == null) {
            System.out.println("ERROR: cartasJugadores es null");
            return 0;
        }

        if (idJugador < 0 || idJugador >= cartasJugadores.size()) {
            System.out.println("ERROR: idJugador fuera de rango");
            return 0;
        }

        for (int carta : cartasJugadores.get(idJugador)) {
            suma += carta;
        }

        return suma;
    }

    // EJERCICIO 8: determinar ganador
    public int determinarGanador() {

        int idGanador = 0;
        int sumaGanador = devolverTotal(0);

        for (int i = 1; i < jugadores.size(); i++) {
            int sumaActual = devolverTotal(i);

            if (sumaActual >= sumaGanador) {
                sumaGanador = sumaActual;
                idGanador = i;
            }
        }

        return idGanador;
    }

	public int obtenerTotalJugador(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
		
		


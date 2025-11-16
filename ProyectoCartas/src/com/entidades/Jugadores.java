package com.entidades;


import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {

    private ArrayList<String> jugadores;

    // Constructor
    public Jugadores() {
        this.jugadores = new ArrayList<>();
    }

    // Getter
    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    // Setter
    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    // Método principal solicitado
    public void jugar() {

        // 1. Crear lista de jugadores
        ArrayList<String> listaJugadores = new ArrayList<>();
        listaJugadores.add("Jugador 1");
        listaJugadores.add("Jugador 2");
        listaJugadores.add("Jugador 3");

        // Guardar en el atributo
        this.jugadores = listaJugadores;

        // 2. Crear objeto Juego con parámetro jugadores
        Juego juego = new Juego(jugadores);

        // 3. Entregar cartas
        juego.entregarCartas(5);

        // 4. Mostrar resultados
        int totalGeneral = 0;

        for (int i = 0; i < jugadores.size(); i++) {
            int total = juego.obtenerTotalJugador(i);
            System.out.println("Total del " + jugadores.get(i) + ": " + total);
            totalGeneral += total;
        }

        System.out.println("TOTAL GENERAL: " + totalGeneral);

        // 5. Determinar ganador
        int ganador = juego.determinarGanador();
        System.out.println("\nGANADOR: " + ganador);
    }
}
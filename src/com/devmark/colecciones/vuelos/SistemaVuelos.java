package com.devmark.colecciones.vuelos;

import com.devmark.colecciones.vuelos.model.Vuelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SistemaVuelos {

    public static void main(String[] args) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        List<Vuelo> llegadas = new ArrayList<>();

        llegadas.add(new Vuelo("AAL933", "New York", df.parse("2022-08-28 05:39"), "Mexico", 62));
        llegadas.add(new Vuelo("LAT755", "Sao Paolo", df.parse("2022-08-31 04:45"), "Mexico", 47));
        llegadas.add(new Vuelo("SKU621", "Río Janeiro", df.parse("2022-08-30 04:00"), "Mexico", 52));
        llegadas.add(new Vuelo("DAL147", "Atlanta", df.parse("2022-08-29 13:22"), "Mexico", 59));
        llegadas.add(new Vuelo("AVA241", "Bogota", df.parse("2022-08-30 02:05"), "Mexico", 25));
        llegadas.add(new Vuelo("AMX10", "Hermosillo", df.parse("2022-08-31 05:20"), "Mexico", 29));
        llegadas.add(new Vuelo("IBF683", "Londres", df.parse("2022-08-31 08:45"), "Mexico", 55));

        llegadas.sort((v1, v2) -> v2.getFecha().compareTo(v1.getFecha()));

        llegadas.forEach(System.out::println);
        Vuelo ultimoVuelo = llegadas.get(0);
        System.out.println("El último vuelo en llegar es: " + ultimoVuelo.getNombre() + ": " + ultimoVuelo.getOrigen() + ". Aterriza el " + ultimoVuelo.getFecha());

        llegadas.sort((v1, v2) -> Integer.valueOf(v2.getNumPasajeros()).compareTo(v1.getNumPasajeros()));
        Vuelo vueloMenorPasajeros = new LinkedList<>(llegadas).peekLast();
        System.out.println("El últim vuelo con menor número de pasajeros es: " + vueloMenorPasajeros.getNombre() + ": " + vueloMenorPasajeros.getOrigen() + ", con " + vueloMenorPasajeros.getNumPasajeros() + " pasajeros.");


    }

}

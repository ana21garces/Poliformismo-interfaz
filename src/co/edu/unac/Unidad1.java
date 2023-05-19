package co.edu.unac;

import co.edu.unac.poo1.Movimiento;
import co.edu.unac.raton.Raton;

import java.util.*;

public class Unidad1 {

    public static void PruebaLista(){

        Ardilla ardilla1 = new Ardilla("teresa", "negro", 120);
        Ardilla ardilla2= new Ardilla("ttgr", "negro", 120);
        Ardilla ardilla3 = new Ardilla("teresa", "negro", 120);

        List<Ardilla> listaArdillas = new LinkedList<>();
        listaArdillas.add(ardilla1);
        listaArdillas.add(ardilla2);
        listaArdillas.add(ardilla3);

        Map<String, Movimiento> ratonMap = new HashMap<>();
        ratonMap.put(ardilla1.getNombreA(), ardilla1 );
        ratonMap.put(ardilla2.getNombreA(), ardilla2 );
        ratonMap.put(ardilla3.getNombreA(), ardilla3 );

        List<Movimiento> listaArdilla = new LinkedList<>(ratonMap.values());
        for (Movimiento ardilla : listaArdilla){
            ardilla.verInformacion();
        }


    }
}

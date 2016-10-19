/*
Copyright (c) 2016. Kayo Martins Freitas
 */
package com.github.kayo08.aula07;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kayo Martins
 */
public class TestCalendario {
    @Test
    public void anoMenor999 (){
        assertEquals (-1, Calendario.diaSemana(9990202, 2016, 20161010, 2));
    }
    
    @Test
    public void anoMaior1000 (){
        assertEquals (-1, Calendario.diaSemana(201600101, 5, 20160101, 2));
    }
    
    @Test
    public void mesMenor1 (){
        assertEquals (-1, Calendario.diaSemana(20160001, 2, 20160101, 2));
    }
    
    @Test
    public void mesMaior12 () {
        assertEquals (-1, Calendario.diaSemana(20161301, 2, 20160101, 2));
    }
    
    @Test
    public void diaMenor1 () {
        assertEquals (-1, Calendario.diaSemana(20160100, 2, 20160101, 2));
    }
    
    @Test
    public void mesDe30Dias () {
        assertEquals (-1, Calendario.diaSemana(20160231, 5, 20160101, 2));
    }
    
    @Test
    public void mesDe31Dias () {
        assertEquals (-1, Calendario.diaSemana(20160332, 4, 20160101, 2));
    }   
}

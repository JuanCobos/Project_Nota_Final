/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dto.Nota;
import logica.Generador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TP303
 */
public class GeneradorTest {
    
    @Test
    public void crearPacienteNull(){
        Generador gnota = new Generador();
        Nota lanota = gnota.generarNota(2,2,2,2,"","","");
        assertNull(lanota);
    }
    
}
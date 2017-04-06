package pruebitas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//assert revision de prueba "acertaste"
import model.Autenticacion;
public class TestAutenticacion {
    
    
    
        
   
    @Test
    public void probarAutenticacion()throws Exception{
    boolean valor=Autenticacion.autenticar("system","system");
            assertEquals(true,valor);
    }
    @Test
    public void probarSuma()throws Exception{
    assertEquals(5,3+2);
    //quiere decir revisa si el resultado es "" assertEquals(valor esperado,calculo);
    }
    
}

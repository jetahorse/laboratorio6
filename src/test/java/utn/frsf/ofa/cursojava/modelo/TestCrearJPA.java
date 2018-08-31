/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frsf.ofa.cursojava.modelo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author federicoaugustotschopp
 */
public class TestCrearJPA {
    private ProyectoDAO pryDao;
    
    public TestCrearJPA() {
    }
    
    @Before
    public void setUp() {
        pryDao=new ProyectoDaoJPA();
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testCrear(){
        Proyecto e1=new Proyecto();
        e1.setNombre("ALJALO PROJECT");
        e1.setDescripcion("Desarrollaremos una aplicación web con un framework de alto nivel denominado Django(usado en la asignatura DAI), donde podrán usarlo varios usuarios al mismo tiempo.");
        e1.setPresupuestoMaximo(1000.00);
        e1.setId(1);
        pryDao.crear(e1);
        Proyecto e2=pryDao.buscarPorId(1);
        assertEquals(e1.getNombre(),e2.getNombre());
        assertEquals(e1.getDescripcion(),e2.getDescripcion());
        assertEquals(e1.getPresupuestoMaximo(),e2.getPresupuestoMaximo(),1e-15);
    }
}

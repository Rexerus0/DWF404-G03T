package com.tuempresa.ParqueDiversiones;

import com.tuempresa.ParqueDiversiones.model.Atraccion;
import com.tuempresa.ParqueDiversiones.model.Boleto;
import com.tuempresa.ParqueDiversiones.model.Visitante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VisitanteTest {

    private Visitante visitante;
    private Atraccion atraccion;

    @BeforeEach
    void setUp() {
        visitante = new Visitante("Juan", 12);
        atraccion = new Atraccion("Montaña Rusa", 50, 14) {
            @Override
            public void iniciar() {}
            @Override
            public void detener() {}
            @Override
            public void realizarMantenimiento() {}
        };
    }

    @Test
    void testCrearVisitante() {
        assertNotNull(visitante);
        assertEquals("Juan", visitante.getNombre());
        assertEquals(12, visitante.getEdad());
        assertTrue(visitante.getListaDeBoletos().isEmpty());
    }

    @Test
    void testAccesoDenegadoPorEdad() {
        assertFalse(visitante.puedeAccederA(atraccion)); // Edad 12 < 14 (edad mínima)
    }

    @Test
    void testAccesoConBoletoVIP() {
        Boleto boletoVIP = new Boleto(Boleto.TipoBoleto.VIP, 50.0);
        visitante.agregarBoleto(boletoVIP);
        assertTrue(visitante.puedeAccederA(atraccion)); // Boleto VIP permite acceso sin restricciones
    }

    @Test
    void testAgregarBoleto() {
        Boleto boleto = new Boleto(Boleto.TipoBoleto.ADULTO, 30.0);
        visitante.agregarBoleto(boleto);
        assertEquals(1, visitante.getListaDeBoletos().size());
        assertEquals(Boleto.TipoBoleto.ADULTO, visitante.getListaDeBoletos().get(0).getTipo());
    }
}
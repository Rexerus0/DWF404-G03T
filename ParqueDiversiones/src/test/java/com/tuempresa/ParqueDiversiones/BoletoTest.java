package com.tuempresa.ParqueDiversiones;

import com.tuempresa.ParqueDiversiones.model.Boleto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoletoTest {

    @Test
    void testCrearBoleto() {
        Boleto boleto = new Boleto(Boleto.TipoBoleto.INFANTIL, 15.0);
        assertNotNull(boleto);
        assertEquals(Boleto.TipoBoleto.INFANTIL, boleto.getTipo());
        assertEquals(15.0, boleto.getPrecio(), 0.01);
    }

    @Test
    void testBoletoVIP() {
        Boleto boletoVIP = new Boleto(Boleto.TipoBoleto.VIP, 50.0);
        assertTrue(boletoVIP.esVIP());
        Boleto boletoInfantil = new Boleto(Boleto.TipoBoleto.INFANTIL, 15.0);
        assertFalse(boletoInfantil.esVIP());
    }
}
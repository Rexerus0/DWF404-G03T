package com.tuempresa.ParqueDiversiones.model;

import com.tuempresa.ParqueDiversiones.Operable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtraccionTest {

    private Atraccion atraccion;

    @BeforeEach
    void setUp() {
        atraccion = new Atraccion("Montaña Rusa", 50, 14) {
            @Override
            public void iniciar() {
                setEstado(Atraccion.Estado.OPERANDO);
            }

            @Override
            public void detener() {
                setEstado(Atraccion.Estado.DETENIDO);
            }

            @Override
            public void realizarMantenimiento() {
                setEstado(Atraccion.Estado.MANTENIMIENTO);
            }
        };
    }

    @Test
    void testOperableIniciar() {
        atraccion.iniciar();
        assertEquals(Atraccion.Estado.OPERANDO, atraccion.getEstado());
    }

    @Test
    void testOperableDetener() {
        atraccion.detener();
        assertEquals(Atraccion.Estado.DETENIDO, atraccion.getEstado());
    }

    @Test
    void testOperableMantenimiento() {
        atraccion.realizarMantenimiento();
        assertEquals(Atraccion.Estado.MANTENIMIENTO, atraccion.getEstado());
    }
}
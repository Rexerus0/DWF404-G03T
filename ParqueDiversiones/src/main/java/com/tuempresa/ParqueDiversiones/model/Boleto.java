package com.tuempresa.ParqueDiversiones.model;

import jakarta.persistence.*;

@Entity
@Table(name = "boletos")
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoBoleto tipo;

    @Column(nullable = false)
    private double precio;

    public Boleto() {}

    public Boleto(TipoBoleto tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public TipoBoleto getTipo() { return tipo; }
    public void setTipo(TipoBoleto tipo) { this.tipo = tipo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public boolean esVIP() {
        return tipo == TipoBoleto.VIP;
    }

    public enum TipoBoleto {
        INFANTIL, ADULTO, VIP
    }
}
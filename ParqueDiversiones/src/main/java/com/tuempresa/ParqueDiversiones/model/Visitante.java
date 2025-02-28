package com.tuempresa.ParqueDiversiones.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "visitantes")
public class Visitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int edad;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "visitante_id")
    private List<Boleto> listaDeBoletos = new ArrayList<>();

    public Visitante() {}

    public Visitante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public List<Boleto> getListaDeBoletos() { return listaDeBoletos; }
    public void setListaDeBoletos(List<Boleto> listaDeBoletos) { this.listaDeBoletos = listaDeBoletos; }

    public void agregarBoleto(Boleto boleto) {
        listaDeBoletos.add(boleto);
    }

    public boolean puedeAccederA(Atraccion atraccion) {
        if (listaDeBoletos.stream().anyMatch(b -> b.esVIP())) {
            return true; // Los boletos VIP permiten acceso sin restricciones de edad
        }
        return edad >= atraccion.getEdadMinima();
    }
}
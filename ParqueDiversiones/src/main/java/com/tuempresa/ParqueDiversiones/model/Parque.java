package com.tuempresa.ParqueDiversiones.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "parques")
public class Parque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String ubicacion;

    @OneToMany(mappedBy = "parque", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Atraccion> atracciones = new ArrayList<>();

    public Parque() {}

    public Parque(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public List<Atraccion> getAtracciones() { return atracciones; }
    public void setAtracciones(List<Atraccion> atracciones) { this.atracciones = atracciones; }

    public void agregarAtraccion(Atraccion atraccion) {
        atracciones.add(atraccion);
        atraccion.setParque(this);
    }
}
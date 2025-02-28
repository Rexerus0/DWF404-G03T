package com.tuempresa.ParqueDiversiones.model;

import jakarta.persistence.*;
import com.tuempresa.ParqueDiversiones.Operable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_atraccion", discriminatorType = DiscriminatorType.STRING)
@Table(name = "atracciones")
public abstract class Atraccion implements Operable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int capacidad;

    @Column(nullable = false)
    private int edadMinima;

    @Column(nullable = false)
    private Estado estado = Estado.DETENIDO;

    @ManyToOne
    @JoinColumn(name = "parque_id")
    private Parque parque;

    public Atraccion() {}

    public Atraccion(String nombre, int capacidad, int edadMinima) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.edadMinima = edadMinima;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public int getEdadMinima() { return edadMinima; }
    public void setEdadMinima(int edadMinima) { this.edadMinima = edadMinima; }

    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }

    public Parque getParque() { return parque; }
    public void setParque(Parque parque) { this.parque = parque; }

    @Override
    public void iniciar() {
        this.estado = Estado.OPERANDO;
    }

    @Override
    public void detener() {
        this.estado = Estado.DETENIDO;
    }

    @Override
    public void realizarMantenimiento() {
        this.estado = Estado.MANTENIMIENTO;
    }

    public enum Estado {
        OPERANDO, DETENIDO, MANTENIMIENTO
    }
}
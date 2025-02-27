package com.tuempresa.ParqueDiversiones.dto;

public class ParqueDTO {

    private String nombre;
    private String ubicacion;

    public ParqueDTO() {}

    public ParqueDTO(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
}

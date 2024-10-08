package com.antiquestore.app_antique.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudades")
public class Ciudad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = true)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region regiones;

    public Ciudad() {
    }

    public Ciudad(Long id, String nombre, Region regiones) {
        this.id = id;
        this.nombre = nombre;
        this.regiones = regiones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Region getRegiones() {
        return regiones;
    }

    public void setRegiones(Region regiones) {
        this.regiones = regiones;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}

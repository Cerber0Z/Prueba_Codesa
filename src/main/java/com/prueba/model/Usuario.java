package com.prueba.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id_usuario;

    @Column
    private String Nombre;

    @Column
    private String Activo;


    @Column
    private Integer rol_id;

    //Getters and Setters

    public Integer getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        Id_usuario = id_usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getActivo() {
        return Activo;
    }

    public void setActivo(String activo) {
        Activo = activo;
    }

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }
}

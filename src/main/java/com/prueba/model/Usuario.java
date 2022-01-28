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


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rol_id", referencedColumnName = "Id_rol")
    private Rol rol;

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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}

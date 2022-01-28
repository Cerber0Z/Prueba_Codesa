package com.prueba.model;

import javax.persistence.*;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id_rol;

    @Column
    private String Nombre;
}

package com.mingeso.backend.models;

public class Formulario {

    private Integer id;
    private String nombre;
    private String correo;
    private String comentario;
    private Integer id_diplomado;

    //Get y Set id
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    //Get y Set id
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Get y Set id
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Get y Set id
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    //Get y Set id
    public Integer getIdDiplomado() {
        return id_diplomado;
    }
    public void setIdDiplomado(Integer id_diplomado) {
        this.id_diplomado = id_diplomado;
    }
}
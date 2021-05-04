package com.mingeso.backend.models;

public class Operaciones {
    public int primerNumero;
    public int segundoNumero;
    public int resultado;

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }
    //Martes 4 Mayo   
    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void suma(){
        resultado = primerNumero + segundoNumero;
    }

    public void resta(){
        resultado = primerNumero - segundoNumero;
    }
}//prueba
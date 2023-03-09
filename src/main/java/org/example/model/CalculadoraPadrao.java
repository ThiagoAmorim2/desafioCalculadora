package org.example.model;

import org.w3c.dom.ls.LSOutput;

public class CalculadoraPadrao {
    private Double numero1;
    private Double numero2;

    public CalculadoraPadrao(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double soma(double numero1, double numero2){
        return numero1 + numero2;
    }

    public Double subtracao(double numero1, double numero2){
        return numero1 - numero2;
    }

    public Double divisao(double numero1, double numero2){
        return numero1 / numero2;
    }
    public Double multiplicacao(double numero1, double numero2){
        return numero1 * numero2;
    }
    public Double exponenciacao(double numero1, double numero2){
        return Math.pow(numero1, numero2);
    }


}

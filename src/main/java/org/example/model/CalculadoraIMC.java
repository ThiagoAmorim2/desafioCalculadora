package org.example.model;

public class CalculadoraIMC {
    private Double altura;
    private Double peso;

    public CalculadoraIMC(Double altura, Double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double calculaIMC(Double altura, Double peso){
        return peso / (Math.pow(altura, 2));
    }
}

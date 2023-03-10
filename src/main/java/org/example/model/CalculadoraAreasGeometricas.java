package org.example.model;

public class CalculadoraAreasGeometricas {
    private Double termo1;
    private Double termo2;

    public CalculadoraAreasGeometricas() {
    }

    public Double getTermo1() {
        return termo1;
    }

    public void setTermo1(Double termo1) {
        this.termo1 = termo1;
    }

    public Double getTermo2() {
        return termo2;
    }

    public void setTermo2(Double termo2) {
        this.termo2 = termo2;
    }

    public Double areaCirculo(Double termo1){
        return Math.PI * Math.pow(termo1, 2);
    }

    public Double areaQuadrado(Double termo1){
        return Math.pow(termo1, 2);
    }

    public Double areaRetangulo(Double termo1, Double termo2){
        return termo1 * termo2;
    }
}

package com.matheus.silobytes.modelos;

public class Silo {
    private String codigo;
    private double capacidadeMaxima;
    private double capacidadeOcupada;
    private double valorDiariaPorTonelada;

    public Silo() {

    }

    public Silo(double capacidadeMaxima, double capacidadeOcupada, String codigo, double valorDiariaPorTonelada) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.capacidadeOcupada = capacidadeOcupada;
        this.codigo = codigo;
        this.valorDiariaPorTonelada = valorDiariaPorTonelada;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public double getCapacidadeOcupada() {
        return capacidadeOcupada;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValorDiariaPorTonelada() {
        return valorDiariaPorTonelada;
    }

    public void setCapacidadeOcupada(double capacidadeOcupada) {
        this.capacidadeOcupada = capacidadeOcupada;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setValorDiariaPorTonelada(double valorDiariaPorTonelada) {
        this.valorDiariaPorTonelada = valorDiariaPorTonelada;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean temEspacoDisponivel(double toneladas) {
        return (this.capacidadeOcupada + toneladas) <= this.capacidadeMaxima;
    }

    public void adicionarCarga (double toneladas) {
        if (temEspacoDisponivel(toneladas)) {
            this.capacidadeOcupada += toneladas;
        }
    }

    public void removerCarga(double toneladas) {
        this.capacidadeOcupada -= toneladas;
        if (this.capacidadeOcupada <= 0) {
            this.capacidadeOcupada = 0;
        }
    }
}

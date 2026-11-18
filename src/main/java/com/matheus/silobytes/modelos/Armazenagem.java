package com.matheus.silobytes.modelos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Armazenagem {
    private String codigo;
    private Produtor produtor;
    private double quantidadeToneladas;
    private String dataEntrada;
    private String dataSaida;
    private double valorTotal;
    private String status;

    public Armazenagem() {

    }

    public Armazenagem(String codigo, String dataEntrada, String dataSaida, Produtor produtor, double quantidadeToneladas, String status, double valorTotal) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.produtor = produtor;
        this.quantidadeToneladas = quantidadeToneladas;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public double getQuantidadeToneladas() {
        return quantidadeToneladas;
    }

    public String getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public void setQuantidadeToneladas(double quantidadeToneladas) {
        this.quantidadeToneladas = quantidadeToneladas;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void calcularValorTotal(double tarifaDiaria) {
        if (this.dataSaida == null || this.dataSaida.isEmpty()) {
            return;
        }

        LocalDate dataIn = LocalDate.parse(this.dataEntrada);
        LocalDate dataOut = LocalDate.parse(this.dataSaida);

        long diasArmazenados = ChronoUnit.DAYS.between(dataIn, dataOut);

        if (diasArmazenados == 0) {
            diasArmazenados = 1;
        }

        this.valorTotal = this.quantidadeToneladas * diasArmazenados * tarifaDiaria;
    }

    public void registrarRetirada(String dataSaida, double tarifaDiaria, boolean vaiPagarNaHora) {
        this.dataSaida = dataSaida;

        // Chama o método interno para calcular quanto deu
        calcularValorTotal(tarifaDiaria);

        // Define o status conforme a escolha do produtor
        if (vaiPagarNaHora) {
            this.status = "PAGO";
        } else {
            this.status = "EM_ABERTO";
        }
    }
}

package model.entities;

import model.enums.StatusVeiculo;
import model.enums.TipoCombustivel;

import java.time.LocalDate;

public abstract class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private double capacidadeTanque;
    private double nivelCombustivel;
    private double consumoMedio; // km/L
    private double odometro; //Vai para o Service
    private double peso;

    private StatusVeiculo statusVeiculo;
    private TipoCombustivel tipoCombustivel;

    private LocalDate dataInicioViagem;
    private LocalDate dataFimViagem;

    private LocalDate dataInicioManutencao;
    private LocalDate dataFimManutencao;

    public Veiculo(String placa, String marca, String modelo,double capacidTanque ,
                   double nivelCombustivel,double consumoMedio,double odometro,double peso,
                   StatusVeiculo statusVeiculo,TipoCombustivel tipoCombustivel) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidTanque;
        this.nivelCombustivel = nivelCombustivel;
        this.consumoMedio = consumoMedio;
        this.odometro = odometro;
        this.peso = peso;
        this.statusVeiculo = statusVeiculo;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public double getOdometro() {
        return odometro;
    }

    public void setOdometro(double odometro) {
        this.odometro = odometro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public StatusVeiculo getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public LocalDate getDataFimViagem() {
        return dataFimViagem;
    }

    public void setDataFimViagem(LocalDate dataFimViagem) {
        this.dataFimViagem = dataFimViagem;
    }

    public LocalDate getDataInicioViagem() {
        return dataInicioViagem;
    }

    public void setDataInicioViagem(LocalDate dataInicioViagem) {
        this.dataInicioViagem = dataInicioViagem;
    }

    public LocalDate getDataFimManutencao() {
        return dataFimManutencao;
    }

    public void setDataFimManutencao(LocalDate dataFimManutencao) {
        this.dataFimManutencao = dataFimManutencao;
    }

    public LocalDate getDataInicioManutencao() {
        return dataInicioManutencao;
    }

    public void setDataInicioManutencao(LocalDate dataInicioManutencao) {
        this.dataInicioManutencao = dataInicioManutencao;
    }

    public void abastecer(double litros) {
    }

    abstract void exibirDetalhes();
}

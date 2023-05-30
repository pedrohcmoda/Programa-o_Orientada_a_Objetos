/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista5;

/**
 *
 * @author pmoda
 */
public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRoda;
    private int velocMax;
    private Motor motor;
    private String dataCadastro;
    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRoda, int velocMax, Motor motor, String dataCadastro){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdRoda = qtdRoda;
        this.velocMax = velocMax;
        this.motor = motor;
        this.dataCadastro = dataCadastro;
    }
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public int getQtdRoda() {
        return qtdRoda;
    }
    public int getVelocMax() {
        return velocMax;
    }
    public Motor getMotor() {
        return motor;
    }
    public String getDataCadastro() {
        return dataCadastro;
    }
    public final void setPlaca(String placa) {
        this.placa = placa;
    }
    public final void setMarca(String marca) {
        this.marca = marca;
    }
    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public final void setCor(String cor) {
        this.cor = cor;
    }
    public final void setQtdRoda(int qtdRoda) {
        this.qtdRoda = qtdRoda;
    }
    public final void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }
    public final void setMotor(Motor motor) {
        this.motor = motor;
    }
    public final void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}

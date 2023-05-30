/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista5;

/**
 *
 * @author pmoda
 */
public class Motor{
    private int qtdPistoes;
    private int potencia;
    
    public Motor(int qtdPistoes, int potencia){
        this.qtdPistoes = qtdPistoes;
        this.potencia = potencia;
    }
    public int getQtdPistoes(){
        return qtdPistoes;
    }
    public int getPotencia(){
        return potencia;
    }
    public void setQtdPistoes(int qtdPistoes){
        this.qtdPistoes = qtdPistoes;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}

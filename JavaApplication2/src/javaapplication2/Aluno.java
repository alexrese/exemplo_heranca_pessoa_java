/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 3223612
 */
public class Aluno extends Pessoa {

    private int codMatricula;
    private int frequencia;
    private float media;

    public Aluno(int codMatricula, int frequencia, float media, String nome, String sexo, int cpf, int idade) {
        super(nome, sexo, cpf, idade);
        this.codMatricula = codMatricula;
        this.frequencia = frequencia;
        this.media = media;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    public void imprime(){
        System.out.println("Nome:" + getNome());
        System.out.println("Codigo Matricula:" + this.codMatricula);
        
    }

}

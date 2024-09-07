package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String Titulo;
    private String Descricao;
    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", data=" + data +
                '}';
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
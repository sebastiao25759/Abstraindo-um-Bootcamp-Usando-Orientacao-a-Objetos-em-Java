package br.com.dio.desafio.dominio;

public class Curso {

    private String Titulo;
    private String Descricao;
    private float duracao;

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

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
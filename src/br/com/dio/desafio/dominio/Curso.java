package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private float duracao;

    @Override
    public double calcularXp() {
        return XP_PADRAO * duracao;
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
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", Duracao=" + duracao +
                '}';
    }

}
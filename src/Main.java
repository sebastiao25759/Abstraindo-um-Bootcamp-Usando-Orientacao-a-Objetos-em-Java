import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Curso de Java");
        curso.setDuracao(7.5F);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

//       System.out.println(curso);
//       System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        Dev dev2 = new Dev();

        dev.setNome("Sebastian");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Nome: " + dev.getNome());
        System.out.println("Conteudos inscritos" + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteudos Concluitos" + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularXp());
        System.out.println("------------------------------------------------------");
        dev2.setNome("Harry");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Nome: " + dev2.getNome());
        System.out.println("Conteudos inscritos" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos Concluitos" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());

    }
}
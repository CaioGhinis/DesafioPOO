import com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("com.dio.desafio.Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("com.dio.desafio.Curso JS");
        curso2.setDescricao("Descricao curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("com.dio.desafio.Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());


        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Caio: " + devCaio.getConteudosInscritos());
        devCaio.progredir();
        System.out.println();
        System.out.println("Conteudos Inscritos Caio: " + devCaio.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Caio: " + devCaio.getConteudosConcluidos());

        System.out.println("XP: " + devCaio.calcularXp());

        System.out.println();
        Dev devThales = new Dev();
        devThales.setNome("Thales");
        devThales.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thales: " + devThales.getConteudosInscritos());
        devThales.progredir();
        devThales.progredir();
        devThales.progredir();
        System.out.println();
        System.out.println("Conteudos Inscritos Thales: " + devThales.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Thales: " + devThales.getConteudosConcluidos());

        System.out.println("XP: " + devThales.calcularXp());




    }
}
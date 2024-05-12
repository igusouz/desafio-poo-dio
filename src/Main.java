import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java santander 2024");
        curso1.setDescricao("Descricao bootcamp java santander 2024");
        curso1.setCargaHoraria(3);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Booot");
        curso2.setDescricao("Descricao Spring Boot");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java santander 2024");
        mentoria.setDescricao("Descricao mentoria java santander");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java santander");
        bootcampJava.setDescricao("Descricao bootcamp java 2024 santander");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos " + devIgor.getNome() + ": " + devIgor.getConteudosInscritos());
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devIgor.getNome() + ": " + devIgor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devIgor.getNome() + ": " + devIgor.getConteudosConcluidos());
        System.out.println("XP:" + devIgor.calcularTotalXp());

        System.out.println("-------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos " + devPedro.getNome() + ": " + devPedro.getConteudosInscritos());
        System.out.println("-");
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteúdos Inscritos " + devPedro.getNome() + ": " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devPedro.getNome() + ": " + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());
    }
}
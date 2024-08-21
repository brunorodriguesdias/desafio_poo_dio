import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Instrutor instrutoraRitiele = new Instrutor();
        instrutoraRitiele.setNome("Ritiele");

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");

        Dev devJoyce = new Dev();
        devJoyce.setNome("Joyce");

        Curso curso = new Curso();
        curso.setTitulo("java");
        curso.setDescricao("orientação a objetos");
        curso.setCargaHoraria(10);
        curso.setInstrutor(instrutoraRitiele);

        Curso curso2 = new Curso();
        curso2.setTitulo("javascript");
        curso2.setDescricao("front end");
        curso2.setCargaHoraria(8);
        curso2.setInstrutor(instrutoraRitiele);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo java");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("orientacao a objetos");
        mentoria.setInstrutor(instrutoraRitiele);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Orientação a objetos com Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //Saida de dados instrutora Ritiele
        instrutoraRitiele.inscreverConteudo(curso);
        instrutoraRitiele.inscreverConteudo(curso2);
        instrutoraRitiele.inscreverConteudo(mentoria);
        System.out.println("Conteúdos inscritos: " + instrutoraRitiele.getConteudosInscritos());
        instrutoraRitiele.progredir();
        System.out.println("Conteúdos concluídos: " + instrutoraRitiele.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + instrutoraRitiele.getConteudosInscritos());
        System.out.println("Salário total: " + instrutoraRitiele.calcularSalarioTotal());
        System.out.println("-------------------------------------------");

        //Saida de dados Dev Bruno
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("Conteúdos inscritos: " + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXP());
        System.out.println("------------------------------------------");

        //Saida de dados dev Joyce
        devJoyce.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoyce.getConteudosInscritos());
        devJoyce.progredir();
        System.out.println("Conteúdos inscritos: " + devJoyce.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devJoyce.getConteudosConcluidos());
        System.out.println("XP: " + devJoyce.calcularTotalXP());

    }
}
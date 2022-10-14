import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Iniciante");
        curso1.setDescricao("Iniciante Dio IFood");
        curso1.setCargaHoraria(8);

        System.out.println(curso1.getTitulo());
        System.out.println(curso1.getDescricao());
        System.out.println(curso1.getCargaHoraria());

        Curso curso2 = new Curso();
        curso2.setTitulo("JS Iniciante");
        curso2.setDescricao("Iniciante Dio JS");
        curso2.setCargaHoraria(4);

        System.out.println(curso2.getTitulo());
        System.out.println(curso2.getDescricao());
        System.out.println(curso2.getCargaHoraria());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria JS Iniciante");
        mentoria1.setDescricao("Mentoria Iniciante Dio JS");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1.getTitulo());
        System.out.println(mentoria1.getDescricao());
        System.out.println(mentoria1.getData());
    }
}

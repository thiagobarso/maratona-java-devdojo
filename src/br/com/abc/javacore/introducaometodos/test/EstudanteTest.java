package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Thiago Soares";
        estudante.idade = 31;
//        estudante.notas = new double[]{8, 7, 9.5};
        estudante.print();
        estudante.tirarMedia();
    }
}

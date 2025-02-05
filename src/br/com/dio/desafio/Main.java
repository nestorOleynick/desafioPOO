package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso PHP");
		curso2.setDescricao("Descrição Curso PHP");
		curso2.setCargaHoraria(7);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Desc de mentoria java");
		mentoria1.setData(LocalDate.now());
		
		
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Desc Bootcamp");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		
		Dev devNestor = new Dev();
		devNestor.inscreverBootcamp(bootcamp1);
		devNestor.setNome("Nestor");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		
		
		
	}

}

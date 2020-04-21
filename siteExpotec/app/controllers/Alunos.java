package controllers;

import java.util.List;

import models.Aluno;
import play.mvc.Controller;

public class Alunos extends Controller{

	public static void form() {
		render();
	}
	
	public static void salvar(Aluno usu) {
		usu.save();
		form();
		
	}
	public static void listar() {
		List<Aluno> lista = Aluno.findAll();
		
		render(lista);
	}
	
	public static void editar(long id) {
		Aluno usu = Aluno.findById(id);
		renderTemplate("Alunos/form.html", usu);
	}
	
	public static void deletar(long id) {
		Aluno usu = Aluno.findById(id);
		usu.delete();
		
		listar();
		
	}
}

package controller;

import model.Curso;
import model.Disciplina;
import model.ModelException;

public class CtrlPrograma {
	
	public static void main(String[] args) {
		
		//
		//Instanciando Cursos
		//
		
		//Erro pelo método construtor
		try {
			Curso c1 = new Curso(200, "Sistemas de Informação", 5000); //Haverá erro pois o código informado é acima de 100
		}
		catch(ModelException e1){
			System.out.println(e1.getMessage());
		}
		//Erro pelos métodos mutantes
		try {
			Curso c2 = new Curso(50, "Enfermagem", 5000);
			
			c2.setCargaHoraria(9999); //Haverá erro pois a carga horária foi definida para acima de 8.000 horas 
			c2.setCodigo(400); //???? Não acionou a mensagem de erro, não sei o porquê
		}
		catch(ModelException e2) {
			System.out.println(e2.getMessage());
		}
		
		//
		//Instanciando Disciplinas
		//
		
		//Erro pelo método construtor
		try {
			Disciplina d1 = new Disciplina("123", "Programação de Computadores III", 5); //Haverá erro pois o código não tem exatos 7 caracteres
		}
		catch(ModelException e3) {
			System.out.println(e3.getMessage());
		}
		
		//Erro pelos métodos mutantes
		try {
			Disciplina d2 = new Disciplina("1234567", "Banco de Dados II", -4); // Haverá erro pois o código é negativo
		}
		catch(ModelException e4) {
			System.out.println(e4.getMessage());
		}	
		
	}
}
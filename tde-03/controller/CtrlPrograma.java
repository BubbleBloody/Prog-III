/*

Aqui eu vou explicar aqueles pontos que você perguntou no classroom
e no código vou colocando comentários específicos pro que você fez

Então vamos lá

Exceções são erros que acontecem enquanto o sistema tá rodando

Eles podem acontecer por algum erro de lógica do desenvolvedor
(como ter uma variável do tipo int, mas deixar disponível que o
usuário faça a entrada de um valor do tipo texto (String). Você
sabe que isso dá erro, né ? kkkkkkk Então)

Se ocorrer, o sistema para na hora (a gente também diz que "quebra")


E aí entram os códigos que você comentou:

try    → tenta executar

  o que tiver dentro de try { aqui } o sistema vai tentar executar
  você coloca aqui dentro o que pode dar erro em tempo de execução (enquanto o sistema tá rodando)

catch  → pega o erro

  se ocorrer algum erro (exceção) no try, o sistema vai parar de executar o try e
  pular pro catch. A partir daí o catch { aqui } vai executar o que tiver dentro dele

throw  → lança erro (exceção) manualmente

  você usa o throw pra causar obrigatoriamente uma excessão no programa
  pra isso, o sistema precisa chegar na linha do throw

  E lembrando que o sistema para imediatamente de rodar
  quando ele chega em uma linha com throw

throws → avisa que o método pode lançar erro (exceção)

  pra você conseguir colocar o "throw" dentro do método
  você precisa dizer que a classe e o método podem causar exceções (podem ter
  uma linha que lança exceção dentro do método, ou seja, que tem o "throw")



Agora vou comentar seus códigos
meus comentários vão tá com "@", só pra você
saber quais são meus e quais são teus

 */

package controller;

import model.*;//Não conhecia esse comando de importar todas as classes do mesmo pacote

public class CtrlPrograma {
	
	public static void main(String[] args) {
		
		//
		//Instanciando Cursos
		//
		
		//Erro pelo método construtor
		try {
			Curso c1 = new Curso(200, "Sistemas de Informação", 5000); //Haverá erro pois o código informado é acima de 100
		}
		catch(ModelException e){
			System.out.println(e.getMessage());
		}
		//Erro pelos métodos mutantes
		
		try {
			Curso c2 = new Curso(50, "Enfermagem", 5000);
			c2.setCargaHoraria(9999); //Haverá erro pois a carga horária foi definida para acima de 8.000 horas
		}
		catch(ModelException e) {
			System.out.println(e.getMessage());
		}
		try {
			c2.setCodigo(400); /* Criei outro bloco try/catch mas ele reclama como do objeto n ser instânciado,
							   	  porém, ele não me deixa instânciar fora do try. */
							   
		}
		catch(ModelException e) {
			System.out.println(e.getMessage());
		}
		//
		//Instanciando Disciplinas
		//
		
		//Erro pelo método construtor
		try {
			Disciplina d1 = new Disciplina("123", "Programação de Computadores III", 5); //Haverá erro pois o código não tem exatos 7 caracteres
		}
		catch(ModelException e) {
			System.out.println(e.getMessage());
		}
		
		//Erro pelos métodos mutantes
		try {
			Disciplina d2 = new Disciplina("1234567", "Banco de Dados II", -4); // Haverá erro pois o código é negativo
		}
		catch(ModelException e) {
			System.out.println(e.getMessage());
		}

	}
}
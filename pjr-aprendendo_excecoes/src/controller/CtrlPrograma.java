package controller;

import java.util.Scanner;
import model.*;

public class CtrlPrograma {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		
		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		
		sc.close();
		
		try {
			p1.setIdade(idade);
		}
		catch() {
			
		}
	}

}
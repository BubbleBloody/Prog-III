package model;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) throws ModelException{
		Pessoa.validarNome(nome);
		this.nome = nome;
	}
	public void setIdade(int idade) throws ModelException{
		Pessoa.validarIdade(idade);
		this.idade = idade;
	}
	
	//Validações:
	public static void validarNome(String nome) throws ModelException{
		if(nome == null || nome.length() == 0)
			throw new ModelException("Erro: Nome Inválido\n O nome não pode ser nulo");
		
		for(int i = 0; i < nome.length(); i++) {
			char c = nome.charAt(i);
					
			if(!Character.isAlphabetic(c) && !Character.isSpaceChar(c))
				throw new ModelException("Erro: Nome Inválido\n Caracter: '" + c + "' Posição: '" + i + "'.");
		}
	}
	
	static final int VALOR_MAX_IDADE = 30;
	
	public static void validarIdade(int idade) throws ModelException {
		if(idade < 0)
			throw new ModelException("Erro! Idade inválida: " + idade + "\nIdade menor que 0.");
		else if(idade > VALOR_MAX_IDADE)
			throw new ModelException("Erro! Idade inválida: " + idade + "\nIdade acima da permitida.");
	}
}
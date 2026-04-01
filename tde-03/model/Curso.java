package model;

public class Curso {
	
	public Curso(int codigo, String nome, int carga) throws ModelException{
		super();
		setCodigo(codigo);
		setNome(nome);
		setCargaHoraria(carga);
	}
	
	//
	//Atributos
	//
	private int codigo, cargaHoraria;
	private String nome;

	/*
	  por padrão, costuma-se colocar o método get e depois seu set correspondente, tipo:

	  public int getCodigo() {
		return this.codigo;
	}

	  public void setCodigo(int codigo) throws ModelException{
		validarCodigo(codigo);
		this.codigo = codigo;
	  }

	  public String getNome() {
		return this.nome;
	}

	  public void setNome(String nome) throws ModelException{
		validarNome(nome);
		this.nome = nome;
	  }


	  Não é errado fazer do jeito que você fez, só não é o padrão
	 */
	
	//Setters de todos o atributos feitos antes dos Getters por preferência pessoal

	//Setters
	public void setCodigo(int codigo) throws ModelException{
		validarCodigo(codigo);
		this.codigo = codigo;
	}
	public void setNome(String nome) throws ModelException{
		validarNome(nome);
		this.nome = nome;
	}
	public void setCargaHoraria(int carga) throws ModelException{
		validarCargaHoraria(carga);
		this.cargaHoraria = carga;
	}
	
	//Getters
	public int getCodigo() {
		return this.codigo;
	}
	public String getNome() {
		return this.nome;
	}
	public int getCargaHoraria() {
		return this.cargaHoraria;
	}
	
	//Métodos de Validação
	public static void validarCodigo(int codigo) throws ModelException{
		if(codigo <= 0)
			throw new ModelException("O código precisa ser maior que 0\nCódigo digitado: " + codigo);
		else if(codigo >= 100)
			throw new ModelException("O código precisa ser menor que 100");
	}
	public static void validarNome(String nome) throws ModelException{
		if(nome.length() > 25 || nome == null) //Validação acrescentando em casos nulos
			throw new ModelException("O nome precisa ter até 25 caracteres\nNome digitado: " + nome.length() + " caracteres");
	}
	public static void validarCargaHoraria(int carga) throws ModelException{
		if(carga < 2000)
			throw new ModelException("A carga horária precisa ser maior do que 2.000 horas"
									 + "\nCarga Horário digitada: " + carga + " horas");
		else if(carga > 8000) 
			throw new ModelException("A carga horária precisar ser menor do que 8.000 horas" 
										+ "\nCarga Horária digitada: " + carga + " horas");		
	}
}
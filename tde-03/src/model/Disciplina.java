package model;

public class Disciplina {
	
	public Disciplina (String codigo, String nome, int creditos) throws ModelException{
		super();
		setCodigo(codigo);
		setNome(nome);
		setNumCreditos(creditos);
	}
	
	//
	//Atributos
	//
	private String codigo, nome;
	private int numCreditos;
	
	//Setters
	public void setCodigo(String codigo) throws ModelException{
		validarCodigo(codigo);
		this.codigo = codigo;
	}
	public void setNome(String nome) throws ModelException{
		validarNome(nome);
		this.nome = nome;
	}
	public void setNumCreditos(int creditos) throws ModelException{
		validarCreditos(creditos);
		this.numCreditos = creditos;
	}
	
	//Getters
	public String getCodigo() {
		return this.codigo;
	}
	public String getNome() {
		return this.nome;
	}
	public int getNumCreditos() {
		return this.numCreditos;
	}
	
	//Métodos de validação
	public static void validarCodigo(String codigo) throws ModelException{
		if(codigo.length() != 7) 
			throw new ModelException("Código precisa ter exatos 7 caracteres alfanuméricos");
	}
	public static void validarNome(String nome) throws ModelException{
		if(nome.length() > 40)
			throw new ModelException("O nome não pode ultrapassar 40 caracteres");
	}
	public static void validarCreditos(int creditos) throws ModelException{
		if(creditos < 0 && creditos > 8)
			throw new ModelException("O número de créditos precisa ser entre 0 e 8");
	}
}

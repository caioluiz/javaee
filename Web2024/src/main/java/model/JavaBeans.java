package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
public class JavaBeans {
	
	/** The id aluno. */
	private String idAluno;
	
	/** The nome. */
	private String nome;
	
	/** The email. */
	private String email;
	
	/** The matricula. */
	private String matricula;
	
	/**
	 * Instantiates a new java beans.
	 */
	public JavaBeans() {
		super();
		
	}
	
	/**
	 * Instantiates a new java beans.
	 *
	 * @param idAluno the id aluno
	 * @param nome the nome
	 * @param email the email
	 * @param matricula the matricula
	 */
	public JavaBeans(String idAluno, String nome, String email, String matricula) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
		this.matricula = matricula;
	}

	/**
	 * Gets the id aluno.
	 *
	 * @return the id aluno
	 */
	public String getIdAluno() {
		return idAluno;
	}
	
	/**
	 * Sets the id aluno.
	 *
	 * @param idAluno the new id aluno
	 */
	public void setIdAluno(String idAluno) {
		this.idAluno = idAluno;
	}
	
	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Gets the matricula.
	 *
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	
	/**
	 * Sets the matricula.
	 *
	 * @param matricula the new matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}

package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
// Classe para encapsular os dados do banco
public class JavaBeans {
	
	/** The id contato. */
	private String id_contato;
	
	/** The nome. */
	private String nome;
	
	/** The fone. */
	private String fone;
	
	/** The email. */
	private String email;

	/**
	 * Instantiates a new java beans.
	 */
	public JavaBeans() {
		super();
	}

	/**
	 * Instantiates a new java beans.
	 *
	 * @param id_contato the id contato
	 * @param nome the nome
	 * @param fone the fone
	 * @param email the email
	 */
	public JavaBeans(String id_contato, String nome, String fone, String email) {
		super();
		this.id_contato = id_contato;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	/**
	 * Gets the id contato.
	 *
	 * @return the id contato
	 */
	public String getId_contato() {
		return id_contato;
	}

	/**
	 * Sets the id contato.
	 *
	 * @param id_contato the new id contato
	 */
	public void setId_contato(String id_contato) {
		this.id_contato = id_contato;
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
	 * Gets the fone.
	 *
	 * @return the fone
	 */
	public String getFone() {
		return fone;
	}

	/**
	 * Sets the fone.
	 *
	 * @param fone the new fone
	 */
	public void setFone(String fone) {
		this.fone = fone;
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
}

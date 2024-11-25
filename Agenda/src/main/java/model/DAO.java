package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
// Conexão com o banco de dados
public class DAO {
	
	/**  Módulo de conexão com o banco *. */

	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://localhost:3306/dbagenda?useSSL=false&useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "root";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	// Métodos de conexão
	private Connection conectar() {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

			return con;
		} catch (Exception e) {
			System.out.println("Não funcionou aqui " + e);

			return null;
		}
	}

	/**
	 *  CRUD Create *.
	 *
	 * @param contato the contato
	 */
	public void insertContato(JavaBeans contato) {
		String create = "insert into contatos (nome, fone, email)" + "values(?, ?, ?);";

		try {
			Connection con = conectar();

			// Preparando dados para o banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());

			pst.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 *  CRUD Read *.
	 *
	 * @return the array list
	 */
	public ArrayList<JavaBeans> listContatos() {
		ArrayList<JavaBeans> contatos = new ArrayList<JavaBeans>();

		String read = "select * from contatos order by nome;";

		try {
			Connection con = conectar();

			PreparedStatement pst = con.prepareStatement(read);

			// Armazena temporáriamente o retorno do banco
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String fone = rs.getString(3);
				String email = rs.getString(4);

				contatos.add(new JavaBeans(id, nome, fone, email));
			}

			con.close();

			return contatos;

		} catch (Exception e) {
			System.out.println(e);

			return null;
		}
	}
	
	/**
	 *  CRUD Select for Update *.
	 *
	 * @param contato the contato
	 */
	public void selectContato(JavaBeans contato) {
		String read = "select * from contatos where id_contato = ?;";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			
			pst.setString(1, contato.getId_contato());
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				contato.setId_contato(rs.getString(1));
				contato.setNome(rs.getString(2));
				contato.setFone(rs.getString(3));
				contato.setEmail(rs.getString(4));
			}
			
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 *  CRUD Update *.
	 *
	 * @param contato the contato
	 */
	public void editContato(JavaBeans contato) {
		String update = "update contatos set nome=?,fone=?,email=? where id_contato = ?";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.setString(4, contato.getId_contato());
			
			pst.executeUpdate();
			
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 *  CRUD Delete *.
	 *
	 * @param contato the contato
	 */
	public void deleteContato(JavaBeans contato) {
		String delete = "delete from contatos where id_contato = ?";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			
			pst.setString(1, contato.getId_contato());
			
			pst.executeUpdate();
			
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

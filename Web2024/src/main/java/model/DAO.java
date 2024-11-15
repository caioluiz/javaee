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
public class DAO {
	
	/**  Modulo de Conexão *. */

	// parâmetros
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "root";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	// método
	private Connection conectar() {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	/**
	 *  CRUD CREATE *.
	 *
	 * @param contato the contato
	 */
	public void inserirAluno(JavaBeans contato) {
		String create = "insert into alunos (nome, email, matricula) values (?,?,?)";
		try {
			// abrir conexao
			Connection con = conectar();
			// Preparar a query para execução do BD
			PreparedStatement pst = con.prepareStatement(create);
			// Substituir os paramentros ? pelo conteudo do JavaBeans
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getEmail());
			pst.setString(3, contato.getMatricula());
			// Executar
			pst.executeUpdate();
			// Encerrar Conexao
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 *  CRUD READ *.
	 *
	 * @return the array list
	 */
	public ArrayList<JavaBeans> listarContatos() {
		ArrayList<JavaBeans> contatos = new ArrayList<>();
		String read = "select * from alunos order by nome";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			// o laço while sera executado enquanto houver contatos
			while (rs.next()) {
				// variaveis de apoio do BD
				String idAluno = rs.getString(1);
				String nome = rs.getString(2);
				String email = rs.getString(3);
				String matricula = rs.getString(4);

				// populando o array list
				contatos.add(new JavaBeans(idAluno, nome, email, matricula));

			}
			con.close();
			return contatos;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	/**
	 *  CRUD UPDATE *.
	 *
	 * @param contato the contato
	 */
	//seleciona o contato
	public void selecionarContato(JavaBeans contato) {
		String read2 = "select * from alunos where idAluno = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, contato.getIdAluno());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				contato.setIdAluno(rs.getString(1));
				contato.setNome(rs.getString(2));
				contato.setEmail(rs.getString(3));
				contato.setMatricula(rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	/**
	 * Alterar aluno.
	 *
	 * @param contato the contato
	 */
	//editar aluno
	public void alterarAluno(JavaBeans contato) {
		String create = "update alunos set nome=?, email=?, matricula=? where idAluno=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getEmail());
			pst.setString(3, contato.getMatricula());
			pst.setString(4, contato.getIdAluno());
			pst.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// teste
	/**
	 * public void testeConexao() { try { Connection con = conectar();
	 * System.out.println(con); con.close(); } catch (Exception e) {
	 * System.out.println(e); } }
	 **/
}

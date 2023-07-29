package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nomeCliente;
	private String email;
	private Date dtNascimento;
	
	
	public Cliente(String nomeCliente, String email, Date dtNascimento) {
		
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.dtNascimento = dtNascimento;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDtNascimento() {
		return dtNascimento;
	}


	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public String toString() {
		return nomeCliente + " (" + sdf.format(dtNascimento) + ") - " + email;
	}
	
	
	
	
	
}

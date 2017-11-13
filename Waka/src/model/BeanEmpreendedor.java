package model;

import java.sql.Blob;

public class BeanEmpreendedor extends BeanUsuario {

	String dataNascimento;
	String telefone;
	String endereco;
	Blob imagem;
	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	String sexo;
	
	
	public BeanEmpreendedor() {
		// CONSTRUTOR VAZIO
	}
	
	
}

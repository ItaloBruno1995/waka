package model;

public class BeanEmpresa  {
	int id;
	String nome;
	int nivel;
	String ramoAtuacao;
	String razaoSocial;
	String cnpj;
	String idEmpreendedor;
	
	
	
	//CONSTRUTOR VAZIO
	public BeanEmpresa(){
		
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public String getRamoAtuacao() {
		return ramoAtuacao;
	}


	public void setRamoAtuacao(String ramoAtuacao) {
		this.ramoAtuacao = ramoAtuacao;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getIdEmpreendedor() {
		return idEmpreendedor;
	}


	public void setIdEmpreendedor(String idEmpreendedor) {
		this.idEmpreendedor = idEmpreendedor;
	}



	
}



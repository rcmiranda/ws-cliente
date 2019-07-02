package br.com.aeksistemas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	// Classe Cliente
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@Column(name = "Nome", nullable = true, length = 50)
	private String Nome;

	@Column(name = "Cpf", nullable = true, length = 20)
	private String Cpf;

	@Column(name = "Data_Nascimento", nullable = true, length = 10)
	private String DataNascimento;

	@Column(name = "Telefone", nullable = true, length = 15)
	private String Telefone;

	@Column(name = "Email", nullable = true, length = 80)
	private String Email;

	@Column(name = "Logradouro", nullable = true, length = 90)
	private String Logradouro;

	@Column(name = "Cep", nullable = true, length = 8)
	private String Cep;

	@Column(name = "Bairro", nullable = true, length = 40)
	private String Bairro;

	@Column(name = "Complemento", nullable = true, length = 60)
	private String Complemento;

	@Column(name = "Cidade", nullable = true, length = 30)
	private String Cidade;

	@Column(name = "Estado", nullable = true, length = 30)
	private String Estado;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String cep) {
		Cep = cep;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

}

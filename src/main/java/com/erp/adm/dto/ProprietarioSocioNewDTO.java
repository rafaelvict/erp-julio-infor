package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.services.validation.ProprietarioSocioInsert;

@ProprietarioSocioInsert
public class ProprietarioSocioNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//Proprietario ou Sócio
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=10, max=50, message="Tamanho deve ser entre 10 e 50 caracteres")
	private String nome;
	
	
	private Date nascimento;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=30, message="Tamanho deve ser entre 5 e 30 caracteres")
	private String nascionalidade;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String cpfCnpj;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String email;
	
	@NotNull
	private Integer estadoCivil;
	
	@NotNull
	private Integer sexo;
	
	@NotNull
	private Integer pessoa;
	
	@NotNull
	private Integer proprietarioSocio;
	
	@NotNull
	private Long empresaId;
	
	//Endereco
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=40, message="Tamanho deve ser entre 5 e 40 caracteres")
	private String rua;
	
	@NotNull
	private Integer numero;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=3, max=40, message="Tamanho deve ser entre 3 e 40 caracteres")
	private String bairro;
	
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String complemento;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String cep;
	
	@NotNull
	private Integer tipo_End;
	
	@NotNull
	private Long cidadeId;
	
	
	//Telefone

	@NotNull
	private Integer ddd;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=8, max=30, message="Tamanho deve ser entre 8 e 30 caracteres")
	private String telefone;
	
	@NotNull
	private Integer tipo_Tel;
	
	private Date data_altera;
	
	public ProprietarioSocioNewDTO() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getNascionalidade() {
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Integer estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public Integer getPessoa() {
		return pessoa;
	}

	public void setPessoa(Integer pessoa) {
		this.pessoa = pessoa;
	}

	public Integer getProprietarioSocio() {
		return proprietarioSocio;
	}

	public void setProprietarioSocio(Integer proprietarioSocio) {
		this.proprietarioSocio = proprietarioSocio;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getTipo_End() {
		return tipo_End;
	}

	public void setTipo_End(Integer tipo_End) {
		this.tipo_End = tipo_End;
	}

	public Long getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Long cidadeId) {
		this.cidadeId = cidadeId;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getTipo_Tel() {
		return tipo_Tel;
	}

	public void setTipo_Tel(Integer tipo_Tel) {
		this.tipo_Tel = tipo_Tel;
	}

	public Date getData_altera() {
		return data_altera;
	}

	public void setData_altera(Date data_altera) {
		this.data_altera = data_altera;
	}

	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}
	
	
}

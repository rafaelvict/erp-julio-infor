package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.erp.adm.enums.TipoEstadoCivil;
import com.erp.adm.enums.TipoPessoa;
import com.erp.adm.enums.TipoProprietarioSocio;
import com.erp.adm.enums.TipoSexo;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ProprietarioSocio extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private String nome;
	private Date nascimento;
	private String nascionalidade;
	private String cpfCnpj;
	
	@Column(unique=true)
	private String email;
	private Integer estadoCivil;
	private Integer sexo;
	private Integer pessoa;
	private Integer proprietarioSocio;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;

	@OneToMany(mappedBy = "proprietarioSocio")
	private List<Endereco> enderecos = new ArrayList<>();
	
	@OneToMany(mappedBy = "proprietarioSocio")
	private List<Telefone> telefones = new ArrayList<>();
	
	
	public ProprietarioSocio() {
		
	}


	public ProprietarioSocio(String nome, Date nascimento, String nascionalidade, String cpfCnpj, String email,
			TipoEstadoCivil estadoCivil, TipoSexo sexo, TipoPessoa pessoa, Empresa empresa, Usuario usuario, TipoProprietarioSocio proprietarioSocio) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.nascionalidade = nascionalidade;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.estadoCivil = (estadoCivil==null) ? null : estadoCivil.getCodigo();
		this.sexo = (sexo==null) ? null : sexo.getCod();
		this.pessoa = (pessoa==null) ? null : pessoa.getCodigo();
		this.empresa = empresa;
		this.usuario = usuario;
		this.proprietarioSocio = (proprietarioSocio==null) ? null : proprietarioSocio.getCodigo();
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


	public TipoSexo getSexo() {
		return TipoSexo.toEnum(sexo);
	}


	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo.getCod();
	}


	public TipoPessoa getPessoa() {
		return TipoPessoa.toEnum(pessoa);
	}


	public void setPessoa(TipoPessoa pessoa) {
		this.pessoa = pessoa.getCodigo();
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public List<Endereco> getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}


	public List<Telefone> getTelefones() {
		return telefones;
	}


	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}


	public TipoProprietarioSocio getProprietarioSocio() {
		return TipoProprietarioSocio.toEnum(proprietarioSocio);
	}


	public void setProprietarioSocio(TipoProprietarioSocio proprietarioSocio) {
		this.proprietarioSocio = proprietarioSocio.getCodigo();
	}



	
	
}

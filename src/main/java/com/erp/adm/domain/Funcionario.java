package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.erp.adm.enums.TipoEstadoCivil;
import com.erp.adm.enums.TipoSexo;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Funcionario extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Date nascimento;
	private String nascionalidade;
	private String cpf;
	
	@Column(unique=true)
	private String email;
	private Integer estadoCivil;
	private Integer sexo;
	private String carteiraTrabalho;
	private Date dataAdmissao;
	private Float percComissaoAtac1;
	private Float percComissaoAtac2;
	private Float descontoMax;
	private Float maxHoras;
	private Float horasSubst;
	private Float salarioHora;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	@Transient
	@OneToOne(cascade = CascadeType.ALL)
	private Usuario usuario;
		
	@OneToMany(mappedBy = "funcionario", cascade=CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();
	
	@OneToMany(mappedBy = "funcionario", cascade=CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<>();
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Date nascimento, String nascionalidade, String cpf, String email,
			TipoEstadoCivil estadoCivil, TipoSexo sexo, String carteiraTrabalho, Date dataAdmissao, Float percComissaoAtac1,
			Float percComissaoAtac2, Float descontoMax, Float maxHoras, Float horasSubst, Float salarioHora,
			Empresa empresa) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.nascionalidade = nascionalidade;
		this.cpf = cpf;
		this.email = email;
		this.estadoCivil = (estadoCivil==null) ? null : estadoCivil.getCodigo();
		this.sexo = (sexo==null) ? null : sexo.getCod();
		this.carteiraTrabalho = carteiraTrabalho;
		this.dataAdmissao = dataAdmissao;
		this.percComissaoAtac1 = percComissaoAtac1;
		this.percComissaoAtac2 = percComissaoAtac2;
		this.descontoMax = descontoMax;
		this.maxHoras = maxHoras;
		this.horasSubst = horasSubst;
		this.salarioHora = salarioHora;
		this.empresa = empresa;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoEstadoCivil getEstadoCivil() {
		return TipoEstadoCivil.toEnum(estadoCivil);
	}

	public void setEstadoCivil(TipoEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil.getCodigo();
	}

	public TipoSexo getSexo() {
		return TipoSexo.toEnum(sexo);
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo.getCod();
	}

	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Float getPercComissaoAtac1() {
		return percComissaoAtac1;
	}

	public void setPercComissaoAtac1(Float percComissaoAtac1) {
		this.percComissaoAtac1 = percComissaoAtac1;
	}

	public Float getPercComissaoAtac2() {
		return percComissaoAtac2;
	}

	public void setPercComissaoAtac2(Float percComissaoAtac2) {
		this.percComissaoAtac2 = percComissaoAtac2;
	}

	public Float getDescontoMax() {
		return descontoMax;
	}

	public void setDescontoMax(Float descontoMax) {
		this.descontoMax = descontoMax;
	}

	public Float getMaxHoras() {
		return maxHoras;
	}

	public void setMaxHoras(Float maxHoras) {
		this.maxHoras = maxHoras;
	}

	public Float getHorasSubst() {
		return horasSubst;
	}

	public void setHorasSubst(Float horasSubst) {
		this.horasSubst = horasSubst;
	}

	public Float getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(Float salarioHora) {
		this.salarioHora = salarioHora;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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
	
}

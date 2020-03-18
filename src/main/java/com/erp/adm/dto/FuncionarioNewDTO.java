package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.services.validation.FuncionarioInsert;

@FuncionarioInsert
public class FuncionarioNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=50, message="Tamanho deve ser entre 5 e 50 caracteres")
	private String nome;
	
	
	private Date nascimento;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=4, max=30, message="Tamanho deve ser entre 4 e 30 caracteres")
	private String nascionalidade;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String cpf;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String email;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=10, max=20, message="Tamanho deve ser entre 10 e 20 caracteres")
	private String carteiraTrabalho;
	
	
	private Date dataAdmissao;
	
	@NotNull
	private Integer estadoCivil;
	
	@NotNull
	private Integer sexo;
	
	@NotNull
	private Float percComissaoAtac1;
	
	@NotNull
	private Float percComissaoAtac2;
	
	@NotNull
	private Float descontoMax;
	
	@NotNull
	private Float maxHoras;
	
	@NotNull
	private Float horasSubst;
	
	@NotNull
	private Float salarioHora;
	
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
	
	//Ramo Atividade
	private String descricao;
	
	public FuncionarioNewDTO() {
		
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

	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}

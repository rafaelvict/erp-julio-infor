package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.erp.adm.enums.TipoAnimal;
import com.erp.adm.enums.TipoDependente;
import com.erp.adm.enums.TipoPorte;
import com.erp.adm.enums.TipoSexo;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Dependente extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nomeDep;
	private String cpf;
	private String rg;
	private Integer tipoDep;
	private Date dataCad;
	private Date nascimento;
	private String status;
	private Date dataAltera;
	private String cor;
	private String racaAnimal;
	private Integer tipoAnimal;
	private Integer tipoSexo;
	private Integer tipoPorte;
	private boolean vivo;
	private String obs;
	private String obs2;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@OneToMany(mappedBy="dependente", cascade = CascadeType.ALL)
	private List<DetalhesGerais> detalhesGerais = new ArrayList<>();

	
	public Dependente() {
		
	}
	
	public Dependente(String nomeDep, String cpf, String rg, TipoDependente tipoDep, Date dataCad, Date nascimento,
			String status, Date dataAltera, String cor, String racaAnimal, TipoAnimal tipoAnimal, TipoSexo tipoSexo,
			TipoPorte tipoPorte, boolean vivo, String obs, String obs2, Cliente cliente) {
		super();
		this.nomeDep = nomeDep;
		this.cpf = cpf;
		this.rg = rg;
		this.tipoDep = (tipoDep==null) ? null : tipoDep.getCodigo();
		this.dataCad = dataCad;
		this.nascimento = nascimento;
		this.status = status;
		this.dataAltera = dataAltera;
		this.cor = cor;
		this.racaAnimal = racaAnimal;
		this.tipoAnimal = (tipoAnimal==null) ? null : tipoAnimal.getCodigo();
		this.tipoSexo = (tipoSexo==null) ? null : tipoSexo.getCod();
		this.tipoPorte = (tipoPorte==null) ? null : tipoPorte.getCodigo();
		this.vivo = vivo;
		this.obs = obs;
		this.obs2 = obs2;
		this.cliente = cliente;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public TipoDependente getTipoDep() {
		return TipoDependente.toEnum(tipoDep);
	}

	public void setTipoDep(TipoDependente tipoDep) {
		this.tipoDep = tipoDep.getCodigo();
	}

	public Date getDataCad() {
		return dataCad;
	}

	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataAltera() {
		return dataAltera;
	}

	public void setDataAltera(Date dataAltera) {
		this.dataAltera = dataAltera;
	}

	public TipoSexo getTipoSexo() {
		return TipoSexo.toEnum(tipoSexo);
	}

	public void setTipoSexo(TipoSexo tipoSexo) {
		this.tipoSexo = tipoSexo.getCod();
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getObs2() {
		return obs2;
	}

	public void setObs2(String obs2) {
		this.obs2 = obs2;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<DetalhesGerais> getDetalhesGerais() {
		return detalhesGerais;
	}

	public void setDetalhesGerais(List<DetalhesGerais> detalhesGerais) {
		this.detalhesGerais = detalhesGerais;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRacaAnimal() {
		return racaAnimal;
	}

	public void setRacaAnimal(String racaAnimal) {
		this.racaAnimal = racaAnimal;
	}

	public TipoAnimal getTipoAnimal() {
		return TipoAnimal.toEnum(tipoAnimal);
	}

	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal.getCodigo();
	}

	public TipoPorte getTipoPorte() {
		return TipoPorte.toEnum(tipoPorte);
	}

	public void setTipoPorte(TipoPorte tipoPorte) {
		this.tipoPorte = tipoPorte.getCodigo();
	}
	
	
}

package br.com.usjt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Atendimento {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="id_senha")
	@OneToOne
	@NotNull
	@JoinColumn(name="id_senha")
	Senha senha;
	@Column(name="id_subservico")
	@NotNull
	@OneToMany
	Subservico subservico;
	@Column(name="data_entrada")
	Date dataEntrada;
	@Column(name="data_saida")
	Date dataSaida;
	@Column(name="duracao")
	int duracao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Senha getSenha() {
		return senha;
	}
	public void setSenha(Senha senha) {
		this.senha = senha;
	}
	public Subservico getSubservico() {
		return subservico;
	}
	public void setSubservico(Subservico subservico) {
		this.subservico = subservico;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	@Override
	public String toString() {
		return "Atendimento [id=" + id + ", senha=" + senha + ", subservico=" + subservico + ", dataEntrada="
				+ dataEntrada + ", dataSaida=" + dataSaida + ", duracao=" + duracao + "]";
	}
	public Atendimento() {
		super();
	}
	
	
}

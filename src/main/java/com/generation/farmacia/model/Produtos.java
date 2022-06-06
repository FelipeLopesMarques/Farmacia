package com.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produtos")
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Este Campo é obrigatório e não pode conter apenas espaço em branco!")
	@Size(min = 2, max = 50, message = "O atributo deve conter no mínimo 5 e no máximo 50 caracteres!") 
	private String nome;
	
	private String foto;
	
	@NotBlank(message = "Este Campo é obrigatório e não pode conter apenas espaço em branco!")
	@Size(min = 5, max = 550, message = "O atributo deve conter no mínimo 5 e no máximo 550 caracteres!") 
	private String descricao;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "Este Campo é obrigatório!")
	@Positive(message = "Este é obrigatório e deve conter valor maior que zero!") 
	private BigDecimal preco;
	
	@NotNull(message = "Este Campo é obrigatório!")
	@Positive(message = "Este é obrigatório e deve conter valor positivo!")
	private int quantidade;
	
	@NotBlank(message = "Este Campo é obrigatório e não pode conter apenas espaço em branco!")
	@Size(min = 5, max = 50, message = "O atributo deve conter no mínimo 5 e no máximo 550 caracteres!") 
	private String observacao;
	
	@ManyToOne
	@JsonIgnoreProperties ("produtos")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getObservação() {
		return observacao;
	}

	public void setObservação(String observação) {
		this.observacao = observação;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}

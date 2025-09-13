package lab.crud.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	private BigDecimal preço;
	private LocalDate dataCriacao;
	
	public Produto () {
		
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	//ALT+SHIFT+S(Source/Fonte/Código Fonte
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreço() {
		return preço;
	}

	public void setPreço(BigDecimal preço) {
		this.preço = preço;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preço=" + preço
				+ ", dataCriacao=" + dataCriacao + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataCriacao, descricao, id, nome, preço);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(dataCriacao, other.dataCriacao) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(preço, other.preço);
	}
	
		
}

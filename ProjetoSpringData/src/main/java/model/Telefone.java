package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String tipo;
	@Column(nullable = false)
	private String numero;
	@ManyToOne(optional = false)
	private UsuarioSpring usuarioSpring;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public UsuarioSpring getUsuarioSpring() {
		return usuarioSpring;
	}
	public void setUsuarioSpring(UsuarioSpring usuarioSpring) {
		this.usuarioSpring = usuarioSpring;
	}
	
	
	
}

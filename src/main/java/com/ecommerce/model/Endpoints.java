package com.ecommerce.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="endpoint")
public class Endpoints {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="diagnosticcentre_id")  
	private DiagnosticsCentre diagnosticcentre;
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public DiagnosticsCentre getDiagnosticcentre() {
		return diagnosticcentre;
	}
	public void setDiagnosticcentre(DiagnosticsCentre diagnosticCenter) {
		this.diagnosticcentre = diagnosticCenter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Endpoints [id=" + id + ", diagnosticcentre=" + diagnosticcentre + ", name=" + name +"]";
	}
}

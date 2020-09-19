package com.ecommerce.dto;

public class EndpointDTO {
	private Long id;
	private String name;
	private Long diagnosticcentre_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDiagnosticcentre_id() {
		return diagnosticcentre_id;
	}
	public void setDiagnosticcentre_id(Long diagnosticcentre_id) {
		this.diagnosticcentre_id = diagnosticcentre_id;
	}
}

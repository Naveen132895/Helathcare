package com.ecommerce.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tests")
public class Tests {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToOne
    @JoinColumn(name="diagnosticcentre_id")
	private DiagnosticsCentre diagnosticcentre;
	@OneToMany(mappedBy="tests")
	private List<Endpoints> endpoint;
	private LocalDate startDate;
	private LocalDate validTillDate;
	private int availableSeats;
	private double cost;
	
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
	public DiagnosticsCentre getDiagnosticcentre() {
		return diagnosticcentre;
	}
	public void setDiagnosticcentre(DiagnosticsCentre diagnosticcentre) {
		this.diagnosticcentre = diagnosticcentre;
	}
	public List<Endpoints> getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(List<Endpoints> endpoint) {
		this.endpoint = endpoint;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getValidTillDate() {
		return validTillDate;
	}
	public void setValidTillDate(LocalDate validTillDate) {
		this.validTillDate = validTillDate;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}

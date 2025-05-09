package com.jpacourse.persistance.entity;

import java.time.LocalDate;
import java.util.List;

import com.jpacourse.dto.AddressTO;
import jakarta.persistence.*;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String telephoneNumber;

	private String email;

	@Column(nullable = false)
	private String patientNumber;

	@Column(nullable = false)
	private LocalDate dateOfBirth;

	@Column(nullable = false)
	private char gender;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@OneToOne( cascade =  CascadeType.ALL, // default: empty
	fetch = FetchType.LAZY, // default: EAGER
	optional = false) // default: true
	@JoinColumn(name="address_id", referencedColumnName = "id")
	private AddressEntity address;

	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<VisitEntity> visits;

	public AddressEntity getAddress() { return (AddressEntity) address;
	}
	public List<VisitEntity> getDoneVisits() { return visits; }
	public void setVisits(List<VisitEntity> visits) { this.visits = visits; }

	@Transient
	public String getGenderAsString() {
		return null;
	}

	public void setAddressTo(AddressTO addressTO) {
	}
}

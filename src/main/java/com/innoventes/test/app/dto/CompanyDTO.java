package com.innoventes.test.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {
        @Id
	@SequenceGenerator(sequenceName = "company_seq", allocationSize = 1, name = "company_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
	private Long id;

	@Column(name = "company_name")
	@NotNull(message = "Company name is mandatory")
	@NotEmpty("message = "Company name cannot be empty")
	@Size(min = 5, message = "Companyname should be at least 5 characters long")
	private String companyName;

	@Column(name = "email")
	@NotNull(message = "Email is mandatory")
	@EMail(message = "Email should be valid")
	private String email;

	@Column(name = "strength")

	@Column(name = "Strength")
	@PositiveOrZero(message = "Strength should be a positive number or zero")
	private Integer strength;

	@Column(name = "website_url")

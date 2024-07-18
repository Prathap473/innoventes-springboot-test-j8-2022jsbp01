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

	private Long id;

	@NotNull(message = "Company name is mandatory")
	@NotEmpty("message = "Company name cannot be empty")
	@Size(min = 5, message = "Companyname should be at least 5 characters long")
	private String companyName;

	@NoNull(message = "Email is manadatory")
	@Email(message = "Email should be valid")
	private String email;
	

	@PositiveOrZero(message = "Strength should be a positive number or zero")
	private Integer strength;

	
	private String webSiteURL;
}

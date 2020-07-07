package com.patil.model;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.patil.service.CalculateAge;

@JsonClassDescription
public class AgeModel 
{
	 // Formats output date when this DTO is passed through JSON
	  //@JsonFormat(pattern = "dd/MM/yyyy")
	
	  // Allows dd/MM/yyyy date to be passed into GET request in JSON
	  @DateTimeFormat(pattern = "dd/MM/yyyy")
	  private LocalDate dateOfBirth;
	  
	  private Integer years;
		 private Integer months;
		 public Integer getYears() {
			return years;
		}
		public void setYears(Integer years) {
			this.years = years;
		}
		public Integer getMonths() {
			return months;
		}
		public void setMonths(Integer months) {
			this.months = months;
		}
		public Integer getDays() {
			return days;
		}
		public void setDays(Integer days) {
			this.days = days;
		}
		private Integer days;
	  
	 public AgeModel (LocalDate dateOfBirth) {
		// TODO Auto-generated method stub
		  this.dateOfBirth = dateOfBirth;

	}
	  public AgeModel() {}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}

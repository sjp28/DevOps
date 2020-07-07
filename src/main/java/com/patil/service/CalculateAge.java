package com.patil.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.patil.model.AgeModel;
import com.patil.response.UserRest;

@RestController 

@ResponseBody
public class CalculateAge {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@RequestMapping(value = "/users", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)

	@CrossOrigin("*")
	public UserRest userRest (@RequestBody AgeModel personDTO)   throws IOException  {
		System.out.println(personDTO.getDateOfBirth());
		UserRest returnValue = new UserRest();
		BeanUtils.copyProperties(personDTO, returnValue);
		System.out.println(returnValue.getDateOfBirth());

		System.out.println("1st syso" + personDTO);
		// LocalDate l = LocalDate.of(1995, 04, 23); //specify year, month, date
		// directly
		
		
		LocalDate localDate = personDTO.getDateOfBirth();

		LocalDate now = LocalDate.now(); // gets localDate
		Period diff = Period.between(localDate, now); // difference between the dates is calculated

		returnValue.setYears(diff.getYears());
		returnValue.setMonths(diff.getMonths());
		returnValue.setDays(diff.getDays());

		System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");

		return returnValue;

	}

	

	
}

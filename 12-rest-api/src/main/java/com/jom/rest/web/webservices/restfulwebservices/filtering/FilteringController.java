package com.jom.rest.web.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		SomeBean someBean = new SomeBean("value1", "value2", "value3");
		MappingJacksonValue mappingJacksonValue = createMappingJackSonValue(someBean, "SomeBeanFilter", "field1", "field3");
		
		return mappingJacksonValue;
	}
	
	@GetMapping("/filtering-list")
	public MappingJacksonValue filteringList() {
		List<SomeBean> list = Arrays.asList(new SomeBean("value1", "value2", "value3"), 
				new SomeBean("value4", "value5", "value6"));
		
		MappingJacksonValue mappingJacksonValue = createMappingJackSonValue(list, "SomeBeanFilter", "field1", "field3");
		
		return mappingJacksonValue;
	}

	private MappingJacksonValue createMappingJackSonValue(Object value, String filterId, String... propertyArray) {
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(value);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(propertyArray);
		FilterProvider filters = new SimpleFilterProvider().addFilter(filterId, filter );
		mappingJacksonValue.setFilters(filters);
		
		return mappingJacksonValue;
	}
}

package com.prospecta.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.prospecta.DTO.CustomEntryDTO;
import com.prospecta.model.APIResponse;
import com.prospecta.model.Entry;

@RestController
public class CategoryControllers {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/entries/{category}")
	public List<CustomEntryDTO> getEntriesByCategory(@PathVariable("category") String category){
		APIResponse apiResponse = restTemplate.getForObject("https://api.publicapis.org/entries",APIResponse.class);
		
		APIResponse apiResp = restTemplate.getForObject("https://api.publicapis.org/entries", APIResponse.class);
		List<Entry> allEntry = apiResp.getEntries();
		List<CustomEntryDTO> categorywiseResponse = allEntry.stream().filter(e -> e.getCategory().equals(category)).map(e -> new CustomEntryDTO(e.getApi(), e.getDescription())).toList();
		
		return categorywiseResponse;
	}
	
	
}

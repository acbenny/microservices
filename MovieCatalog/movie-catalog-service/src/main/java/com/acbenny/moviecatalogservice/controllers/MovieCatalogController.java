package com.acbenny.moviecatalogservice.controllers;

import java.util.Collections;
import java.util.List;

import com.acbenny.moviecatalogservice.models.CatalogItem;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		return Collections.singletonList(
			new CatalogItem("Transformers","Transformers movie",4)
		);
	}
}
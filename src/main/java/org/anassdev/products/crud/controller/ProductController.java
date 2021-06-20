package org.anassdev.products.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome In This Web Appplication 2021-06";
	}
}

package com.mars.mobiletower.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mars.mobiletower.model.CellTower;
import com.mars.mobiletower.repositry.CellTowerRepositry;
@RestController
@RequestMapping("/api")
public class MobileTowerController {
	@Autowired
	CellTowerRepositry cellTowerRepositry;
	
	@GetMapping
	public String index() {
		return "This is index"; 
	}
	// Create a new Note
	@PostMapping("/cellTower")
	public String createNote(@Valid @RequestBody CellTower cellTower) {
	   CellTower cellTowerdata= cellTowerRepositry.save(cellTower);
	   if(null!=cellTowerdata)
	   {
		   return "success";
	   }else {
	    return "fail";
	   }
	}
}

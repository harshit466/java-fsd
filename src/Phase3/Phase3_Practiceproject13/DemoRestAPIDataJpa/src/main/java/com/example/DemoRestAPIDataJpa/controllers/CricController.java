package com.example.DemoRestAPIDataJpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.DemoRestAPIDataJpa.models.CricInfo;
import com.example.DemoRestAPIDataJpa.service.CricService;


@RestController
public class CricController {

	@Autowired
	CricService cs;
	
	//@PostMapping("/cricketer")
	@RequestMapping(value="/cricketer", method=RequestMethod.POST)
	public ResponseEntity<String> AddCricketer(@RequestBody CricInfo crk)
	{
		cs.AddCricketer(crk);
		return new ResponseEntity<String>("New Cricketer is Added..", HttpStatus.CREATED);
	}
	
	//@GetMapping("/cricketer")
	@RequestMapping(value="/cricketer", method=RequestMethod.GET)
	public ResponseEntity<List<CricInfo>>  ShowAll()
	{
		return new ResponseEntity<List<CricInfo>>(cs.ShowAll(), HttpStatus.OK);
	}
	
	@GetMapping("/cricketer/{cid}")
	public ResponseEntity<Object>  Search(@PathVariable int cid)
	{
		CricInfo cinfo = cs.SearchCricketer(cid);
				if(cinfo!=null)
					return new ResponseEntity<Object>(cinfo, HttpStatus.OK);
				
				return new ResponseEntity<Object>("Cricketer Not Found", HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/cricketer/{cid}")
	public ResponseEntity<Object>  DeleteCrk(@PathVariable int cid)
	{
				CricInfo cinfo = cs.SearchCricketer(cid);
				if(cinfo!=null)
				{
					cs.DeleteCric(cid);
					return new ResponseEntity<Object>("Cricketer Deleted", HttpStatus.OK);
				}
				return new ResponseEntity<Object>("Cricketer Not Found", HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/cricketer/{cid}")
	public ResponseEntity<Object>  ModifyCrk(@PathVariable int cid, @RequestBody CricInfo crk)
	{
				CricInfo cinfo = cs.SearchCricketer(cid);
				if(cinfo!=null)
				{
					cinfo.setCrname(crk.getCrname());
					cinfo.setGame(crk.getGame());
					cinfo.setRuns(crk.getRuns());
					
					cs.ModifyCricInfo(cinfo);
					return new ResponseEntity<Object>("Cricketer Details are Modified", HttpStatus.OK);
				}
				return new ResponseEntity<Object>("Cricketer Not Found", HttpStatus.NOT_FOUND);
	}

}

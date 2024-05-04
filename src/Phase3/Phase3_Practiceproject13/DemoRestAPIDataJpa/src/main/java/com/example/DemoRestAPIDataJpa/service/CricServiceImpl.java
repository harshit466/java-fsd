package com.example.DemoRestAPIDataJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoRestAPIDataJpa.models.CricInfo;
import com.example.DemoRestAPIDataJpa.repo.CrickRepo;



@Service
public class CricServiceImpl implements CricService {

	@Autowired
	CrickRepo cr;

	@Override
	public void AddCricketer(CricInfo crk) {
		cr.save(crk);
	}

	@Override
	public List<CricInfo> ShowAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public CricInfo SearchCricketer(int crno) {
		Optional<CricInfo>  cinfo = cr.findById(crno);
		if(cinfo.isPresent())
			return cinfo.get();
		return null;
	}

	@Override
	public void DeleteCric(int crno) {
		cr.deleteById(crno);
	}

	@Override
	public void ModifyCricInfo(CricInfo crk) {
		cr.saveAndFlush(crk);
	}
	
}
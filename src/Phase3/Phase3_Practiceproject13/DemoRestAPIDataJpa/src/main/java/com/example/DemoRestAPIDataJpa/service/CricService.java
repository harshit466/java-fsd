package com.example.DemoRestAPIDataJpa.service;


import java.util.List;

import com.example.DemoRestAPIDataJpa.models.CricInfo;



public interface CricService {
	public void AddCricketer(CricInfo crk);
	public List<CricInfo> ShowAll();
	public CricInfo SearchCricketer(int crno);
	public void DeleteCric(int crno);
	public void ModifyCricInfo(CricInfo crk);
}
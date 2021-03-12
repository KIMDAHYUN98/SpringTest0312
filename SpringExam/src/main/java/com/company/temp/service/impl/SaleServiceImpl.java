package com.company.temp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.temp.service.SaleService;
import com.company.temp.vo.SaleVO;
@Service
public class SaleServiceImpl implements SaleService {

	@Autowired SaleMapper dao;

	@Override
	public int insertSale(SaleVO list) {
		return dao.insertSale(list);
	}


	
}

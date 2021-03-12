package com.company.temp.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.temp.service.SaleService;
import com.company.temp.vo.SaleVO;

@Controller
public class SaleController {
	
	@Autowired SaleService saleService;
	
	@RequestMapping("/insertSale")
	@ResponseBody
	public Map insertSale(SaleVO list) {
		int r = saleService.insertSale(list);
		return Collections.singletonMap("cnt", r);
		
	}
}

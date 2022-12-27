package com.amdocs.wellsfargo.tradesystem.model;

import com.amdocs.wellsfargo.tradesystem.service.TradeCurrencyTypeService;
/*
 * @author Jeevan
 */
public class India implements TradeCurrencyTypeService{

	@Override
	public String getTradeCurrencyType() {
		
		return "INR";
	}

	
}

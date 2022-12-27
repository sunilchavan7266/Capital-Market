package com.amdocs.wellsfargo.tradesystem.model;

import com.amdocs.wellsfargo.tradesystem.service.TradeCurrencyTypeService;
/*
 * @author Jeevan
 */
public class France implements TradeCurrencyTypeService {

	@Override
	public String getTradeCurrencyType() {
		
		return "yen";
	}

}

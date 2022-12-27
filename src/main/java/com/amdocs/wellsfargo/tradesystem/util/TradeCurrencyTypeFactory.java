package com.amdocs.wellsfargo.tradesystem.util;

import com.amdocs.wellsfargo.tradesystem.exception.CurrencyTypeException;
import com.amdocs.wellsfargo.tradesystem.model.India;
import com.amdocs.wellsfargo.tradesystem.model.France;
import com.amdocs.wellsfargo.tradesystem.model.USA;
import com.amdocs.wellsfargo.tradesystem.service.TradeCurrencyTypeService;
/*
 * @author Jeevan
 */
public class TradeCurrencyTypeFactory {

	public TradeCurrencyTypeService getTradeCurrencyType(String currency) throws CurrencyTypeException {

		if (currency == null) {
			return null;
		}
		if (currency.equalsIgnoreCase("dollar")) {
			return new USA();
		} else if (currency.equalsIgnoreCase("yen")) {
			return new France();
		} else if (currency.equalsIgnoreCase("INR")) {
			return new India();
		}
		throw new CurrencyTypeException("Invalid input.");
	}
}

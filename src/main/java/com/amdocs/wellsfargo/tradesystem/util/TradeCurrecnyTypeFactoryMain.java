package com.amdocs.wellsfargo.tradesystem.util;

import java.util.Scanner;

import com.amdocs.wellsfargo.tradesystem.exception.CurrencyTypeException;
import com.amdocs.wellsfargo.tradesystem.service.TradeCurrencyTypeService;
/*
 * @author Jeevan
 */
public class TradeCurrecnyTypeFactoryMain {

	public static void main(String[] args) throws CurrencyTypeException {

		TradeCurrencyTypeFactory policyTypeFactory = new TradeCurrencyTypeFactory();
		System.out.println("Enter the trade currency type::");
		Scanner sc = new Scanner(System.in);
		String currency = sc.nextLine();
		try {
			TradeCurrencyTypeService policyTypeService=policyTypeFactory.getTradeCurrencyType(currency);
			System.out.println(policyTypeService.getTradeCurrencyType());
		}
		catch(CurrencyTypeException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}

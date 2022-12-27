package com.amdocs.wellsfargo.tradesystem.service;

import com.amdocs.wellsfargo.tradesystem.model.Trade;
/**
*
* @author Jeevan
*/
public interface TradeService {
	
	public Iterable<Trade> getAllTrade();
	public Trade saveTrade(Trade trade);
	public Trade getTradeById(Integer Id);
	public void deleteTrade(Integer id);
	
}

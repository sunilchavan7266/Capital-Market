package com.amdocs.wellsfargo.tradesystem.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.wellsfargo.tradesystem.exception.TradeSystemException;
import com.amdocs.wellsfargo.tradesystem.model.Trade;
import com.amdocs.wellsfargo.tradesystem.repository.TradeRepository;
import com.amdocs.wellsfargo.tradesystem.service.TradeService;

/**
*
* @author Jeevan
*/
@Service
public class TradeServiceImpl implements TradeService{

	private static final Logger logger = LoggerFactory.getLogger(TradeServiceImpl.class);
	
	@Autowired
	private TradeRepository repo;

	@Override
	public Iterable<Trade> getAllTrade() {
		logger.info("Trade Service Implementation : getAllTrade() method");
		return repo.findAll();
	}

	@Override
	public Trade saveTrade(Trade trade) {
		logger.info("Trade Service Implementation : saveTrade() method");
		return repo.save(trade);
	}

	@Override
	public Trade getTradeById(Integer Id) {
		logger.info("Trade Service Implementation : getTradeById() method");
		Trade trade=repo.findById(Id);
		if(trade==null) {
			throw new TradeSystemException("trade"+Id+"not found");
		}
		return trade;

	}

	@Override
	public void deleteTrade(Integer id) {
		logger.info("Trade Service Implementation : deleteTrade() method");
		repo.deleteById(id);
	}

}

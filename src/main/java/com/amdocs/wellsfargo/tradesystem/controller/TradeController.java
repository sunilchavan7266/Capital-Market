package com.amdocs.wellsfargo.tradesystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.wellsfargo.tradesystem.exception.TradeSystemException;
import com.amdocs.wellsfargo.tradesystem.model.Trade;
import com.amdocs.wellsfargo.tradesystem.service.TradeService;
import com.amdocs.wellsfargo.tradesystem.serviceImpl.TradeServiceImpl;

/**
 *
 * @author Jeevan
 */
@RestController
@RequestMapping("/trade")
public class TradeController {

	private static final Logger logger = LoggerFactory.getLogger(TradeController.class);

	@Autowired
	private TradeService tradeService;

	/**
	 * This method is used to get all the policy details.
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/getAll")
	public @ResponseBody Iterable<Trade> getAllTrade() throws Exception {
		logger.info("Trade Rest Controller Implementation : getAllTrade() method");
		return tradeService.getAllTrade();
	}

	/*
	 * This method is used to store the policy details for particular user.
	 */
	@PostMapping("/save")
	public ResponseEntity<Trade> createTrade(@RequestBody Trade trade, HttpServletRequest request)
			throws Exception {
		Trade createdTrade = tradeService.saveTrade(trade);
		logger.info("Trade Rest Controller Implementation : createTrade() method");
		return ResponseEntity.ok().body(createdTrade);
	}

	/*
	 * This method is used to get the policy details of user by using user id.
	 */
	@GetMapping("/get/{id}")
	public ResponseEntity<Trade> getTradeById(@PathVariable("id") Integer id) throws TradeSystemException {
		Trade trade = tradeService.getTradeById(id);
		logger.info("Trade Rest Controller Implementation : getTradeById() method");
		return ResponseEntity.ok().body(trade);
	}

	/*
	 * This method is used to delete the policy details of user by using id.
	 */
	@DeleteMapping("/delete/{id}")
	public void deleteTradeById(@PathVariable("id") Integer id) throws Exception {
		logger.info("Trade Rest Controller Implementation : deleteTradeById() method");
		tradeService.deleteTrade(id);
	}
}

package com.amdocs.wellsfargo.tradesystem.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.wellsfargo.tradesystem.model.Trade;
/**
*
* @author Jeevan
*/
public interface TradeRepository extends JpaRepository<Trade, Serializable>{
	
	public Trade findById(Integer Id);

}

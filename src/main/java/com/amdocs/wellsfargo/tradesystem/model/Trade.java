package com.amdocs.wellsfargo.tradesystem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*
* @author Jeevan
*/
@Entity
@Table(name="trade")
public class Trade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="tradetype")
	private String tradeType;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="quantity")
	private String quantity;
	
	@Column(name="date")
	private String date;
	
	@Column(name="counterpartyname")
	private String counterPartyName;

	@Column(name="status")
	private String status;
		
	public Trade() {
		
	}

	public Trade(Integer id, String tradeType, String currency, String amount, String date, String counterPartyName,
			String status, String quantity) {
		super();
		this.id = id;
		this.tradeType = tradeType;
		this.currency = currency;
		this.amount = amount;
		this.date = date;
		this.counterPartyName = counterPartyName;
		this.status = status;
		this.quantity=quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCounterPartyName() {
		return counterPartyName;
	}

	public void setCounterPartyName(String counterPartyName) {
		this.counterPartyName = counterPartyName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Trade [id=" + id + ", tradeType=" + tradeType + ", currency=" + currency + ", amount=" + amount
				+ ", date=" + date + ", counterPartyName=" + counterPartyName + ", status=" + status + "]";
	}

}
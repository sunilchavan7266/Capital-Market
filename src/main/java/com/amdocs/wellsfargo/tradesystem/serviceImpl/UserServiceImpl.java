package com.amdocs.wellsfargo.tradesystem.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.wellsfargo.tradesystem.exception.TradeSystemException;
import com.amdocs.wellsfargo.tradesystem.model.User;
import com.amdocs.wellsfargo.tradesystem.repository.UserRepository;
import com.amdocs.wellsfargo.tradesystem.service.UserService;
/**
*
* @author Jeevan
*/
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User loginUser(String username, String password) {
		User user = userRepository.findByUsername(username);
		if(user == null) {
			throw new TradeSystemException("You entered incorrect username.");
		}else {
			if(user.getUserpwd().equals(password)) {
				return user;
			}
			throw new TradeSystemException("You entered incorrect password.");	
		}
	}
}

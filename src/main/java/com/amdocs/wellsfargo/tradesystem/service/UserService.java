package com.amdocs.wellsfargo.tradesystem.service;

import com.amdocs.wellsfargo.tradesystem.model.User;
/**
*
* @author Jeevan
*/
public interface UserService {
	
	public User loginUser(String username, String password)throws Exception;
	
}
                                                     





package com.amdocs.wellsfargo.tradesystem.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.wellsfargo.tradesystem.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {

	public User findByUsername(String username);

}

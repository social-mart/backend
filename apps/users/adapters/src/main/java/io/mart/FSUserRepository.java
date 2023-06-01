package io.mart;

import io.mart.ports.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class FSUserRepository implements UserRepository {
	
	@Override
	public String getUser(String name) {
		return "User this is a users " + name;
	}
}

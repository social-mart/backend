package io.mart;

import io.mart.ports.UserRepository;

public class FSUserRepository implements UserRepository {
	
	@Override
	public void createUser(String name) {
		System.out.println("User was created");
	}
}

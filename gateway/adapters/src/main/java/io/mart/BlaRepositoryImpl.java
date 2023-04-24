package io.mart;

import io.mart.model.SimpleBla;
import io.mart.ports.SimpleRepository;

public class BlaRepositoryImpl implements SimpleRepository {
	
	@Override
	public SimpleBla get() {
		return new SimpleBla("one");
	}
}

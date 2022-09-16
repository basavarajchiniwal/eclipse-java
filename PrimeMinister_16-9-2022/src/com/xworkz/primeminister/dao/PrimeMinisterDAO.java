package com.xworkz.primeminister.dao;

import com.xworkz.primeminister.exception.InvalidDataException;

public interface PrimeMinisterDAO {
	boolean save(String prmeMinisterName);

	boolean check(String prmeMinisterName) throws InvalidDataException;

}

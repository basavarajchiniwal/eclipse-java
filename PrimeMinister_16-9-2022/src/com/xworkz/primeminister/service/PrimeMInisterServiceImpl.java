package com.xworkz.primeminister.service;

import com.xworkz.primeminister.dao.PrimeMinisterDAO;
import com.xworkz.primeminister.exception.InvalidDataException;

public class PrimeMInisterServiceImpl implements PrimeMinisterService {
	PrimeMinisterDAO dao;

	public PrimeMInisterServiceImpl(PrimeMinisterDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean checkAndValidate(String name) throws InvalidDataException {
		if (name != null && name.length() > 4 && name.length() < 50) {
			if (!this.dao.check(name)) {
				System.out.println("name is not duplicate");
				return dao.save(name);

			} else {
				System.err.println("name is duplicate");
			}
		} else {
			System.err.println("it is a valid name");
			throw new InvalidDataException("it is Invalid");
		}
		return false;

	}
}

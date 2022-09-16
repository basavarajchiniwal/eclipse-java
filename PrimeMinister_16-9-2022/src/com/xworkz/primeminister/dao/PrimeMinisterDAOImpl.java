package com.xworkz.primeminister.dao;

import com.xworkz.primeminister.exception.InvalidIndexException;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {
	private String[] dao = new String[5];
	private int index;

	@Override
	public boolean save(String prmeMinisterName) {
		if (this.index < this.dao.length) {
			this.dao[index] = prmeMinisterName;
			System.out.println("name is saved" + prmeMinisterName + "Index" + this.index);
			index++;
			return true;
		} else {
			System.err.println("index is not valid ");

		}
		return true;

	}

	@Override
	public boolean check(String prmeMinisterName) {
		for (String ref : this.dao) {
			if (ref != null && ref.equals(prmeMinisterName)) {
				return true;
			}
		}
		return false;
	}
}

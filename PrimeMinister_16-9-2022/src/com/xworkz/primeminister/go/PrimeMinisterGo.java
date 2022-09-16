package com.xworkz.primeminister.go;

import com.xworkz.primeminister.dao.PrimeMinisterDAO;
import com.xworkz.primeminister.dao.PrimeMinisterDAOImpl;
import com.xworkz.primeminister.exception.InvalidDataException;
import com.xworkz.primeminister.exception.InvalidIndexException;
import com.xworkz.primeminister.service.PrimeMInisterServiceImpl;
import com.xworkz.primeminister.service.PrimeMinisterService;

public class PrimeMinisterGo {

	public static void main(String[] args) {
		PrimeMinisterDAO dao = new PrimeMinisterDAOImpl();
		PrimeMinisterService service = new PrimeMInisterServiceImpl(dao);

		service.checkAndValidate("Atal Bihari Vajapayee");
		service.checkAndValidate("Narendra Modi");
		service.checkAndValidate("Indira Gandhi");
		service.checkAndValidate("Narasimha Rao");
		service.checkAndValidate("V P Singh");
		service.checkAndValidate("H D Devegowda");

	}catch (InvalidDataException error) {
		error.getMessage();
		error.getClass();
	} catch (InvalidIndexException exc) {
		exc.getMessage();
	}

}

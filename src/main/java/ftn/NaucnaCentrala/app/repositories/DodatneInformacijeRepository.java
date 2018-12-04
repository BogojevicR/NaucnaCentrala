package ftn.NaucnaCentrala.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ftn.NaucnaCentrala.app.models.DodatneInformacije;
import ftn.NaucnaCentrala.app.models.Korisnik;

public interface DodatneInformacijeRepository extends JpaRepository<DodatneInformacije,String>{
	public DodatneInformacije findById(String id);
	
}

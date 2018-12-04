package ftn.NaucnaCentrala.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ftn.NaucnaCentrala.app.models.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik,String> {
	public Korisnik findByEmail(String email);

}

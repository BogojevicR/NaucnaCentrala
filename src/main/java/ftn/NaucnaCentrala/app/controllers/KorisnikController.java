package ftn.NaucnaCentrala.app.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import ftn.NaucnaCentrala.app.models.Korisnik;
import ftn.NaucnaCentrala.app.repositories.DodatneInformacijeRepository;
import ftn.NaucnaCentrala.app.repositories.KorisnikRepository;

@RestController
@RequestMapping("/korisnik")
public class KorisnikController {
	
	@Autowired
	KorisnikRepository korisnikrep;
	@Autowired
	DodatneInformacijeRepository inforep;
	
	@RequestMapping(value="/register", method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean register(@RequestBody Korisnik korisnik) throws JsonParseException, JsonMappingException, IOException, JsonMappingException, IOException{
		System.out.println(korisnik.toString());
		System.out.println(korisnik.getDodatne_informacije().toString());
		if(korisnikrep.findByEmail(korisnik.getEmail())!=null){
			return false;
		}else{
			
			inforep.save(korisnik.getDodatne_informacije());
			korisnikrep.save(korisnik);
			
			
	}
		return true;
	}
}

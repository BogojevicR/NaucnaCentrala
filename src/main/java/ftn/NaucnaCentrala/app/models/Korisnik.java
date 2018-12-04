package ftn.NaucnaCentrala.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Korisnik implements Serializable {
	
	public enum Uloga {ADMIN,KUPAC,RECEZANT,UREDNIK,AUTOR}
	@Id
	@Column(name="email")
	private String email;
	@Column(name="ime")
	private String ime;
	@Column(name="prezime")
	private String prezime;
	@Column(name="uloga")
	private Uloga uloga;
	@Column(name="grad")
	private String grad;
	@Column(name="drzava")
	private String drzava;
	@Column(name="lozinka")
	private String lozinka;
	
	@OneToOne
	private DodatneInformacije dodatne_informacije;

	public Korisnik() {
		super();
		
	}
	public Korisnik(String email, String ime, String prezime, Uloga uloga, String grad, String drzava, String lozinka,
			DodatneInformacije dodatne_informacije) {
		super();
		this.email = email;
		this.ime = ime;
		this.prezime = prezime;
		this.uloga = uloga;
		this.grad = grad;
		this.drzava = drzava;
		this.lozinka = lozinka;
		this.dodatne_informacije = dodatne_informacije;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public DodatneInformacije getDodatne_informacije() {
		return dodatne_informacije;
	}

	public void setDodatne_informacije(DodatneInformacije dodatne_informacije) {
		this.dodatne_informacije = dodatne_informacije;
	}

	public Uloga getUloga() {
		return uloga;
	}

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}

	@Override
	public String toString() {
		return "Korisnik [email=" + email + ", ime=" + ime + ", prezime=" + prezime + ", uloga=" + uloga + ", grad="
				+ grad + ", drzava=" + drzava + ", lozinka=" + lozinka + ", dodatne_informacije=" + dodatne_informacije
				+ "]";
	}


	
	
	

}

package ftn.NaucnaCentrala.app.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Casopis {
	@Id
	@Column(name="naziv")
	private String naziv;
	@Column(name="issn")
	// to je  0567-8315 broj sa 8 scifara i crom moze uud random 
	private String issn;
	@ElementCollection
	private List<String> naucne_oblasti=new ArrayList<String>();
	public enum NacinPlacanja {CITAOCI,AUTORI}
	@Column(name="nacinplacanja")
	private NacinPlacanja nacin_placanja;
	@OneToOne // TODO: MOZDA TREBA ManyToOne
	private UredjivackiOdbor uredjivacki_odbor;
	@ElementCollection
	private List<Korisnik> recezanti=new ArrayList<Korisnik>();
	
	
	
	public Casopis() {
		super();
	}
	public Casopis(String naziv, String issn, List<String> naucne_oblasti, NacinPlacanja nacin_placanja,
			UredjivackiOdbor uredjivacki_odbor, List<Korisnik> recezanti) {
		super();
		this.naziv = naziv;
		this.issn = issn;
		this.naucne_oblasti = naucne_oblasti;
		this.nacin_placanja = nacin_placanja;
		this.uredjivacki_odbor = uredjivacki_odbor;
		this.recezanti = recezanti;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public List<String> getNaucne_oblasti() {
		return naucne_oblasti;
	}
	public void setNaucne_oblasti(List<String> naucne_oblasti) {
		this.naucne_oblasti = naucne_oblasti;
	}
	public NacinPlacanja getNacin_placanja() {
		return nacin_placanja;
	}
	public void setNacin_placanja(NacinPlacanja nacin_placanja) {
		this.nacin_placanja = nacin_placanja;
	}
	public UredjivackiOdbor getUredjivacki_odbor() {
		return uredjivacki_odbor;
	}
	public void setUredjivacki_odbor(UredjivackiOdbor uredjivacki_odbor) {
		this.uredjivacki_odbor = uredjivacki_odbor;
	}
	public List<Korisnik> getRecezanti() {
		return recezanti;
	}
	public void setRecezanti(List<Korisnik> recezanti) {
		this.recezanti = recezanti;
	}
	@Override
	public String toString() {
		return "Casopis [naziv=" + naziv + ", issn=" + issn + ", nacin_placanja=" + nacin_placanja
				+ ", uredjivacki_odbor=" + uredjivacki_odbor + ", recezanti=" + recezanti
				+ "]";
	}
	
}

package ftn.NaucnaCentrala.app.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class UredjivackiOdbor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="glavni_urednik")
	private Korisnik glavni_urednik;
	@ElementCollection
	private List<Korisnik> urednici_pojedinacnih_oblasti=new ArrayList<Korisnik>();
	
	public UredjivackiOdbor() {
		super();
	}
	public UredjivackiOdbor(Korisnik glavni_urednik, List<Korisnik> urednici_pojedinacnih_oblasti){
		super();
		this.glavni_urednik = glavni_urednik;
		this.urednici_pojedinacnih_oblasti = urednici_pojedinacnih_oblasti;
	}
	
	public Korisnik getGlavni_urednik() {
		return glavni_urednik;
	}
	
	public void setGlavni_urednik(Korisnik glavni_urednik) {
		this.glavni_urednik = glavni_urednik;
	}
	
	public List<Korisnik> getUrednici_pojedinacnih_oblasti() {
		return urednici_pojedinacnih_oblasti;
	}
	
	public void setUrednici_pojedinacnih_oblasti(List<Korisnik> urednici_pojedinacnih_oblasti) {
		this.urednici_pojedinacnih_oblasti = urednici_pojedinacnih_oblasti;
	}
	@Override
	public String toString() {
		return "UredjivackiOdbor [glavni_urednik=" + glavni_urednik + ", urednici_pojedinacnih_oblasti="
				+ urednici_pojedinacnih_oblasti + "]";
	}
	
	
	
	
}

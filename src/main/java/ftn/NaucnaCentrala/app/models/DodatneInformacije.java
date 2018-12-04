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
public class DodatneInformacije  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="titula")
	private String titula;
	//TODO:4 mislim da ovde ide lista
	@ElementCollection
	private List<String> naucne_oblasti=new ArrayList<String>();
	
	public DodatneInformacije() {
		super();

	}
	
	public DodatneInformacije(String titula, List<String> naucne_oblasti) {
		super();
		this.titula = titula;
		this.naucne_oblasti = naucne_oblasti;
	}
	public String getTitula() {
		return titula;
	}
	public void setTitula(String titula) {
		this.titula = titula;
	}
	public List<String> getNaucne_oblasti() {
		return naucne_oblasti;
	}
	public void setNaucna_oblast(List<String> naucne_oblasti) {
		this.naucne_oblasti = naucne_oblasti;
	}
	@Override
	public String toString() {
		return "DodatneInformacije [titula=" + titula + ", naucna_oblast=" + naucne_oblasti + "]";
	}
	
	
	
}

package rva.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Dobavljac implements Serializable {

private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOBAVLJAC_ID_GENERATOR")
	@SequenceGenerator(name = "DOBAVLJAC_ID_GENERATOR", sequenceName = "DOBAVLJAC_SEQ", allocationSize = 1)	
	private int id;
	
	private String naziv;
	
	private String adresa;
	
	private String kontakt;
	
	@JsonIgnore
	@OneToMany(mappedBy = "dobavljac")
	private List<Porudzbina>  porudzbine;
	
	public List<Porudzbina> getPorudzbine() {
		return porudzbine;
	}
	public void setPorudzbine(List<Porudzbina> porudzbine) {
		this.porudzbine = porudzbine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getKontakt() {
		return kontakt;
	}
	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}
}

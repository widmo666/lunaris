package lunaris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "typCzolgu")
@Entity
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class TypCzolgu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "nazwa_typu")
	private String nazwaTypu;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazwaTypu() {
		return nazwaTypu;
	}

	public void setNazwaTypu(String nazwaTypu) {
		this.nazwaTypu = nazwaTypu;
	}

}
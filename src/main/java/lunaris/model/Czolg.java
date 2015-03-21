package lunaris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "czolg")
@Entity
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Czolg {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "nazwa")
	private String nazwa;

	@ManyToOne
	private TypCzolgu typCzolgu;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public TypCzolgu getTypCzolgu() {
		return typCzolgu;
	}

	public void setTypCzolgu(TypCzolgu typCzolgu) {
		this.typCzolgu = typCzolgu;
	}
}
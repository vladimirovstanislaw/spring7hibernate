package ch7;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contact_tel_detail")
public class ContactTelDetail implements Serializable {
	private Long id;
	private int version;
	private String telType;
	private String telNumber;

	public ContactTelDetail() {
	}

	public ContactTelDetail(String telType, String telNumber) {
		this.telType = telType;
		this.telNumber = telNumber;
	}
}

package net.kortsoft.jsonws;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Access(AccessType.FIELD)
public class Beacon {

	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true)
	private String beaconId;
	private String url;

	public Beacon(String beaconId, String url) {
		this.beaconId = beaconId;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public String getBeaconId() {
		return beaconId;
	}

	public String getUrl() {
		return url;
	}

	// JPA
	public Beacon() {

	}
}

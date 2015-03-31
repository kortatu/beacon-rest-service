package net.kortsoft.jsonws;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeaconRepository extends JpaRepository<Beacon, Long> {
	public Beacon findByBeaconId(String beaconId);
	public Beacon findByUrl(String url);
}

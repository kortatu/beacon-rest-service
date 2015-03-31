package net.kortsoft.jsonws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	BeaconRepository beaconRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (beaconRepository.findByBeaconId("abcd-efgh-ijkl")==null) {
			beaconRepository.save(new Beacon("abcd-efgh-ijkl", "www.google.com"));
			beaconRepository.save(new Beacon("1234-5678-90AB", "www.facebook.com"));
			beaconRepository.save(new Beacon("111", "www.twitter.com"));
			beaconRepository.save(new Beacon("1", "www.ratebeer.com"));
		}
	}

}
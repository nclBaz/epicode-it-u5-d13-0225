package riccardogulin.u5d13.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ObserverRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Aldo", "Baglio");
		Mediaworld mediaworld = new Mediaworld("sadsad");
		AppleStore appleStore = new AppleStore("josadijosad", "456487978");
		Apple apple = new Apple();

		apple.addSub(user);
		apple.addSub(appleStore);
		apple.addSub(mediaworld);

		apple.makeAnnouncement("E' uscito il nuovo iphone 10000!");
	}
}

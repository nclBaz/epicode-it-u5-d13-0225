package riccardogulin.u5d13.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		User user = new User("admin@gmail.com", "12345", "ADMIN");

		LoggerFilter logger = new LoggerFilter();
		AuthenticationFilter authFilter = new AuthenticationFilter();
		AuthorizationFilter authorizationFilter = new AuthorizationFilter();

		// Imposto la catena dei filtri authorization --> authentication --> logger
		authorizationFilter.setNext(authFilter);
		authFilter.setNext(logger);

		authorizationFilter.doWork(user);
	}
}

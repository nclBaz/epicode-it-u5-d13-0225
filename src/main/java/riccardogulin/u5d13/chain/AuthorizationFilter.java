package riccardogulin.u5d13.chain;

public class AuthorizationFilter extends BaseFilter {
	@Override
	public void doWork(User user) {
		if (user.getRole().equals("ADMIN")) {
			System.out.println("BENVENUTO ADMIN!");
			this.next(user);
		} else {
			System.out.println("Solo gli admin possono accedere!");
		}
	}
}

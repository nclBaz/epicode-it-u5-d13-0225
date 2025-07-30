package riccardogulin.u5d13.chain;

public class AuthenticationFilter extends BaseFilter {
	@Override
	public void doWork(User user) {
		if (user.getEmail().equals("admin@gmail.com") && user.getPassword().equals("1234")) {
			System.out.println("Credenziali OK!");
			this.next(user);
		} else {
			System.out.println("Credenziali ERRATE!!");
		}
	}
}

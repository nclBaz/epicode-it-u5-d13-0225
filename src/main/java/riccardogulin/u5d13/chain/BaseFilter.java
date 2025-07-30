package riccardogulin.u5d13.chain;

import lombok.Setter;

@Setter
public abstract class BaseFilter {
	private BaseFilter next;

	public abstract void doWork(User user);

	public void next(User user) {
		if (this.next != null) this.next.doWork(user);
		else System.out.println("Siamo arrivati alla fine della catena");
	}
}

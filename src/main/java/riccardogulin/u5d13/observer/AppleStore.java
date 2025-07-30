package riccardogulin.u5d13.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AppleStore implements Subscriber {
	private String address;
	private String phoneNumber;

	@Override
	public void receiveNews(String message) {
		System.out.println(message);
		System.out.println("Inviatene 1000!");
	}
}

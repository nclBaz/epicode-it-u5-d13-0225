package riccardogulin.u5d13.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Mediaworld implements Subscriber {
	private String address;

	@Override
	public void receiveNews(String message) {
		System.out.println(message);
		System.out.println("Contatto subito il fornitore per averne 100!");
	}
}

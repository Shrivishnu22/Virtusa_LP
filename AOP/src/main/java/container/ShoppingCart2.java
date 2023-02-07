package container;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart2 {
	public void checkout() {
		System.out.println("Hey ! I'm in checkout 2 !!");
	}
}

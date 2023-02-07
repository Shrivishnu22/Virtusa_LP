package container;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	public void checkout() {
		System.out.println("Hey ! I'm in checkout !!");
	}
	
	public void checkout(String name) {
		System.out.println(name+", Thanks for Checking out !");
	}
}

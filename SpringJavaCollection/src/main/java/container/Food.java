package container;

import java.util.Iterator;
import java.util.List;

public class Food {
	private int id;
	private String name;
	private List<String> recipe;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getRecipe() {
		return recipe;
	}
	public void setRecipe(List<String> recipe) {
		this.recipe = recipe;
	}
	
	public void display() {
		System.out.println("ID of Food :"+ id);
		System.out.println("Name of Food :"+ name);
		Iterator<String> it = recipe.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("-----------------------");
	}

}

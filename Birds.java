package Animals;


import java.util.ArrayList;

public class Birds {

	public static void main(String[] args) {
		Birds bd = new Birds();
		bd.makeSomeBirds();
	}
	public void makeSomeBirds() {
		Bird Eagle = new Eagle();
		Bird Pegion = new Pegion();
		
		ArrayList<Bird> birds = new ArrayList<Bird>();
		birds.add(Eagle);
		birds.add(Pegion);
		birds.forEach(Bird ::makeSound);
		 
	}

	public abstract class Bird {
		abstract void makeSound();
	}
	

	
	public class Eagle extends Bird {
		void makeSound() {
			screech();
		}
		void screech() {
			System.out.println("Screech");
		}
	}
	public class Pegion extends Bird {
		void makeSound() {
			cooo();
		}
		void cooo() {
			System.out.println("cooo");
		}
	}
}
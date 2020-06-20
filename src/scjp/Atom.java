package scjp;

public class Atom {

	Atom() {
		System.out.println("atom");
	}

}

class Rock extends Atom {
	public Rock(String type) {
		System.out.println(type);
	}
}


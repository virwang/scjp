package scjp;

public class Super {

	private int a;

	class Sub extends Super {
		public Sub(int a) {
			super(a);
		}

		public Sub()(this.a = 5);
	}
}

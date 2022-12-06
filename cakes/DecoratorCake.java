package cakes;

public abstract class DecoratorCake extends Cakes {

	protected Cakes cake;

	protected DecoratorCake() {
		this.cake = new Cakes() {
			@Override
			public String getDescription() {
				return "";
			}

			@Override
			public int getPrice() {
				return 20;
			}
		};
	}

	protected DecoratorCake(Cakes cake) {
		this.cake = cake;
	}
}
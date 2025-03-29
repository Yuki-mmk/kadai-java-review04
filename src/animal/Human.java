package animal;

public class Human extends Animal implements Thinkable {
	private String hobby;

	public Human(String string) {
	}

	public Human(String name, int year, String hobby) {
		super(name, year);
		this.hobby = hobby;
	  }

	@Override
    public void think() {
		System.out.println("私は" + hobby + "について考えています。");
	}

}

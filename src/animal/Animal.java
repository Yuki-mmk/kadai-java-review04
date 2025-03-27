package animal;

public class Animal {
	private String name;
    private int year;

  public Animal() {
  }

  public Animal(String name, int year) {
	  this.name = name;
	  this.year = year;
  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
    }

	public int getYear() {
		return year;
	}

    public void setyear(int year) {
        this.year = year;
    }

  public void say() {
      System.out.println(name + "です。" + year + "歳です。");
  }

}

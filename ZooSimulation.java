

class Animal{
String species;
public Animal(String species) {
	super();
	this.species = species;
}
public String getSpecies() {
	return species;
}
public void makeSound()
{
System.out.println("generic animal sound");
}

@Override
public String toString() {
return "Animal [species=" + species + "]";
}
public Animal reproduce()
{
System.out.println("Generic reproduction method for all animals");
return new Animal("unknown");
}
}
class Mammal extends Animal{
	boolean hasFur;

	
	public Mammal(String species,boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
		
	}

	@Override
	public void makeSound()
	{
	System.out.println("Mammal animal sound");
	}
	
	@Override
	public String toString() {
		return "Mammal [hasFur=" + hasFur + ", species=" + species + "]";
	}

	@Override
	public Animal reproduce() {
		
		System.out.println("Mammals give birth to live young.");
	return new Mammal("mammals",true);
	}
	public void nurseYoung() {
		System.out.println("mammals nursing their young");
	}
	
	
}
class Bird extends Animal{
	boolean canFly;
	public Bird(String species,boolean canFly) {
		super(species);
		this.canFly=canFly;
	}
	@Override
	public void makeSound()
	{
	System.out.println("Bird animal sound");
	}
	
	@Override
	public String toString() {
		return "Bird [canFly=" + canFly + ", species=" + species + "]";
	}
	@Override
	public Animal reproduce()
	{
	System.out.println("Birds lay eggs as a means of reproduction");
	return new Bird("Bird", true);
	}
	public void buildNest() {
		System.out.println("birds building nests for their eggs");
	}
	
	
}
public class ZooSimulation {
	public static void main(String[] args) {
		Animal a=new Mammal("lion", true);
	a.makeSound();
	a.toString();
		Animal m = a.reproduce();
		System.out.println(m);
		Animal n=new Bird("parrot", false);
		n.makeSound();
		n.toString();
		Animal bird = n.reproduce();
		System.out.println(bird);
		
	}
	

}

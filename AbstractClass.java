
public class AbstractClass {

	public static void main(String[] args) {
		Guitar g=new Guitar();
		g.play();
		g.pluck();
		g.tuneStrings();
		g.use();

	}

}
abstract class Instrument{
	abstract void use();
}
abstract class MusicalInstrument extends Instrument{
	abstract void tuneStrings();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument{
	abstract void play() ;
}
class Guitar extends StringBasedMusicalInstrument{

	@Override
	void tuneStrings() {
		System.out.println("Tunning the string of Guitar");
		
	}
	void play() {
		System.out.println("Playing musical instrument");
	}
	void pluck() {
		System.out.println("Pluck the Guitar");
	}
	@Override
	void use() {
		System.out.println("Guitar is used as a musical instrument");
		
	}
}
class ElectricGuitar extends Guitar{
	void poweron() {
		System.out.println("Electric Guitar needs to be poweron");
	}
	void poweroff() {
		System.out.println("Power Off");
	}
}
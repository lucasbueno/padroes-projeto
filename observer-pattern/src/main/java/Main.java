
public class Main {

	public static void main(String[] args) {
		Service whatsapp = new Service("Whatsapp");
		Service face = new Service("Facebook");
		
		Device motog1 = new Device("Moto G1");
		Device motog2 = new Device("Moto G2");
		Device motog3 = new Device("Moto G3");
		Device motog4 = new Device("Moto G4");
		Device motog5 = new Device("Moto G5");
		Device motog6 = new Device("Moto G6");
		Device motog7 = new Device("Moto G7");
		
		whatsapp.addObserver(motog1);
		whatsapp.addObserver(motog2);
		whatsapp.addObserver(motog3);
		whatsapp.addObserver(motog4);
		whatsapp.addObserver(motog5);
		whatsapp.addObserver(motog6);
		whatsapp.addObserver(motog7);
		
		face.addObserver(motog3);
		
		whatsapp.notify("Que tal criar mais um grupo?");
		System.out.println();
		face.notify("Ninguém mais me usa :(");
	}

}

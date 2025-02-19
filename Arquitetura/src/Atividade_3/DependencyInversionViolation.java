package Atividade_3;

public class DependencyInversionViolation {
	    public static void main(String[] args) {
	        Switch lightSwitch = new Switch();
	        lightSwitch.turnOf();
	    }
	}

	interface Turn {
	    void turnOn();
	    void turnOf();
	}
	
	class Switch implements Turn{
		
		
		public void turnOn() {
			System.out.println("LightBulb is ON");
		}
		
		public void turnOf() {
			System.out.println("LightBulb is OFF");
		}

	}


```java
public class DependencyInversionViolation {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);
        lightSwitch.turnOn();
    }
}

class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}

class Switch {
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void turnOn() {
        bulb.turnOn();
    }

    public void turnOff() {
        bulb.turnOff();
    }
}

```

*ERROS*

_1- classe LightBulb está com mais de uma função_

_2- classe Switch está com sobreposição de métodos e mais de uma função_

_3- a classe Switch tem denpedência da classe LightBilb_
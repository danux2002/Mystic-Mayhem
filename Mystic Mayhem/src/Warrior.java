import java.security.PublicKey;
public class Warrior {
    static int price ;
    double Price;
    double attack ;
    double defence ;
    double health ;
    double speed ;
    String name;

    public String getName() {
        return name;
    }
    public String ShowName(){return name;}

    public void setPrice(double price) {
        Price = price;
    }

    public double getPrice() {
        return Price;
    }

    String category;
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;


    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getCategory() {
        return category;
    }

    public void setAm1(Chainmail am1) {
        this.am1 = am1;
    }

    public void setAm2(Regalia am2) {
        this.am2 = am2;
    }

    public void setAm3(Fleece am3) {
        this.am3 = am3;
    }

    public void setAr1(Excalibur ar1) {
        this.ar1 = ar1;
    }

    public void setAr2(Amulet ar2) {
        this.ar2 = ar2;
    }

    public void setAr3(Crystal ar3) {
        this.ar3 = ar3;
    }
}



public class Knight extends Warrior{
    static int price ;
    double Price;
    double attack ;
    double defence ;
    double health ;
    double speed ;
    String category;
    String name="Knight";
    public String ShowName(){return name;}
    @Override
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(double price) {
        Price = price;
    }

    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;

    @Override
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    @Override
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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
class  Squire extends Knight{
    static int price = 85;
    String name = "Squire";
    double Price = 85;
    double attack = 8;
    double defence = 9;
    double health = 7;
    double speed = 8;
    String category = "Marshlanders";

    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;
    public String ShowName(){return name;}
    public double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(double price) {
        Price = price;
    }

    public String getCategory() {
        return category;
    }
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    @Override
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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
class  Cavalier extends Knight{
    String name = "Cavalier";
    static int price = 110;
    double Price = 110;
    double attack = 10;
    double defence = 12;
    double health = 7;
    double speed = 10;
    String category = "Highlanders";
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;

    public String ShowName(){return name;}
    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(double price) {
        Price = price;
    }

    public String getCategory() {
        return category;
    }
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    @Override
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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
class Templar extends Knight{
    String name = "Templar";
    static int price = 155;
    double Price;
    double attack = 14;
    double defence = 16;
    double health = 12;
    double speed = 12;
    String category = "Sunchildren";
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;
    public String ShowName(){return name;}
    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(double price) {
        Price = price;
    }

    public String getCategory() {
        return category;
    }
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    @Override
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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
class Zoro extends Knight{
    String name = "Zoro";
    static int price = 180;
    double Price =180;
    double attack = 17;
    double defence = 16;
    double health = 13;
    double speed = 14;
    String category = " Highlanders";
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;
    public String ShowName(){return name;}
    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(double price) {
        Price = price;
    }

    public String getCategory() {
        return category;
    }
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    @Override
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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
class   Swiftblade extends Knight {
    String name = "Swiftblade";
    static int price = 250;
    double Price = 250;
    double attack = 18;
    double defence = 20;
    double health = 17;
    double speed = 13;
    String category = "Marshlanders";
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;
    public String ShowName(){return name;}
    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(double price) {
        Price = price;
    }

    public String getCategory() {
        return category;
    }
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    @Override
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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

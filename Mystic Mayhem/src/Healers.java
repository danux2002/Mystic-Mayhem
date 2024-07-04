

public class Healers extends Warrior{
    static int price ;
    double Price;
    double attack ;
    double defence ;
    double health ;
    double speed ;
    String category;
    String name="Healer";
    public String ShowName(){return name;}
    @Override
    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
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
class Soother extends Healers{
    String name = "Soother";
    static int price = 95;
    double Price = 95;
    double attack = 10;
    double defence = 8;
    double health = 9;
    double speed = 6;
    String category = "Sunchildren";
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;
    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    public String ShowName(){return name;}

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
class Medic extends Healers{
    String name = "Medic";
    static int price = 125;
    double Price = 125;
    double attack = 12;
    double defence = 9;
    double health = 10;
    double speed = 7;
    String category = "Highlanders";
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    public String ShowName(){return name;}
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
class Alchemist extends Healers{
    static int price = 150;
    String name = "Alchemist";
    double Price = 150;
    double attack = 13;
    double defence = 13;
    double health = 13;
    double speed = 13;
    String category = "Marshlanders";
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    public String ShowName(){return name;}
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
class Saint extends Healers{
    String name = "Saint";
    static int price = 200;
    double Price = 200;
    double attack = 16;
    double defence = 14;
    double health = 17;
    double speed = 9;
    String category = "Mystics";
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;

    public void setPrice(double price) {
        Price = price;
    }
    public String ShowName(){return name;}
    @Override
    public double getPrice() {
        return Price;
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
class Lightbringer extends Healers {
    static int price = 260;
    String name = "Lightbringer";
    double Price = 260;
    double attack = 17;
    double defence = 15;
    double health = 19;
    double speed = 12;
    String category = "Sunchildren";
    Chainmail am1;
    Regalia am2;
    Fleece am3;
    Excalibur ar1;
    Amulet ar2;
    Crystal ar3;

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public double getPrice() {
        return Price;
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

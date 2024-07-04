

public class Mythical_Creatures extends Warrior{
    static int price ;
    double Price;
    double attack ;
    double defence ;
    double health ;
    double speed ;
    String category;
    String name="Mythical_Creatures";
    public String ShowName(){return name;}
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
    public double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(double price) {
        Price = price;
    }

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
class Dragon extends Mythical_Creatures{
    String name = "Dragon";
    static int price = 120;
    double Price = 120;
    double attack = 12;
    double defence = 14;
    double health = 15;
    double speed = 8;
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
class Basilisk extends Mythical_Creatures{
    String name = "Basilisk";
    static int price = 165;
    double Price = 165;
    double attack = 15;
    double defence = 11;
    double health = 10;
    double speed = 12;
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
class Hydra extends Mythical_Creatures{
    static int price = 205;
    String name = "Hydra";
    double Price = 205;
    double attack = 12;
    double defence = 16;
    double health = 15;
    double speed = 11;
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
class Phoenix extends Mythical_Creatures{
    String name = "Phoenix";
    static int price = 275;
    double Price = 275;
    double attack = 17;
    double defence = 13;
    double health = 17;
    double speed = 19;
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
class Pegasus extends Mythical_Creatures {
    static int price = 340;
    String name = "Pegasus";
    double Price = 340;
    double attack = 14;
    double defence = 18;
    double health = 20;
    double speed = 20;
    String category = "Mystics";
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

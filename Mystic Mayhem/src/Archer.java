public class Archer extends Warrior{
    static int price ;
    double Price;
    double attack ;
    double defence ;
    double health ;
    double speed ;
    String category;
    String name="Archer";
    public String ShowName(){return name;}
    @Override
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getPrice() {
        return Price;
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

    class Shooter extends Archer {
        static int price = 80;
        double Price = 80;
        double attack = 11;
        double defence = 4;
        double health = 6;
        double speed = 9;
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

    class Ranger extends Archer {
        static int price = 115;
        double Price = 115;
        double attack = 14;
        double defence = 5;
        double health = 8;
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
        public void setPrice(double price) {
            Price = price;
        }

        @Override
        public double getPrice() {
            return Price;
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

    class Sunfire extends Archer {
        static int price = 160;
        double Price = 160;
        double attack = 15;
        double defence = 5;
        double health = 7;
        double speed = 14;
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

    class Zing extends Archer {
        static int price = 200;
        double Price = 200;
        double attack = 19;
        double defence = 9;
        double health = 11;
        double speed = 14;
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

    class Saggitarius extends Archer{
        static int price = 230;
        double Price = 230;
        double attack = 18;
        double defence = 7;
        double health = 12;
        double speed = 17;
        String category = "Mystics:";
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
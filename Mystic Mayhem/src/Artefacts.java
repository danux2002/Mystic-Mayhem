
public class Artefacts {
    static void set_artefacts(Profile obj,String a_name,String W_name)
    {
        if(a_name.equals("Excalibur"))
        {
            Excalibur.set_Excalibur(obj,a_name,W_name);
        }
        else if(a_name.equals("Amulet"))
        {
            Amulet.set_Amulet(obj,a_name,W_name);
        }
        else
        {
            Crystal.set_Crystal(obj,a_name,W_name);
        }

    }
}

class Excalibur extends  Artefacts{
    static int Price=150;
    static int Attack=+2;
    static int Defence=0;
    static int Health=0;
    static int Speed=0;
    static void set_Excalibur(Profile obj,String a_name,String W_name)
    {
        if(obj.Gold >= Excalibur.Price) {
            Excalibur a = new Excalibur();
            obj.Gold -= Excalibur.Price;
            if (W_name.equals("Archer")) {
                obj.Archer.setAr1(a);
                obj.Archer.setAttack(obj.Archer.getAttack()+Attack);
                obj.Archer.setDefence(obj.Archer.getDefence()+Defence);
                obj.Archer.setHealth(obj.Archer.getSpeed()+Health);
                obj.Archer.setSpeed(obj.Archer.getSpeed()+Speed);
                obj.Archer.setPrice(obj.Archer.getPrice()+Excalibur.Price*0.2);

            } else if (W_name.equals("Knight")) {
                obj.Knight.setAr1(a);
                obj.Knight.setAttack(obj.Knight.getAttack()+Attack);
                obj.Knight.setDefence(obj.Knight.getDefence()+Defence);
                obj.Knight.setHealth(obj.Knight.getHealth()+Health);
                obj.Knight.setSpeed(obj.Knight.getSpeed()+Speed);
                obj.Knight.setPrice(obj.Knight.getPrice()+Excalibur.Price*0.2);
            }
            else if (W_name.equals("Mage")) {
                obj.Mages.setAr1(a);
                obj.Mages.setAttack(obj.Mages.getAttack()+Attack);
                obj.Mages.setDefence(obj.Mages.getDefence()+Defence);
                obj.Mages.setHealth(obj.Mages.getHealth()+Health);
                obj.Mages.setSpeed(obj.Mages.getSpeed()+Speed);
                obj.Mages.setPrice(obj.Mages.getPrice()+Excalibur.Price*0.2);
            }
            else if (W_name.equals("Healer")) {
                obj.Healers.setAr1(a);
                obj.Healers.setAttack(obj.Healers.getAttack()+Attack);
                obj.Healers.setDefence(obj.Healers.getDefence()+Defence);
                obj.Healers.setHealth(obj.Healers.getHealth()+Health);
                obj.Healers.setSpeed(obj.Healers.getSpeed()+Speed);
                obj.Healers.setPrice(obj.Healers.getPrice()+Excalibur.Price*0.2);
            }
            else
            {
                obj.Mythical_Creatures.setAr1(a);
                obj.Mythical_Creatures.setAttack(obj.Mythical_Creatures.getAttack()+Attack);
                obj.Mythical_Creatures.setDefence(obj.Mythical_Creatures.getDefence()+Defence);
                obj.Mythical_Creatures.setHealth(obj.Mythical_Creatures.getHealth()+Health);
                obj.Mythical_Creatures.setSpeed(obj.Mythical_Creatures.getSpeed()+Speed);
                obj.Mythical_Creatures.setPrice(obj.Mythical_Creatures.getPrice()+Excalibur.Price*0.2);
            }
            System.out.println("Your Gold :"+ obj.Gold);
        }
        else
        {
            System.out.println("You can't Buy Excalibur");
        }

    }
}
class Amulet extends Artefacts{
    static int Price=200;
    static int Attack=+1;
    static int Defence=-1;
    static int Health=+1;
    static int Speed=+1;
    static void set_Amulet(Profile obj,String name,String W_name)
    {
        if(obj.Gold >= Amulet.Price) {
            Amulet a = new Amulet();
            obj.Gold -= Amulet.Price;
            if (W_name.equals("Archer")) {
                obj.Archer.setAr2(a);
                obj.Archer.setAttack(obj.Archer.getAttack()+Attack);
                obj.Archer.setDefence(obj.Archer.getDefence()+Defence);
                obj.Archer.setHealth(obj.Archer.getSpeed()+Health);
                obj.Archer.setSpeed(obj.Archer.getSpeed()+Speed);
                obj.Archer.setPrice(obj.Archer.getPrice()+Amulet.Price*0.2);
            } else if (W_name.equals("Knight")) {
                obj.Knight.setAr2(a);
                obj.Knight.setAttack(obj.Knight.getAttack()+Attack);
                obj.Knight.setDefence(obj.Knight.getDefence()+Defence);
                obj.Knight.setHealth(obj.Knight.getHealth()+Health);
                obj.Knight.setSpeed(obj.Knight.getSpeed()+Speed);
                obj.Knight.setPrice(obj.Knight.getPrice()+Amulet.Price*0.2);
            }
            else if (W_name.equals("Mage")) {
                obj.Mages.setAr2(a);
                obj.Mages.setAttack(obj.Mages.getAttack()+Attack);
                obj.Mages.setDefence(obj.Mages.getDefence()+Defence);
                obj.Mages.setHealth(obj.Mages.getHealth()+Health);
                obj.Mages.setSpeed(obj.Mages.getSpeed()+Speed);
                obj.Mages.setPrice(obj.Mages.getPrice()+Amulet.Price*0.2);
            }
            else if (W_name.equals("Healer")) {
                obj.Healers.setAr2(a);
                obj.Healers.setAttack(obj.Healers.getAttack()+Attack);
                obj.Healers.setDefence(obj.Healers.getDefence()+Defence);
                obj.Healers.setHealth(obj.Healers.getHealth()+Health);
                obj.Healers.setSpeed(obj.Healers.getSpeed()+Speed);
                obj.Healers.setPrice(obj.Healers.getPrice()+Amulet.Price*0.2);
            }
            else
            {
                obj.Mythical_Creatures.setAr2(a);
                obj.Mythical_Creatures.setAttack(obj.Mythical_Creatures.getAttack()+Attack);
                obj.Mythical_Creatures.setDefence(obj.Mythical_Creatures.getDefence()+Defence);
                obj.Mythical_Creatures.setHealth(obj.Mythical_Creatures.getHealth()+Health);
                obj.Mythical_Creatures.setSpeed(obj.Mythical_Creatures.getSpeed()+Speed);
                obj.Mythical_Creatures.setPrice(obj.Mythical_Creatures.getPrice()+Amulet.Price*0.2);
            }
            System.out.println("Your Gold :"+ obj.Gold);
        }
        else
        {
            System.out.println("You can't Buy Crystal");
        }

    }
}
class Crystal extends Artefacts{
    static int Price=210;
    static int Attack=+2;
    static  int Defence=+1;
    static int Health=-1;
    static int Speed=-1;
    static void set_Crystal(Profile obj,String name,String W_name)
    {
        if(obj.Gold >= Crystal.Price) {
            Crystal a = new Crystal();
            obj.Gold -= Crystal.Price;
            if (W_name.equals("Archer")) {
                obj.Archer.setAr3(a);
                obj.Archer.setAttack(obj.Archer.getAttack()+Attack);
                obj.Archer.setDefence(obj.Archer.getDefence()+Defence);
                obj.Archer.setHealth(obj.Archer.getSpeed()+Health);
                obj.Archer.setSpeed(obj.Archer.getSpeed()+Speed);
                obj.Archer.setPrice(obj.Archer.getPrice()+Crystal.Price*0.2);
            } else if (W_name.equals("Knight")) {
                obj.Knight.setAr3(a);
                obj.Knight.setAttack(obj.Knight.getAttack()+Attack);
                obj.Knight.setDefence(obj.Knight.getDefence()+Defence);
                obj.Knight.setHealth(obj.Knight.getHealth()+Health);
                obj.Knight.setSpeed(obj.Knight.getSpeed()+Speed);
                obj.Knight.setPrice(obj.Knight.getPrice()+Crystal.Price*0.2);
            }
            else if (W_name.equals("Mage")) {
                obj.Mages.setAr3(a);
                obj.Mages.setAttack(obj.Mages.getAttack()+Attack);
                obj.Mages.setDefence(obj.Mages.getDefence()+Defence);
                obj.Mages.setHealth(obj.Mages.getHealth()+Health);
                obj.Mages.setSpeed(obj.Mages.getSpeed()+Speed);
                obj.Mages.setPrice(obj.Mages.getPrice()+Crystal.Price*0.2);
            }
            else if (W_name.equals("Healer")) {
                obj.Healers.setAr3(a);
                obj.Healers.setAttack(obj.Healers.getAttack()+Attack);
                obj.Healers.setDefence(obj.Healers.getDefence()+Defence);
                obj.Healers.setHealth(obj.Healers.getHealth()+Health);
                obj.Healers.setSpeed(obj.Healers.getSpeed()+Speed);
                obj.Healers.setPrice(obj.Healers.getPrice()+Crystal.Price*0.2);
            }
            else
            {
                obj.Mythical_Creatures.setAr3(a);
                obj.Mythical_Creatures.setAttack(obj.Mythical_Creatures.getAttack()+Attack);
                obj.Mythical_Creatures.setDefence(obj.Mythical_Creatures.getDefence()+Defence);
                obj.Mythical_Creatures.setHealth(obj.Mythical_Creatures.getHealth()+Health);
                obj.Mythical_Creatures.setSpeed(obj.Mythical_Creatures.getSpeed()+Speed);
                obj.Mythical_Creatures.setPrice(obj.Mythical_Creatures.getPrice()+Crystal.Price*0.2);
            }
            System.out.println("Your Gold :"+ obj.Gold);
        }
        // to be continued
        else {
            System.out.println("You can't Buy Crystal ");
        }
    }
}


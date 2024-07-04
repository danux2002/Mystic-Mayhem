
public class Armour<T> {
   static void set_armour(Profile obj,String a_name,String W_name)
   {
       if(a_name.equals("Chainmail"))
       {
           Chainmail.set_chainmail(obj,a_name,W_name);
       }
       else if(a_name.equals("Regalia"))
       {
           Regalia.set_Regalia(obj,a_name,W_name);
       }
       else
       {
           Fleece.set_Fleece(obj, a_name,W_name);
       }

   }

}

class Chainmail<T> extends Armour{
    static int Price=70;
    static int Attack=0;
    static int Defence=+1;
    static int Health=0;
    static int Speed=-1;
    static void set_chainmail(Profile obj,String a_name,String W_name)
    {
        if(obj.Gold >= Chainmail.Price)
        {
            Chainmail a = new Chainmail();
            obj.Gold -= Chainmail.Price;
            if (W_name.equals("Archer")) {
                obj.Archer.setAm1(a);
                obj.Archer.setAttack(obj.Archer.getAttack()+Attack);
                obj.Archer.setDefence(obj.Archer.getDefence()+Defence);
                obj.Archer.setHealth(obj.Archer.getHealth()+Health);
                obj.Archer.setSpeed(obj.Archer.getSpeed()+Speed);
                obj.Archer.setPrice(obj.Archer.getPrice()+Chainmail.Price*0.2);
            } else if (W_name.equals("Knight")) {
                obj.Knight.setAm1(a);
                obj.Knight.setAttack(obj.Knight.getAttack()+Attack);
                obj.Knight.setDefence(obj.Knight.getDefence()+Defence);
                obj.Knight.setHealth(obj.Knight.getHealth()+Health);
                obj.Knight.setSpeed(obj.Knight.getSpeed()+Speed);
                obj.Knight.setPrice(obj.Knight.getPrice()+Chainmail.Price*0.2);
            }
            else if (W_name.equals("Mage")) {
                obj.Mages.setAm1(a);
                obj.Mages.setAttack(obj.Mages.getAttack()+Attack);
                obj.Mages.setDefence(obj.Mages.getDefence()+Defence);
                obj.Mages.setHealth(obj.Mages.getHealth()+Health);
                obj.Mages.setSpeed(obj.Mages.getSpeed()+Speed);
                obj.Mages.setPrice(obj.Mages.getPrice()+Chainmail.Price*0.2);
            }
            else if (W_name.equals("Healer")) {
                obj.Healers.setAm1(a);
                obj.Healers.setAttack(obj.Healers.getAttack()+Attack);
                obj.Healers.setDefence(obj.Healers.getDefence()+Defence);
                obj.Healers.setHealth(obj.Healers.getHealth()+Health);
                obj.Healers.setSpeed(obj.Healers.getSpeed()+Speed);
                obj.Healers.setPrice(obj.Healers.getPrice()+Chainmail.Price*0.2);
            }
            else
            {
                obj.Mythical_Creatures.setAm1(a);
                obj.Mythical_Creatures.setAttack(obj.Mythical_Creatures.getAttack()+Attack);
                obj.Mythical_Creatures.setDefence(obj.Mythical_Creatures.getDefence()+Defence);
                obj.Mythical_Creatures.setHealth(obj.Mythical_Creatures.getHealth()+Health);
                obj.Mythical_Creatures.setSpeed(obj.Mythical_Creatures.getSpeed()+Speed);
                obj.Mythical_Creatures.setPrice(obj.Mythical_Creatures.getPrice()+Chainmail.Price*0.2);
            }
            System.out.println("Your Gold :"+ obj.Gold);
        }
        else
        {
            System.out.println("You can't buy Chainmail");
        }
    }




}
class Regalia<T> extends Armour{
    static int Price=105;
    static int Attack=0;
    static int Defence=+1;
    static int Health=0;
    static int Speed=0;
    static void set_Regalia(Profile obj,String name,String W_name)
    {
        if(obj.Gold >= Regalia.Price)
        {
            Regalia a = new Regalia();
            obj.Gold -= Regalia.Price;
            if (W_name.equals("Archer")) {
                obj.Archer.setAm2(a);
                obj.Archer.setAttack(obj.Archer.getAttack()+Attack);
                obj.Archer.setDefence(obj.Archer.getDefence()+Defence);
                obj.Archer.setHealth(obj.Archer.getHealth()+Health);
                obj.Archer.setSpeed(obj.Archer.getSpeed()+Speed);
                obj.Archer.setPrice(obj.Archer.getPrice()+Regalia.Price*0.2);

            } else if (W_name.equals("Knight")) {
                obj.Knight.setAm2(a);
                obj.Knight.setAttack(obj.Knight.getAttack()+Attack);
                obj.Knight.setDefence(obj.Knight.getDefence()+Defence);
                obj.Knight.setHealth(obj.Knight.getHealth()+Health);
                obj.Knight.setSpeed(obj.Knight.getSpeed()+Speed);
                obj.Knight.setPrice(obj.Knight.getPrice()+Regalia.Price*0.2);
            }
            else if (W_name.equals("Mage")) {
                obj.Mages.setAm2(a);
                obj.Mages.setAttack(obj.Mages.getAttack()+Attack);
                obj.Mages.setDefence(obj.Mages.getDefence()+Defence);
                obj.Mages.setHealth(obj.Mages.getHealth()+Health);
                obj.Mages.setSpeed(obj.Mages.getSpeed()+Speed);
                obj.Mages.setPrice(obj.Mages.getPrice()+Regalia.Price*0.2);
            }
            else if (W_name.equals("Healer")) {
                obj.Healers.setAm2(a);
                obj.Healers.setAttack(obj.Healers.getAttack()+Attack);
                obj.Healers.setDefence(obj.Healers.getDefence()+Defence);
                obj.Healers.setHealth(obj.Healers.getHealth()+Health);
                obj.Healers.setSpeed(obj.Healers.getSpeed()+Speed);
                obj.Healers.setPrice(obj.Healers.getPrice()+Regalia.Price*0.2);
            }
            else
            {
                obj.Mythical_Creatures.setAm2(a);
                obj.Mythical_Creatures.setAttack(obj.Mythical_Creatures.getAttack()+Attack);
                obj.Mythical_Creatures.setDefence(obj.Mythical_Creatures.getDefence()+Defence);
                obj.Mythical_Creatures.setHealth(obj.Mythical_Creatures.getHealth()+Health);
                obj.Mythical_Creatures.setSpeed(obj.Mythical_Creatures.getSpeed()+Speed);
                obj.Mythical_Creatures.setPrice(obj.Mythical_Creatures.getPrice()+Regalia.Price*0.2);
            }
            System.out.println("Your Gold :"+ obj.Gold);

        }
        else
        {
            System.out.println("You can't buy Regalia");
        }
    }
}
class Fleece<T> extends Armour{
    static int Price=150;
    static int Attack=0;
    static int Defence=+2;
    static int Health=+1;
    static int Speed=-1;
    static void set_Fleece(Profile obj,String name,String W_name)
    {
        if(obj.Gold >= Fleece.Price)
        {
            Fleece a = new Fleece();
            obj.Gold -= Fleece.Price;
            if (W_name.equals("Archer")) {
                obj.Archer.setAm3(a);
                obj.Archer.setAttack(obj.Archer.getAttack()+Attack);
                obj.Archer.setDefence(obj.Archer.getDefence()+Defence);
                obj.Archer.setHealth(obj.Archer.getHealth()+Health);
                obj.Archer.setSpeed(obj.Archer.getSpeed()+Speed);
                obj.Archer.setPrice(obj.Archer.getPrice()+Fleece.Price*0.2);
            } else if (W_name.equals("Knight")) {
                obj.Knight.setAm3(a);
                obj.Knight.setAttack(obj.Knight.getAttack()+Attack);
                obj.Knight.setDefence(obj.Knight.getDefence()+Defence);
                obj.Knight.setHealth(obj.Knight.getHealth()+Health);
                obj.Knight.setSpeed(obj.Knight.getSpeed()+Speed);
                obj.Knight.setPrice(obj.Knight.getPrice()+Fleece.Price*0.2);
            }
            else if (W_name.equals("Mage")) {
                obj.Mages.setAm3(a);
                obj.Mages.setAttack(obj.Mages.getAttack()+Attack);
                obj.Mages.setDefence(obj.Mages.getDefence()+Defence);
                obj.Mages.setHealth(obj.Mages.getHealth()+Health);
                obj.Mages.setSpeed(obj.Mages.getSpeed()+Speed);
                obj.Mages.setPrice(obj.Mages.getPrice()+Fleece.Price*0.2);
            }
            else if (W_name.equals("Healer")) {
                obj.Healers.setAm3(a);
                obj.Healers.setAttack(obj.Healers.getAttack()+Attack);
                obj.Healers.setDefence(obj.Healers.getDefence()+Defence);
                obj.Healers.setHealth(obj.Healers.getHealth()+Health);
                obj.Healers.setSpeed(obj.Healers.getSpeed()+Speed);
                obj.Healers.setPrice(obj.Healers.getPrice()+Fleece.Price*0.2);
            }
            else
            {
                obj.Mythical_Creatures.setAm3(a);
                obj.Mythical_Creatures.setAttack(obj.Mythical_Creatures.getAttack()+Attack);
                obj.Mythical_Creatures.setDefence(obj.Mythical_Creatures.getDefence()+Defence);
                obj.Mythical_Creatures.setHealth(obj.Mythical_Creatures.getHealth()+Health);
                obj.Mythical_Creatures.setSpeed(obj.Mythical_Creatures.getSpeed()+Speed);
                obj.Mythical_Creatures.setPrice(obj.Mythical_Creatures.getPrice()+Fleece.Price*0.2);
            }
            System.out.println("Your Gold :"+ obj.Gold);
        }
        else
        {
            System.out.println("You can't buy Fleece");
        }

    }

}

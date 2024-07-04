

import java.util.*;

public class Battle {

        Warrior Find_the_Speedest_one( List < Warrior > l)
        {
            double max = l.get(0).getSpeed();
            Warrior a = l.get(0);
            int x = 0;
            ArrayList<Warrior> b = new ArrayList();
            for (Warrior i : l) {
                if (max < i.getSpeed()) {
                    max = i.getSpeed();
                    a = i;
                }

            }
            for (Warrior i : l) {
                if (i.getSpeed() == max) {
                    b.add(i);
                }
            }
            String[] names = {"Archer", "Knight", "Mythical Creature", "Mage", "Healer"};
            for (String i : names) {
                for (Warrior j : b) {
                    if (j.getName().equals(i)) {
                        a = j;
                        x++;
                        break;
                    }
                }
                if (x == 1) {
                    break;
                }
            }
            return a;
        }
        static Warrior Find_the_Lowest_Defence_one (List < Warrior > l)
        {
            double min = l.get(0).getDefence();
            Warrior a = l.get(0);
            int x = 0;
            ArrayList<Warrior> b = new ArrayList();
            for (Warrior i : l) {
                if (min > i.getDefence()) {
                    min = i.getDefence();
                    a = i;
                }

            }
            for (Warrior i : l) {
                if (i.getDefence() == min) {
                    b.add(i);
                }
            }
            String[] names = {"Healer", "Mythical Creature", "Archer", "Knight", "Mage"};
            for (String i : names) {
                for (Warrior j : b) {
                    if (j.getName().equals(i)) {
                        a = j;
                        x++;
                        break;
                    }
                }
                if (x == 1) {
                    break;
                }
            }
            return a;
        }
         static Warrior Find_Lowest_health (List < Warrior > l)
        {
            double min = l.get(0).getHealth();
            int index = 0;
            Warrior a;
            ArrayList<Warrior> b = new ArrayList();
            for (Warrior i : l) {
                if (min > i.getHealth()) {
                    min = i.getHealth();
                    index = l.indexOf(i);
                }

            }
            return l.get(index);
        }
    static void Attack(Warrior a, List<Warrior> l, List<Warrior> L) {

        Warrior y = Find_the_Lowest_Defence_one(l);
        boolean x = a.getName().equals("Healer");
        if (x == false)
        {
            System.out.println(a.ShowName()+" attacks "+y.ShowName());
            System.out.println();
            y.setHealth(y.getHealth() - (0.5 * a.getAttack() - 0.1 * y.getDefence()));
            if(y.getHealth()<=0)
            {
                System.out.println("Defender's new Health " +0);
                System.out.println();
                System.out.println(y.ShowName()+" Died.");
                System.out.println();
                l.remove(y);
            }
            else{
                System.out.printf("Defender's new Health %.2f " ,y.getHealth());
                System.out.println();
            }

        }
        else
        {
            List<Warrior> m = new ArrayList<>();
            for(Warrior i:L)
            {
                if(i.getName().equals("Healer"))
                {
                    continue;
                }
                else
                {
                    m.add(i);
                }
            }
            Warrior z = Find_Lowest_health(m);
            z.setHealth(z.getHealth() + 0.1 * a.getAttack());
            System.out.printf(z.getName()+"'s new Health %.2f " ,z.getHealth());
            System.out.println();
        }

    }
    void Fight(Profile obj1, Profile obj2) {
        for(int i =1;i<21;i++){
            if(i%2==1){
                System.out.printf(".......................ROUND %d......................",i);
                System.out.println();
                System.out.println("Attacker "+obj1.getname());
                System.out.println();
                Warrior a = Find_the_Speedest_one(obj1.Warrior_list);
                Attack(a,obj2.Warrior_list,obj1.Warrior_list);
                try {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    System.out.println();
                }
            }
            else{
                System.out.printf(".......................ROUND %d......................",i);
                System.out.println();
                System.out.println("Attacker "+obj2.getname());
                System.out.println();
                Warrior b= Find_the_Lowest_Defence_one(obj2.Warrior_list);
                Attack(b,obj1.Warrior_list,obj2.Warrior_list);
                try {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    System.out.println();
                }
            }
        }
        if(obj1.Warrior_list.isEmpty()){
            System.out.println("-----------------------------------------");
            System.out.println(obj2.getname()+" WON !");
            System.out.println();
            obj2.Gold += obj1.Gold*(0.1);
            obj1.Gold -= obj1.Gold*(0.1);
            obj2.XP += 1;
            System.out.println("Attackers Xp - "+obj2.XP+" Attacker Gold - "+obj2.Gold);
            System.out.println();
            System.out.println("Defenders Xp - "+obj1.XP+" Defenders Gold - "+obj1.Gold);
            System.out.println();
        }
        else if(obj2.Warrior_list.isEmpty()){
            System.out.println("-----------------------------------------");
            System.out.println("   "+obj1.getname()+" WON !     ");
            obj1.Gold += obj2.Gold*(0.1);
            obj2.Gold -= obj2.Gold*(0.1);
            obj1.XP += 1;
            System.out.println("Attackers Xp - "+obj1.XP+" Attacker Gold - "+obj1.Gold);
            System.out.println();
            System.out.println("Defenders Xp - "+obj2.XP+" Defenders Gold - "+obj2.Gold);
            System.out.println();
        }
        else{
            System.out.println("-----------------------------------------");
            System.out.println("                  DRAW !                 ");
        }

    }
}

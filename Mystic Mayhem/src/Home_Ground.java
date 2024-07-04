

import java.util.*;

public class Home_Ground
{
    static List<String>Highlanders= Arrays.asList("Shooter","Ranger","Cavalier","Zoro","Enchanter","Conjurer","Medic");
    static List<String>Marshlanders= Arrays.asList("Squire", "Swiftblade", "Warlock", "Alchemist", "Basilisk", "Hydra");
    static List<String>Sunchildren = Arrays.asList("Sunfire", "Zing", "Templar", "Soother", "Lightbringer", "Dragon", "Phoenix");
    static List<String>Mystic = Arrays.asList( "Saggitarius", "Illusionist", "Eldritch", "Saint", "Pegasus");

     static void Update_Player_Performance(Profile obj,List<Warrior>l,String play_ground)
     {
         if(play_ground.equals("Hillcrest"))
         {
             Hillcrest.Update_Hillcrest(obj,l);
         }
         if(play_ground.equals("Marshland"))
         {
             Marshland.Update_Marshland(obj,l);
         }
         if(play_ground.equals("Marshland"))
         {
             Desert.Update_Desert(obj,l);
         }
         if(play_ground.equals("Marshland"))
         {
             Arcane.Update_Arcane(obj,l);
         }
     }

}
class  Hillcrest extends Home_Ground
{
    static void Update_Hillcrest(Profile obj,List<Warrior>l)
    {
        for(Warrior i : l)
        {
            if(Highlanders.contains(i.getCategory()))
            {
                i.setAttack(i.getAttack()+1);
            }
            if(Marshlanders.contains(i.getCategory()))
            {
                i.setSpeed(i.getSpeed()-1);
            }
            if(Sunchildren.contains(i.getCategory()))
            {
                i.setSpeed(i.getSpeed()-1);
            }
        }
    }
}
class Marshland extends Home_Ground
{
    static void Update_Marshland(Profile obj,List<Warrior>l)
    {
        for(Warrior i : l)
        {
            if(Marshlanders.contains(i.getCategory()))
            {
                i.setDefence(i.getDefence()+2);
            }
            if(Sunchildren.contains(i.getCategory()))
            {
                i.setAttack(i.getAttack()-1);
            }
            if(Mystic.contains(i.getCategory()))
            {
                i.setSpeed(i.getSpeed()-1);
            }
        }
    }

}
class Desert extends Home_Ground
{
    static void Update_Desert(Profile obj,List<Warrior>l)
    {
        for(Warrior i : l)
        {
            if(Marshlanders.contains(i.getCategory()))
            {
                i.setHealth(i.getHealth()-1);
            }
            if(Sunchildren.contains(i.getCategory()))
            {
                i.setAttack(i.getAttack()+1);
            }
        }
    }
}
class Arcane extends Home_Ground
{
    static void Update_Arcane(Profile obj,List<Warrior>l)
    {
        for(Warrior i : l)
        {
            if(Mystic.contains(i.getCategory()))
            {
                i.setAttack(i.getAttack()+2);
            }
            if(Highlanders.contains(i.getCategory()))
            {
                i.setSpeed(i.getSpeed()-1);
                i.setDefence(i.getDefence()-1);
            }
            if(Marshlanders.contains(i.getCategory()))
            {
                i.setSpeed(i.getSpeed()-1);
                i.setDefence(i.getDefence()-1);
            }
            if(Mystic.contains(i.getCategory()))
            {
                i.setHealth(i.getHealth()*1.1);
            }

        }
    }
}

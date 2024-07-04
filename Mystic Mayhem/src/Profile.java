
import java.sql.SQLOutput;
import java.util.*;


public class Profile{
    int XP=0;
    private String name;
    private int User_id;
    private String User_name;
    int Gold = 500;
    static int a= 100000;
    String Homeground;
    // Warriors
    Archer Archer;
    Knight Knight;
    Mages Mages;
    Healers Healers;
    Mythical_Creatures Mythical_Creatures ;
    //List<Warrior> Warrior_list =Arrays.asList(Archer,Knight,Mages,Healers,Mythical_Creatures);
    List<Warrior> Warrior_list;
    Scanner x;
    void set_list()
    {
        Warrior_list = new ArrayList<>();
        Warrior_list.add(this.Archer);
        Warrior_list.add(this.Knight);
        Warrior_list.add(this.Mages);
        Warrior_list.add(this.Healers);
        Warrior_list.add(this.Mythical_Creatures);
    }
    void setname(String name){
        this.name=name;
    }
    String  getname(){
        return name;
    }
    void Select_Archer(String name)
    {
        x = new Scanner(System.in);
        if(name.equals("Shooter") )
        {
            if(this.Gold >= Shooter.price)
            {
                Archer = new Shooter();
                this.Gold-= Shooter.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Archer(name);
            }

        }
        else if(name.equals("Ranger"))
        {
            if(this.Gold >= Ranger.price) {
                Archer = new Ranger();
                this.Gold-= Ranger.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Archer(name);
            }

        }
        else if(name.equals("Sunfire"))
        {
            if(this.Gold >= Sunfire.price) {
                Archer = new Sunfire();
                this.Gold-= Sunfire.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Archer(name);
            }
        }
        else if(name.equals("Zing"))
        {
            if(this.Gold >=Zing.price) {
                Archer = new Zing();
                this.Gold-= Zing.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Archer(name);
            }
        }
        else
        {
            if(this.Gold >= Saggitarius.price) {
                Archer = new Saggitarius();
                this.Gold-= Saggitarius.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Archer(name);
            }
        }

    }
    void Select_Knight(String name)
    {
        x = new Scanner(System.in);
        if(name.equals("Squire") )
        {
            if(this.Gold >= Squire.price) {
                Knight = new Squire();
                this.Gold -= Squire.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Knight(name);
            }
        }
        else if(name.equals("Cavalier"))
        {
            if(this.Gold >= Cavalier.price) {
                Knight = new Cavalier();
                this.Gold -= Cavalier.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Knight(name);
            }

        }
        else if(name.equals("Templar"))
        {
            if(this.Gold >= Templar.price) {
                Knight = new Templar();
                this.Gold -= Templar.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Knight(name);
            }
        }
        else if(name.equals("Zoro"))
        {
            if(this.Gold >= Zoro.price) {
                Knight = new Zoro();
                this.Gold -= Zoro.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Knight(name);
            }
        }
        else
        {
            if(this.Gold >= Swiftblade.price) {
                Knight = new Swiftblade();
                this.Gold -= Swiftblade.price;
            }
            else{
                System.out.println("You can't buy this Archer and Enter a new name");
                name =x.nextLine();
                Select_Knight(name);
            }
        }

    }
    void Select_Mages(String name)
    {
        x = new Scanner(System.in);
        if(name.equals("Warlock") )
        {
            if(this.Gold >=  Warlock.price)
            {
                Mages = new  Warlock();
                this.Gold-= Warlock.price;
            }
            else{
                System.out.println("You can't buy this Mages and Enter a new name");
                name =x.nextLine();
                Select_Mages(name);
            }

        }
        else if(name.equals("Illusionist"))
        {
            if(this.Gold >= Illusionist.price) {
                Mages= new Illusionist();
                this.Gold-= Illusionist.price;
            }
            else{
                System.out.println("You can't buy this Mages and Enter a new name");
                name =x.nextLine();
                Select_Mages(name);
            }

        }
        else if(name.equals("Enchanter"))
        {
            if(this.Gold >= Enchanter.price) {
                Mages = new Enchanter();
                this.Gold-= Enchanter.price;
            }
            else{
                System.out.println("You can't buy this Mages and Enter a new name");
                name =x.nextLine();
                Select_Mages(name);
            }
        }
        else if(name.equals("Conjurer"))
        {
            if(this.Gold >=Conjurer.price) {
                Mages = new Conjurer();
                this.Gold-= Conjurer.price;
            }
            else{
                System.out.println("You can't buy this Mages and Enter a new name");
                name =x.nextLine();
                Select_Mages(name);
            }
        }
        else
        {
            if(this.Gold >= Eldritch.price) {
                Mages = new Eldritch();
                this.Gold-= Eldritch.price;
            }
            else{
                System.out.println("You can't buy this Mages and Enter a new name");
                name =x.nextLine();
                Select_Mages(name);
            }
        }

    }
    void Select_Healers(String name)
    {
        x = new Scanner(System.in);
        if(name.equals("Soother") )
        {
            if(this.Gold >=   Soother.price)
            {
                Healers= new   Soother();
                this.Gold-=  Soother.price;

            }
            else{
                System.out.println("You can't buy this Healers and Enter a new name");
                name =x.nextLine();
                Select_Healers(name);
            }

        }
        else if(name.equals("Medic"))
        {
            if(this.Gold >= Medic.price) {
                Healers= new Medic();
                this.Gold-= Medic.price;
            }
            else{
                System.out.println("You can't buy this Healers and Enter a new name");
                name =x.nextLine();
                Select_Healers(name);
            }

        }
        else if(name.equals("Alchemist"))
        {
            if(this.Gold >= Alchemist.price) {
                Healers = new Alchemist();
                this.Gold-= Alchemist.price;
            }
            else{
                System.out.println("You can't buy this Healers and Enter a new name");
                name =x.nextLine();
                Select_Healers(name);
            }
        }
        else if(name.equals("Saint"))
        {
            if(this.Gold >=Saint.price) {
                Healers = new Saint();
                this.Gold-= Saint.price;
            }
            else{
                System.out.println("You can't buy this Healers and Enter a new name");
                name =x.nextLine();
                Select_Healers(name);
            }
        }
        else
        {
            if(this.Gold >= Lightbringer.price) {
                Healers = new Lightbringer();
                this.Gold-= Lightbringer.price;
            }
            else{
                System.out.println("You can't buy this Healers and Enter a new name");
                name =x.nextLine();
                Select_Healers(name);
            }
        }

    }
    void Select_Mythical_Creatures(String name)
    {
        x = new Scanner(System.in);
        if(name.equals("Dragon") )
        {
            if(this.Gold >= Dragon.price)
            {
                Mythical_Creatures= new Dragon();
                this.Gold-= Dragon.price;
            }
            else{
                System.out.println("You can't buy this Mythical_Creatures and Enter a new name");
                name =x.nextLine();
                Select_Mythical_Creatures(name);
            }

        }
        else if(name.equals("Basilisk"))
        {
            if(this.Gold >= Basilisk.price) {
                Mythical_Creatures= new Basilisk();
                this.Gold-= Basilisk.price;
            }
            else{
                System.out.println("You can't buy this Mythical_Creatures and Enter a new name");
                name =x.nextLine();
                Select_Mythical_Creatures(name);
            }

        }
        else if(name.equals("Hydra"))
        {
            if(this.Gold >= Alchemist.price) {
                Mythical_Creatures = new Hydra();
                this.Gold-= Hydra.price;
            }
            else{
                System.out.println("You can't buy this Mythical_Creatures and Enter a new name");
                name =x.nextLine();
                Select_Mythical_Creatures(name);
            }
        }
        else if(name.equals("Phoenix"))
        {
            if(this.Gold >=Saint.price) {
                Mythical_Creatures = new Phoenix();
                this.Gold-= Phoenix.price;
            }
            else{
                System.out.println("You can't buy this Mythical_Creatures and Enter a new name");
                name =x.nextLine();
                Select_Mythical_Creatures(name);
            }
        }
        else
        {
            if(this.Gold >= Pegasus.price) {
                Mythical_Creatures = new Pegasus();
                this.Gold-= Pegasus.price;
            }
            else{
                System.out.println("You can't buy this Mythical_Creatures and Enter a new name");
                name =x.nextLine();
                Select_Mythical_Creatures(name);
            }
        }

    }

    void Set_Warriors()
    {
        x = new Scanner(System.in);
        System.out.println("You should make your own army");
        System.out.println();
        System.out.println("Your Current Gold : "+this.Gold);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }


        System.out.println("Archers               Knights                Mages               Healers               Mythical Creatures");
        System.out.println();
        System.out.println("Name: Shooter         Name: Squire           Name: Warlock       Name: Soother         Name: Dragon");
        System.out.println("Price: 80 gc          Price: 85 gc           Price: 100 gc       Price: 95 gc          Price: 120 gc");
        System.out.println("Attack: 11            Attack: 8              Attack: 12          Attack: 10            Attack: 12");
        System.out.println("Defence: 4            Defence: 9             Defence: 7          Defence: 8            Defence: 14");
        System.out.println("Health: 6             Health: 7              Health: 10          Health: 9             Health: 15");
        System.out.println("Speed: 9              Speed: 8               Speed: 12           Speed: 6              Speed: 8");
        System.out.println();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Name: Ranger          Name: Cavalier         Name: Illusionist   Name: Medic           Name: Basilisk");
        System.out.println("Price: 115 gc         Price: 110 gc          Price: 120 gc       Price: 120 gc         Price: 165 gc");
        System.out.println("Attack: 14            Attack: 10             Attack: 13          Attack: 12            Attack: 15");
        System.out.println("Defence: 5            Defence: 12            Defence: 7          Defence: 9            Defence: 11");
        System.out.println("Health: 8             Health: 7              Health: 12          Health: 10            Health: 10");
        System.out.println("Speed: 10             Speed: 9               Speed: 14           Speed: 7              Speed: 12");
        System.out.println();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Name: Sunfire         Name: Templar          Name: Enchanter     Name: Alchemist       Name: Hydra");
        System.out.println("Price: 160 gc         Price: 155 gc          Price: 160 gc       Price: 150 gc         Price: 205 gc");
        System.out.println("Attack: 15            Attack: 14             Attack: 16          Attack: 13            Attack: 12");
        System.out.println("Defence: 5            Defence: 16            Defence: 10         Defence: 13           Defence: 16");
        System.out.println("Health: 8             Health: 12             Health: 13          Health: 13            Health: 15");
        System.out.println("Speed: 14             Speed: 12              Speed: 16           Speed: 13             Speed: 11");
        System.out.println();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Name: Zing            Name: Zoro             Name: Conjurer      Name: Saint           Name: Phoenix");
        System.out.println("Price: 200 gc         Price: 180 gc          Price: 195 gc       Price: 200 gc         Price: 275 gc");
        System.out.println("Attack: 16            Attack: 17             Attack: 18          Attack: 16            Attack: 17");
        System.out.println("Defence: 9            Defence: 16            Defence: 15         Defence: 14           Defence: 13");
        System.out.println("Health: 11            Health: 13             Health: 14          Health: 17            Health: 17");
        System.out.println("Speed: 14             Speed: 14              Speed: 12           Speed: 19             Speed: 19");
        System.out.println();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Name: Saggitarius     Name: Swiftblade       Name: Eldritch      Name: Lightbringer    Name: Pegasus");
        System.out.println("Price: 230 gc         Price: 250 gc          Price: 270 gc       Price: 260 gc         Price: 340 gc");
        System.out.println("Attack: 18            Attack: 18             Attack: 19          Attack: 17            Attack: 14");
        System.out.println("Defence: 7            Defence: 20            Defence: 17         Defence: 15           Defence: 18");
        System.out.println("Health: 12            Health: 17             Health: 18          Health: 19            Health: 20");
        System.out.println("Speed: 17             Speed: 13              Speed: 14           Speed: 12             Speed: 20");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }

        System.out.println("Lets Buy a Archer");
        System.out.println();
        System.out.println("Enter your archer's name what to buy  ");
        System.out.println();
        String name = x.next();
        this.Select_Archer(name);
        System.out.println("Your Current Gold : "+this.Gold);
        System.out.println();
        System.out.println("Lets Buy a Knight");
        System.out.println();
        System.out.println("Enter your Knight's name what to buy  ");
        System.out.println();
        name = x.next();
        this.Select_Knight(name);
        System.out.println("Your Current Gold : "+this.Gold);
        System.out.println();
        System.out.println("Lets Buy a Mage");
        System.out.println();
        System.out.println("Enter your Mage's name what to buy  ");
        System.out.println();
        name = x.next();
        this.Select_Mages(name);
        System.out.println("Your Current Gold : "+this.Gold);
        System.out.println();
        System.out.println("Lets Buy a Healer");
        System.out.println();
        System.out.println("Enter your Healer's name what to buy  ");
        System.out.println();
        name = x.next();
        this.Select_Healers(name);
        System.out.println("Your Current Gold : "+this.Gold);
        System.out.println();
        System.out.println("Lets Buy a Mythical Creature");
        System.out.println();
        System.out.println("Enter your Mythical Creature's name what to buy  ");
        System.out.println();
        name = x.next();
        this.Select_Mythical_Creatures(name);
    }
    void Buy_Equip(Profile obj) {
        x = new Scanner(System.in);
        String ans;
        System.out.println("You Can buy equiments for your army");
        System.out.println();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }

        System.out.println("Armour               Artefacts");
        System.out.println();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Chainmail            Excalibur");
        System.out.println("Price:70gc           Price:150gc");
        System.out.println("Attack:no change     Attack:+2");
        System.out.println("Defence:+1           Defence:no change");
        System.out.println("Health:no change     Health:no changeo");
        System.out.println("Speed:-1             Speed:no change");
        System.out.println();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Regalia              Amulet");
        System.out.println("Price:150gc          Price:200gc");
        System.out.println("Attack:no change     Attack:+1");
        System.out.println("Defence:+1           Defence:-1");
        System.out.println("Health:no change     Health:+1");
        System.out.println("Speed:no change      Speed:+1");
        System.out.println();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Fleece               Crystal");
        System.out.println("Price:150gc          Price:210gc");
        System.out.println("Attack:no change     Attack:+2");
        System.out.println("Defence:+2           Defence:+1");
        System.out.println("Health:+1            Health:-1");
        System.out.println("Speed:-1             Speed:-1");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }

        System.out.println("If You want to buy Equipments for Your Army?");
        System.out.println();
        System.out.println("Your Gold : "+this.Gold);
        ans = x.next();
        if(ans.equals("yes")) {
            System.out.println("If You want buy Armour for Your Archers?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the armour type");
                System.out.println();
                String arm = x.next();
                Armour.set_armour(obj, arm, "Archer");


            }
            System.out.println("If You want buy Artefact for Your Archers?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the artefact  type");
                System.out.println();
                String arm = x.next();
                Artefacts.set_artefacts(obj, arm, "Archer");
                ;

            }
            System.out.println("If You want buy Armour for Your Knight?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the armour type");
                System.out.println();
                String arm = x.next();
                Armour.set_armour(obj, arm, "Knight");


            }
            System.out.println("If You want buy Artefact for Your Knight?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the artefact  type");
                System.out.println();
                String arm = x.next();
                Artefacts.set_artefacts(obj, arm, "Knight");


            }
            System.out.println("If You want buy Armour for Your Mages?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the armour type");
                System.out.println();
                System.out.println();
                String arm = x.next();
                Armour.set_armour(obj, arm, "Mage");


            }
            System.out.println("If You want buy Artefact for Your  Mages?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the artefact  type");
                System.out.println();
                String arm = x.next();
                Artefacts.set_artefacts(obj, arm, "Mage");

            }
            System.out.println("If You want buy Armour for Your Healers?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the armour type");
                System.out.println();
                String arm = x.next();
                Armour.set_armour(obj, arm, "Healers");

            }
            System.out.println("If You want buy Artefact for Your Healers?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the artefact  type");
                System.out.println();
                String arm = x.next();
                Artefacts.set_artefacts(obj, arm, "Healers");

            }
            System.out.println("If You want buy Armour for Your Mythical_Creatures?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the armour type");
                System.out.println();
                String arm = x.next();
                Armour.set_armour(obj, arm, "Mythical_Creatures");

            }
            System.out.println("If You want buy Artefact for Your Mythical_Creatures?");
            System.out.println();
            ans = x.next();
            if (ans.equals("yes")) {
                System.out.println("What is the artefact  type");
                System.out.println();
                String arm = x.next();
                Artefacts.set_artefacts(obj, arm, "Mythical_Creatures");

            }
        }
        else return;
    }


    void setUser_name(String User_name){

        ArrayList<String> Username_List = new ArrayList<String>();
        for(int i=0;i<Username_List.size();i++){
            if (User_name==Username_List.get(i)){
                System.out.println("This User name Already exists");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter New User name");
                User_name= scanner.nextLine();
                setUser_name(User_name);
            }
        }

        Username_List.add(User_name);

    }

    String Get_Username(String User_name){
        return User_name;
    }

    void setUser_ID(){
        this.User_id = a;
        a++;
    }
    void Sell_Characters(Profile obj){
        System.out.println("Enter the warriar , you want to sell Archer,Knight,Mage,Healer,Mythical Creature]");
        String name = x.nextLine();
        if(name.equals("Archer")){
            obj.Archer = null;
            obj.Gold += obj.Archer.getPrice()*0.9;
        }
        else if(name.equals("Knight")){
            obj.Knight = null;
            obj.Gold += obj.Knight.getPrice()*0.9;
        }
        else if(name.equals("Mage")){
            obj.Mages= null;
            obj.Gold += obj.Mages.getPrice()*0.9;
        }
        else if(name.equals("Healer")){
            obj.Healers = null;
            obj.Gold += obj.Healers.getPrice()*0.9;
        }
        else {
            obj.Mythical_Creatures= null;
            obj.Gold += obj.Mythical_Creatures.getPrice()*0.9;
        }


    }

    public static void main(String[] args) {
        // Opponent o
        Profile Opponent = new Profile();
        Opponent.name="GeraltofRivia";
        Opponent.User_name = "whitewolf";
        Opponent.XP = 32;
        Opponent.Gold =215;
        Opponent.Homeground ="Marshland";
        Opponent.Archer = new Ranger();
        Chainmail Am1 = new Chainmail();
        Opponent.Archer.setAm1(Am1);
        Opponent.Archer.setAttack(Opponent.Archer.getAttack()+Chainmail.Attack);
        Opponent.Archer.setHealth(Opponent.Archer.getHealth()+Chainmail.Health);
        Opponent.Archer.setAttack(Opponent.Archer.getSpeed()+Chainmail.Speed);
        Opponent.Archer.setAttack(Opponent.Archer.getDefence()+Chainmail.Defence);
        Opponent.Knight = new Squire();
        Opponent.Mages = new Warlock();
        Opponent.Healers = new Medic();
        Amulet Ar1 = new Amulet();
        Opponent.Healers.setAr2(Ar1);
        Opponent.Healers.setAttack(Opponent.Healers.getAttack()+Amulet.Attack);
        Opponent.Healers.setHealth(Opponent.Healers.getHealth()+Amulet.Health);
        Opponent.Healers.setAttack(Opponent.Healers.getSpeed()+Amulet.Speed);
        Opponent.Healers.setAttack(Opponent.Healers.getDefence()+Amulet.Defence);
        Opponent.Mythical_Creatures = new Dragon();
        Opponent.set_list();

        //Opponent 1

        Profile Opponent1 = new Profile();
        Opponent1.name="Yasith";
        Opponent1.User_name = "ImalkaRoz";
        Opponent1.XP = 30;
        Opponent1.Gold =200;
        Opponent1.Homeground =" Desert";
        Opponent1.Knight = new  Templar();
        Fleece Am2 = new Fleece();
        Opponent1.Knight.setAm3(Am2);
        Opponent1.Knight.setAttack(Opponent1.Knight.getAttack()+Fleece.Attack);
        Opponent1.Knight.setHealth(Opponent1.Knight.getHealth()+Fleece.Health);
        Opponent1.Knight.setAttack(Opponent1.Knight.getSpeed()+Fleece.Speed);
        Opponent1.Knight.setAttack(Opponent1.Knight.getDefence()+Fleece.Defence);
        Opponent1.Archer = new  Zing();
        Opponent1.Mages = new Illusionist();
        Opponent1.Healers = new Medic();
        Crystal Ar2 = new Crystal();
        Opponent1.Healers.setAr3(Ar2);
        Opponent1.Healers.setAttack(Opponent1.Healers.getAttack()+Crystal.Attack);
        Opponent1.Healers.setHealth(Opponent1.Healers.getHealth()+Crystal.Health);
        Opponent1.Healers.setAttack(Opponent1.Healers.getSpeed()+Crystal.Speed);
        Opponent1.Healers.setAttack(Opponent1.Healers.getDefence()+Crystal.Defence);
        Opponent1.Mythical_Creatures = new Dragon();
        Opponent1.set_list();

        //Opponent 2
        Profile Opponent2 = new Profile();
        Opponent2.name="Nisal";
        Opponent2.User_name = "Nyx";
        Opponent2.XP = 50;
        Opponent2.Gold =100;
        Opponent2.Homeground ="Arcane";
        Opponent2.Mages = new Enchanter();
        Regalia Am = new Regalia();
        Opponent2.Mages.setAm3(Am2);
        Opponent2.Mages.setAttack(Opponent1.Mages.getAttack()+Regalia.Attack);
        Opponent2.Mages.setHealth(Opponent1.Mages.getHealth()+Regalia.Health);
        Opponent2.Mages.setAttack(Opponent1.Mages.getSpeed()+Regalia.Speed);
        Opponent2.Mages.setAttack(Opponent1.Mages.getDefence()+Regalia.Defence);
        Opponent2.Archer = new Sunfire();
        Opponent2.Knight = new Swiftblade();
        Opponent2.Healers = new Lightbringer();
        Crystal Ar5 = new Crystal();
        Opponent2.Healers.setAr3(Ar5);
        Opponent2.Healers.setAttack(Opponent1.Healers.getAttack()+Crystal.Attack);
        Opponent2.Healers.setHealth(Opponent1.Healers.getHealth()+Crystal.Health);
        Opponent2.Healers.setAttack(Opponent1.Healers.getSpeed()+Crystal.Speed);
        Opponent2.Healers.setAttack(Opponent1.Healers.getDefence()+Crystal.Defence);
        Opponent2.Mythical_Creatures = new Dragon();
        Opponent2.set_list();


        System.out.println(".....................................................");
        System.out.println(".                     ---------                     .");
        System.out.println(".             --------------------------            .");
        System.out.println(".             *Welcome to Mystic Mayhame !!*        .");
        System.out.println(".             --------------------------            .");
        System.out.println(".                     ---------                     .");
        System.out.println(".....................................................");
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }


        System.out.println("Enter Your Player name for Mystic Mayhem");
        System.out.println();
        Scanner y = new Scanner(System.in);
        String  name1 = y.nextLine();
        System.out.println("You can Change your name in any time");
        System.out.println();
        System.out.println("You have to enter an user name for this, but once you press Enter you can not change it");
        System.out.println();
        String username1 = y.nextLine();
        System.out.println("You have to select Home_Ground for you ");
        System.out.println();
        System.out.println("Select 1 from  Hillcrest, Marshland, Desert, and Arcane");
        System.out.println();
        String homeground1 = y.nextLine();


        Profile pavan1 = new Profile();
        pavan1.name=name1;
        pavan1.User_name = username1;
        pavan1.Homeground =homeground1;
        pavan1.setUser_ID();


        System.out.println("Player Profile");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Name-"+name1);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Username-"+username1);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("UserID-"+pavan1.User_id);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("HomeGroud-"+homeground1);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("Gold-"+500);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("XP-0");
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        pavan1.Set_Warriors();
        pavan1.Buy_Equip(pavan1);
        pavan1.set_list();


        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("     Let's Play a Battle     ");
        System.out.println("       Are You Ready!!       ");
        String inp = y.nextLine();
        if(inp.equals("yes")) {

                System.out.println("   Choose Your Opponent   ");
                System.out.println();
                System.out.println("   Available Opponents Are......!!!   ");
                System.out.println();
                System.out.println(" *) GeraltofRivia");
                System.out.println(" *) Yasith");
                System.out.println(" *) Nisal");
                inp = y.next();
                if (inp.equals("GeraltofRivia")) {
                    System.out.println("Name :-" + Opponent.name);
                    System.out.println();
                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println();
                    }
                    System.out.println("       " + Opponent.name + "'s Army     ");
                    ;
                    for (Warrior i : Opponent.Warrior_list) {
                        System.out.println(i.ShowName());
                        try {
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e)
                        {
                            System.out.println();
                        }
                    }
                    System.out.println("XP :-" + Opponent.XP);
                    Home_Ground.Update_Player_Performance(Opponent,Opponent.Warrior_list,"Marshland");
                    Home_Ground.Update_Player_Performance(pavan1,pavan1.Warrior_list,"Marshland");
                    Battle b1 = new Battle();
                    b1.Fight(pavan1, Opponent);

                } else if (inp.equals("Yasith")) {
                    System.out.println("Name :-" + Opponent1.name);
                    System.out.println();
                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println();
                    }
                    System.out.println("       " + Opponent1.name + "'s Army     ");
                    ;
                    for (Warrior i : Opponent1.Warrior_list) {
                        System.out.println(i.ShowName());
                        try {
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e)
                        {
                            System.out.println();
                        }
                    }
                    System.out.println("XP :-" + Opponent1.XP);
                    Home_Ground.Update_Player_Performance(Opponent1,Opponent1.Warrior_list,"Desert");
                    Home_Ground.Update_Player_Performance(pavan1,pavan1.Warrior_list,"Desert");
                    Battle b1 = new Battle();
                    b1.Fight(pavan1, Opponent1);
                } else if(inp.equals("Nisal")){
                    System.out.println("Name :-" + Opponent2.name);
                    System.out.println();
                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println();
                    }
                    System.out.println("       " + Opponent2.name + "'s Army     ");
                    ;
                    for (Warrior i : Opponent2.Warrior_list) {
                        System.out.println(i.ShowName());
                        try {
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e)
                        {
                            System.out.println();
                        }
                    }
                    System.out.println("XP :-" + Opponent2.XP);
                    Home_Ground.Update_Player_Performance(Opponent2,Opponent2.Warrior_list,"Arcane");
                    Home_Ground.Update_Player_Performance(pavan1,pavan1.Warrior_list,"Arcane");
                    Battle b1 = new Battle();
                    b1.Fight(pavan1, Opponent2);
                }


        }
        else{
            System.out.println("Do you want to sell your Warriors (yes/no)");
            inp = y.nextLine();
            if(inp.equals("yes")){
                pavan1.Sell_Characters(pavan1);
            }
        }
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("           **Developed by DIAK_LK Gaming**                 ");
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("                  **Developing Team**                      ");
        System.out.println();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("           *)A.L Dineth Danurdha - Architect ");
        System.out.println();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("           *)S.Amanethmi - Story and Concept,Co-Developer");
        System.out.println();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("           *)W.G Kavishka Gayashan - Developer");
        System.out.println();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println();
        }
        System.out.println("           *)T.G Yasith Imalka  - Developer");
        System.out.println();




    }

}
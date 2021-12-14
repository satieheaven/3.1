package lab;

public class character {
    private String name;
    private double xp;
    private int strength;
    private int dexterity;
    String attackdescription;

    public character(String name,double xp,int strength,int dexterity)
    {
        this.name=name;
        this.xp=xp;
        this.strength=strength;
        this.dexterity=dexterity;
    }
    public character(String name,double xp){
        this.name=name;
        this.xp=xp;
    }
    public character(){}

    public String getName(){return name;}
    public double getXp(){return xp;}
    public int getStrength(){return strength;}
    public int getDexterity(){return dexterity;}

    public String attack() {
        attackdescription="";
        return null;
    }
}

class warrior extends character
{
    private String weapontype;
    private String shieldtype;

    public warrior (String name,double xp,int strength,int dexterity,String weapontype,String shieldtype)
    {
        super(name,xp,strength,dexterity);
        this.weapontype=weapontype;
        this.shieldtype=shieldtype;
    }


    public warrior()
    {
        super();
    }
    public String getWeapontype(){return weapontype;}
    public String getShieldtype(){return shieldtype;}
    public String attack()
    {
        int a = 0;
        a= (int) (4+Math.random()*13);
        attackdescription="\nВоин нанёс "+a+" единиц урона\n";
        return attackdescription;
    }
}

class monster extends character
{
    private double fanglength;
    private double clawlength;
    private int lapki;

    public monster (String name,double xp,int strength,int dexterity,double fanglength,double clawlength,int lapki)
    {
        super(name,xp,strength,dexterity);
        this.fanglength=fanglength;
        this.clawlength=clawlength;
        this.lapki=lapki;
    }
    public monster (String name,double xp,int strength,int dexterity)
    {
        super(name,xp,strength,dexterity);
        fanglength=4.3;
        clawlength=4.9;
        lapki=4;
    }
    public monster ()
    {
        super();
        clawlength=4.9;
        lapki=4;
    }
    public double getFanglength(){return fanglength;}
    public double getClawlength(){return clawlength;}
    public int getLapki(){return lapki;}
    public String attack()
    {
        int a = 0;
        a= (int) (4+Math.random()*13);
        attackdescription="\nМонстр нанёс "+a+" единиц урона\n";
        return attackdescription;
    }
}

class sorcerer extends character
{
    private String magictype;

    public sorcerer (String name,double xp,int strength,int dexterity,String magictype)
    {
        super(name,xp,strength,dexterity);
        this.magictype=magictype;
    }
    public sorcerer (String name,double xp,int strength,int dexterity)
    {
        super(name,xp,strength,dexterity);
        magictype="телекинез";
    }
    public sorcerer ()
    {
        super();
        magictype="левитация";
    }
    public String getMagictype(){return magictype;}
    public String attack()
    {
        int a = 0;
        a= (int) (4+Math.random()*13);
        attackdescription="\nМаг нанёс "+a+" единиц урона\n";
        return attackdescription;
    }




    public static class WriterInfo
    {
        public static void main(String[] args)
        {
            warrior w1 = new warrior("Marcus ",70 , 8 ,5,"sword ","german ");
            System.out.println("Warrior 1:\nname: "+w1.getName()+"xp: "+w1.getXp()+"strength: "+w1.getStrength()+"dexterity: "+w1.getDexterity()+"weapon type: "+w1.getWeapontype()+"shield type: "+w1.getShieldtype());
            warrior w2 = new warrior("Pierre Woodman ", 140,14,11, "manly dick", "no shield needed ");
            System.out.println("Warrior 2:\nname:"+w2.getName()+"xp:"+w2.getXp()+"strength:"+w2.getStrength()+"dexterity:"+w2.getDexterity()+"weapon type:"+w2.getWeapontype()+"shield type:"+w2.getShieldtype()+w2.attackdescription);
            warrior w3 = new warrior("Achilles",100,10,7,"spear","");
            System.out.println("Warrior 3:\nname:"+w3.getName()+"xp:"+w3.getXp()+"strength:"+w3.getStrength()+"dexterity:"+w3.getDexterity()+"weapon type:"+w3.getWeapontype()+"shield type:"+w3.getShieldtype()+w3.attackdescription);

            monster m1 = new monster("Vampire",200,20,15,1.5,1.35,4);
            System.out.println("Monster 1:\nname:"+m1.getName()+"xp:"+m1.getXp()+"strength:"+m1.getStrength()+"dexterity:"+m1.getDexterity()+"fang length:"+m1.getFanglength()+"claw length:"+m1.getClawlength()+m1.attackdescription);
            monster m2 = new monster("Spider",400,35,12,25,12,8);
            System.out.println("Monster 2:\nname:"+m2.getName()+"xp:"+m2.getXp()+"strength:"+m2.getStrength()+"dexterity:"+m2.getDexterity()+"fang length:"+m2.getFanglength()+"claw length:"+m2.getClawlength()+m2.attackdescription);
            monster m3 = new monster("Scary Dean", 1488, 120, 90, 220, 175, 0);
            System.out.println("Monster 3:\nname:"+m3.getName()+"xp:"+m3.getXp()+"strength:"+m3.getStrength()+"dexterity:"+m3.getDexterity()+"fang length:"+m3.getFanglength()+"claw length:"+m3.getClawlength()+m3.attackdescription);
        }
    }
}

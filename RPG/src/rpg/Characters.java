package RPG;

public class Characters {
    
    static Dice dice = new Dice();
    
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int maxLife;
    private int currentLife;
    private int d;
     
    //constructors
    public Characters(){
        name = "";
        strength = 5;
        dexterity = 5;
        intelligence = 5;
        maxLife = 100;
        currentLife = maxLife;
    }
    
    //overloaded constructors
    public Characters(String n, int s, int d, int i, int ml) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.currentLife = ml;
        this.maxLife = ml;
    }
    
  //setters  
    public void setName(String name){
        this.name = name;
    }
    public void setStrength(int s){
        this.strength = s;
    }
    
    public void setDex(int d){
        this.dexterity = d;
    }
    public void setIntel(int i){
        this.intelligence = i ;
    }
    public void setCL(){
        this.currentLife = maxLife;
    }
    public void setML(){
        this.maxLife = maxLife;
    }
    
    //VOID(actions)
    public int attack() {
        return dice.roll();      
    }
    public void wound(int damage) {
        this.d = damage + this.strength;
        this.currentLife -= this.d;
    }
    public void heal(int heal) {
        this.currentLife += heal;
    }
    
    
    //getters
    public String getName(){
        return name;
    }
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getIntel(){
        return intelligence;
    }
    public int getCL(){
        return currentLife;
    }
    public int getML(){
        return maxLife;
    }
    public int getDamage(){
        return d;
    }
    
    
    
    
  

    
}
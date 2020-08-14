public class Monster {

    private int health;
    private int attack;
    private double threshHold;
    private String name;
    private String description;

    public Monster (int health, int attack, double threshHold, String name, String description ) {
        setHealth(health);
        setAttack(attack);
        setThreshHold(threshHold);
        setDescription(description);
        setName(name);
    }

    //Getters
    public int getHealth() { return this.health;}
    public int getAttack() { return this.attack;}
    public double getThreshHold() { return this.threshHold;}
    public String getDescription() {return this.description;}
    public String getName() { return this.name; }

    //Setters
    public void setHealth(int health) { this.health = health; }
    public void setAttack(int attack) { this.attack = attack; }
    public void setThreshHold(double threshHold) { this.threshHold = threshHold; }
    public void setDescription(String description) { this.description = description; }
    public void setName(String name) { this.name = name; }
}

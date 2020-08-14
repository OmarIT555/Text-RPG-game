public class Player {

    private int health;
    private int attack;

    public Player (int health, int attack){
        setHealth(health);
        setAttack(attack);
    }

    //Getters
    public int getHealth() { return this.health; }
    public int getAttack() { return this.attack; }

    //Setters
    public void setHealth(int newHealth) { health = newHealth; }
    public void setAttack(int newAttack) { attack = newAttack; }


}

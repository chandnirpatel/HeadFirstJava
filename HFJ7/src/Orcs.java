/**
 * Created by Chandni on 4/5/15.
 */
public class Orcs implements Monster{
    int hitpoints = 20;

    public String name(){
        return "Orc";
    }

    public int currentHitpoints(){
        return hitpoints;
    }

    public void takeDamage(int amount){
        hitpoints -= amount;
        hitpoints = Math.max(0, hitpoints);
    }
}

/**
 * Created by Chandni on 4/5/15.
 */
public class Trolls implements Monster{
    int hitpoints = 40;

    public String name(){
        return "Troll";
    }

    public int currentHitpoints(){
        return hitpoints;
    }

    public void takeDamage(int amount) {
        hitpoints -= amount / 2; //will return truncated integer
        hitpoints = Math.max(0, hitpoints);
    }
}




import java.util.ArrayList;

/**
 * Created by Chandni on 4/5/15.
 */
public class HFJProb7 {
    public static void main(String[] args){
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(new Orcs());
        monsters.add(new Trolls());

        for(Monster m : monsters){
            m.takeDamage(10);
        }

        for(Monster m : monsters){
            System.out.println(m.name() + " has " + m.currentHitpoints() + " damage.");
        }
    }

}


/**
 * Created by Chandni on 4/5/15.
 */
public interface Monster {

    public abstract String name();

    public abstract int currentHitpoints();

    public abstract void takeDamage(int amount);
}

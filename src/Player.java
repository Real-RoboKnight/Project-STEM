import java.util.Objects;

public class Player {
  
  private static int numPlayers = 0;
  
  public static final class Position {
    private final int x;
    private final int y;
    private final int z;
    
    public Position (int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }
    
    public int x () {return x;}
    
    public int y () {return y;}
    
    public int z () {return z;}
  }
  
  public enum Direction {
    North, South, Up, Down, East, West;
    
    public String toString () {
      return String.valueOf(this.ordinal() + 1);
    }
  }
  
  
  private Position position;
  private Direction direction;
  private int hp;
  private String name;
  private int burnerint1;
  private int burnerint2;
  private int burnerint3;
  private int burnerint4;
  
  public Player () {
    this("P" + (numPlayers + 1), 0, 0, 0, 20, 1);
  }
  
  public Player (String name, int x, int y, int z) {
    this(name, x, y, z, 20, 1);
  }
  
  public Player (String name, int x, int y, int z, int health, int direction) {
    this.setName(name).setDirection(1).setDirection(direction).setPosition(x, y, z).setHp(health);
    numPlayers++;
  }
  
  public String getName () {
    return name;
  }
  
  private Player setName (String name) {
    this.name = name;
    return this;
  }
  
  public int getDirection () {
    return direction.ordinal() + 1;
  }
  
  
  private Player setDirection (Direction direction) {
    this.direction = direction;
    return this;
  }
  
  public Player setDirection (int direction) throws IndexOutOfBoundsException {
    //      default -> throw new IndexOutOfBoundsException("Direction needs to be between 1-6, inclusive, not " + direction);
    switch (direction) {
      case 1:
        return this.setDirection(Direction.North);
      case 2:
        return this.setDirection(Direction.South);
      case 3:
        return this.setDirection(Direction.Up);
      case 4:
        return this.setDirection(Direction.Down);
      case 5:
        return this.setDirection(Direction.East);
      case 6:
        return this.setDirection(Direction.West);
      default:
        return this;
    }
    
  }
  
  public Position getPosition () {
    return position;
  }
  
  private Player setPosition (Position position) {
    this.position = position;
    return this;
  }
  
  public Player setPosition (int x, int y, int z) {
    return this.setPosition(new Position(x, y, z));
  }
  
  public int getHp () {
    return hp;
  }
  
  public Player setHp (int hp) {
    this.hp = Math.max(hp, 0);
    return this;
  }
  
  public String toString () {
    return "Name: " + getName() + "\nHealth: " + getHp() + "\nCoordinates: X " + getPosition().x() + " Y " + getPosition().y() + " Z " + getPosition().z() + "\nDirection: " + getDirection();
  }
  
  public static int getNumPlayers () {
    return numPlayers;
  }
  
  public int getX () {return this.getPosition().x();}
  
  public int getY () {return this.getPosition().y();}
  
  public int getZ () {return this.getPosition().z();}
  
  void move (int direction, int units) {
    switch (direction) {
      case 1:
        this.setPosition(position.x + units, position.y, position.z);
        break;
      case 2:
        this.setPosition(position.x - units, position.y, position.z);
        break;
      case 3:
        this.setPosition(position.x, position.y + units, position.z);
        break;
      case 4:
        this.setPosition(position.x, position.y - units, position.z);
        break;
      case 5:
        this.setPosition(position.x, position.y, position.z + units);
        break;
      case 6:
        this.setPosition(position.x, position.y, position.z - units);
        break;
    }
  }
  
  public void teleport (int x, int y, int z) {
    this.setPosition(x, y, z);
  }
  
  public void teleport (Player player) {
    this.setPosition(player.getPosition());
  }
  
  public double getDistance (int x, int y, int z) {
    return Math.sqrt(Math.pow((this.getX() - x), 2) + Math.pow((this.getY() - y), 2) + Math.pow((this.getZ() - z), 2));
  }
  
  public double getDistance (Player player) {
    return this.getDistance(player.getX(), player.getY(), player.getZ());
  }
  
  public void attack (Player player, int damage) {
//    damage = Math.min(damage, player.getHp());
    player.setHp(player.getHp() - damage);
    this.setHp(this.getHp() + damage/2);
  }
}

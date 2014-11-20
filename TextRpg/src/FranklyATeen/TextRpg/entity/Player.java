package FranklyATeen.TextRpg.entity;

public class Player {
	
	private String name;
	private int level;
	private int maxHealth;
	private int health;
	private int xp;
	private int dammage;
	
	public Player(){
		this.name = "Default name";
		this.maxHealth = 100;
		this.level = 1;
		this.xp = 0;
		this.dammage = 50;
	}
	
	public Player(String name){
		this.name = name;
		this.maxHealth = 100;
		this.level = 1;
		this.xp = 0;
		this.dammage = 50;
	}
	
	public String getName(){
		return name;
	}
	
	public int getLevel(){
		return level;
	}
	
	public int getMaxHealth(){
		return maxHealth;
	}
	
	public int gethealth(){
		return health;
	}
	
	public void levelUp(){
		level++;
	}
	
	public int getDammage(){
		return dammage;
	}
}

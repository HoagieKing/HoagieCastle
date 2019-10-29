package RPGm;

public class Player 
{
	//private variables for player statistics and experience points
	private int myMaxHP;
	private int myPlayerHP;
	private int myPlayerMeleeDMG;
	private int myExp;
	private int myLevel;
	private int myMana;
	private int myMaxMana;
	private int myPlayerSpeed;
	private String myMClass;
	
	//private variables for enemy statistics/no exp
	private int myEnemyHP;
	private int myEnemyMeleeDMG;
	public static int enemyLevel;
	
	//getters and setters for changing specific values
	public int getMaxHP()
	{
		return myMaxHP;
	}
	
	public void setMaxHP(int maxHP)
	{
		myMaxHP = maxHP;
	}
	
	public int getPlayerHP()
	{
		return myPlayerHP;
	}
	
	public void setPlayerHP(int playerHP)
	{
		myPlayerHP = playerHP;
	}
	
	public int getPlayerMeleeDMG()
	{
		return myPlayerMeleeDMG;
	}
	
	public void setPlayerMeleeDMG(int playerMeleeDMG)
	{
		myPlayerMeleeDMG = playerMeleeDMG;
	}
	
	public int getPlayerSpeed()
	{
		return myPlayerSpeed;
	}
	
	public void setPlayerSpeed(int playerSpeed)
	{
		myPlayerSpeed = playerSpeed;
	}

	public int getExp()
	{
		return myExp;
	}
	
	public void setExp(int exp)
	{
		myExp = exp;
	}
	
	public int getLevel()
	{
		return myLevel;
	}
	
	public void setLevel(int level)
	{
		myLevel = level;
	}
	
	public String getMClass()
	{
		return myMClass;
	}
	
	public void setMClass(String mClass)
	{
		myMClass = mClass;
	}
	
	public int getMana()
	{
		return myMana;
	}
	
	public void setMana(int mana)
	{
		myMana = mana;
	}
	
	public int getMaxMana()
	{
		return myMaxMana;
	}
	
	public void setMaxMana(int maxMana)
	{
		myMaxMana = maxMana;
	}
	
	public int getEnemyHP()
	{
		return myEnemyHP;
	}
	
	public void setEnemyHP(int enemyHP)
	{
		myEnemyHP = enemyHP;
	}
	
	public int getEnemyMeleeDMG()
	{
		return myEnemyMeleeDMG;
	}
	
	public void setEnemyMeleeDMG(int enemyMeleeDMG)
	{
		myEnemyMeleeDMG = enemyMeleeDMG;
	}
}

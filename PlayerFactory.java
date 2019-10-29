package RPGm;

public class PlayerFactory extends Player
{
	
	public void buildHoagieWarrior()
	{
		setMClass("Hoagie Warrior");
		setMaxHP(20);
		setPlayerHP(20);
		setPlayerMeleeDMG(4);
		setPlayerSpeed(5);
		setExp(0);
		setLevel(1);
	}
	
	public void buildHoagieTheif()
	{
		setMClass("Hoagie Theif");
		setMaxHP(14);
		setPlayerHP(14);
		setPlayerMeleeDMG(6);
		setPlayerSpeed(10);
		setExp(0);
		setLevel(1);
	}
	
	public void buildSoyMage()
	{
		setMClass("Soy Mage");
		setMaxHP(12);
		setPlayerHP(12);
		setMana(20);
		setMaxMana(20);
		setPlayerMeleeDMG(3);
		setPlayerSpeed(8);
		setExp(0);
		setLevel(1);
	}
	
	public void buildHoagieWhiteMage()
	{
		setMClass("Mayo Mage");
		setMaxHP(10);
		setPlayerHP(10);
		setMana(20);
		setMaxMana(20);
		setPlayerMeleeDMG(2);
		setPlayerSpeed(8);
		setExp(0);
		setLevel(1);
	}
	
	//builds an enemy based on player level/stats
	public void buildEnemy()
	{
		switch(enemyLevel)
		{
			case 1:
			setEnemyHP(12);
			setEnemyMeleeDMG(2);
			case 2: 
			setEnemyHP(20);
			setEnemyMeleeDMG(3);
			case 3:
			setEnemyHP(28);
			setEnemyMeleeDMG(5);
			case 4:
			setEnemyHP(35);
			setEnemyMeleeDMG(6);
			case 5:
			setEnemyHP(50);
			setEnemyMeleeDMG(8);
			
		}
	}
}

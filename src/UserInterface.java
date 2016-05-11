public interface UserInterface
{
	// Init methods for players
	public int getNumPlayers();
	public String getPlayerName();
	public String getStartingTerritory(String playerName);

	// Pre Player Turn Methods
	void promptPlayerTurn(Player p);

	// Deploy Armies Methods
	public String getDeployTerritory(Player p);
	public int getNumArmiesToDeploy(Player p, String deployTerritory);

	// Attack Territories methods
	public boolean getFinishedAttacking();
	public String getTerritoryToAttack(Player p);
	public String getTerritoryToAttackFrom(Player p, String territoryToAttack);
	public int getNumArmiesToAttackWith(Player p, String territoryToAttackID, String territoryToAttackFromID);
	public void displayBattleResults(BattleResults results);

	// Fortify Troops methods
	public String getTerritoryToFortify(Player p);
	public String getTerritoryToFortifyFrom(Player p, String terrID);
	public int getNumArmiesToFortify(String terrToFortFrom);

	// Utility Methods
	public void generateWarning(String string);
}

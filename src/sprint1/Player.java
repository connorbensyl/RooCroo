package sprint1;

public class Player {

	private int initialPieceCount = 9;
	private int numPiecesPlayed = 0;
	private int numGamesWon = 0;
	private int piecesOnBoard = 0;
	private boolean canFly = false;
	private String name;
	private String phase;
	public  String color;
	public Player(String colorIn) {
		color = colorIn;
		canFly = false;
		phase = "placing pieces";
	}
	
	public void setPhase(String phase)
	{
		this.phase = phase;
	}
	
	public String getPhase()
	{
		return this.phase;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getinitialPieceCount() {
		return initialPieceCount;
	}
	
	public int getNumPiecesPlayed() {
		return numPiecesPlayed;
	}
	
	public int getPiecesLeftToPlace() {
		return (initialPieceCount - numPiecesPlayed);
	}
	public int getPiecesOnBoard() {
		return piecesOnBoard;
	}
	
	public int getNumGamesWon()
	{
		return numGamesWon;
	}
	
	
	public void setNumPiecesPlayed(int num) 
	{
		this.numPiecesPlayed = num;
	}
	
	
	
	public void setpiecesOnBoard(int num) 
	{
		this.piecesOnBoard = num;
	}
	public
	//Can player fly
	
	boolean canFly() {
		int a = getPiecesLeftToPlace();
		if ((a == 0) && (piecesOnBoard == 3 )) {
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}
	
	
	public void increment_after_piece_played()
	{
		this.piecesOnBoard++;
		this.numPiecesPlayed++;
	}
	
	public void decrementpiecesOnBoard()
	{
		piecesOnBoard--;
	}
	
	public void incrementGamesWon()
	{
		numGamesWon++;
	}
	
	
	

}

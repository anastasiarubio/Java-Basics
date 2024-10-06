//instiable class
public class EggBox{
	//vars
	private int eggs;
	private int boxSize;
	private int numBoxes;
	private int leftOverEggs;

	//constructor
	public EggBox () {

		eggs=0;
		boxSize=6;
		numBoxes=0;
		leftOverEggs=0;
	}

	//set (this will allow data to travel from App Class to the Intangiable Class )
	public void setEggs(int eggs){
		this.eggs=eggs;
	}
	public void setBoxSize(int boxSize){
		this.boxSize=boxSize;
	}
	//compute (this what happens once the data that we need has gone into our Intangible class.)
	public void computeBoxes(){
		numBoxes=eggs/6;
	}
	public void computeLeftover(){
		leftOverEggs=eggs%boxSize;
	}
	//get ( how we get data that we ned back to the App Class)
	public int getBoxes(){
		return numBoxes;
	}
	public int getLeftover(){
		return leftOverEggs;
	}
}
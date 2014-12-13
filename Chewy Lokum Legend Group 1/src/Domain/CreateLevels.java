package Domain;

public class CreateLevels{
	public static Level[] setOfLevels= new Level[5]; 

	public CreateLevels(){
		setOfLevels[0]=new ScoreBasedLevel(700,6,6,20,true);
		setOfLevels[1]=new ScoreBasedLevel(50000,4,4,5,false);
		setOfLevels[2]=new ScoreBasedLevel(35000,7,5,4,false);
		setOfLevels[3]=new ScoreBasedLevel(66000000, 4, 6,55,false);
		setOfLevels[4]=new ScoreBasedLevel(13500, 5, 5,11,false);

	}
	public void setLevelUnlocked(int levelNo){
		if(levelNo<setOfLevels.length-1){
		setOfLevels[levelNo+1].setUnlocked(true);
		}
	}
}

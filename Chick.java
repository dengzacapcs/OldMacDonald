class Chick implements Animal 
{     
	private String myType;
	private String mySound;
	private String myOtherSound;
	public Chick(String type, String sound){
		myType = type;
		mySound = sound;
		myOtherSound = "unknown";
	}
	public Chick(String type, String firstSound, String secondSound){
		myType = type;
		mySound = firstSound;
		myOtherSound = secondSound;
	}
	public Chick(){
		myType = "unknown";
		mySound = "unknown";
		myOtherSound = "unknown";
	}
	public String getSound(){return (Math.random() < 0.5 ? mySound : myOtherSound);}
	public String getType(){return myType;};
}

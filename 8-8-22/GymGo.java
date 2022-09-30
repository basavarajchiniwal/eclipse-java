class GymGo
{
	public static void main(String[] args)
	{
		String[] eqp={"DUMB BELLS","RUNNING PLATFORM ","WEIGHT LIFTING","CHEST INCREASER"};
	
	
	
	//Gym(String name,double fees,String[] equipments,Trainer trainer)
	
	//setTrainer set=("rhaul",35,15d,9036650754l)
	
	Trainer trainer=new Trainer();
	trainer.setTrainer("rhaul",35,15d,Gender.OTHERS,9036650754l);
	trainer.printData();
	Gym gym=new Gym("gold",2500d,eqp);
	gym.printData();
	}
}

package check;

public class Main {
	
	private static String firstName = "真弥";
	private static String lastName = "七海";
	

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		Pet pet = new Pet("java吉", "hoge");
		pet.introduce();
		RobotPet rbp = new RobotPet("R2D2", "ルーク");
		rbp.introduce();
		printName( lastName , firstName);
	}
		public static void printName (String lastName, String firstName) {
		System.out.println ( lastName + firstName );
	}
	
	}
	



public class MenuSelect {

	public static void main(String[] args) {
	//점심엔 뭘먹지
		
		int menu;
		menu = (int)(Math.random()*5)+1; 
		System.out.println("랜덤값: " + menu);
		
		switch (menu) {

		case 1:
			System.out.println("한식");
			break;
		case 2:
			System.out.println("중식");
			break;
		case 3:
			System.out.println("일식");
			break;
		case 4:
			System.out.println("양식");
			break;
		case 5:
			System.out.println("햄버거");
			break;

	}
	}
}

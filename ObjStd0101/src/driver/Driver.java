package driver;

import company.SalesEmployee;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ]
		
		SalesEmployee hayami = new SalesEmployee("速水剛留", 1000000);
		System.out.println();
		hayami.displayInfo();


		SalesEmployee kawai = new SalesEmployee("河合彩香");
		System.out.println();
		kawai.displayInfo();
	}

}

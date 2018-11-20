package StatePattern;

public class DrinkEmpty implements State {

	private static DrinkEmpty drinkempty = new DrinkEmpty(); // シングルトンパターンインスタンス

	private DrinkEmpty() {
	} // 　他のところで参照できなく防いで、ここで作る

	public static DrinkEmpty getInstance() {
		return drinkempty; // getInstanceが呼ばれたら上で作ったdrinkemptyインスタンス返還
	}

	public void insertMoney(VendingMachine machine, int coin) {
		machine.coin += coin;
		System.out.println(coin + "원을 넣었습니다. 현재 투입된 금액은" + machine.coin + "원 입니다.");
		System.out.println("매진 되었습니다." + coin + "원이 반환되었습니다.");
		machine.coin = 0;
	}

	@Override
	public void pushButton(VendingMachine machine) {
		System.out.println("매진 되었습니다.");
		System.out.println("음료 보충을 시작합니다. 보충할 음료의 개수와 금액을 설정 해 주세요");
		machine.setState(SetDrink.getInstance());
	}

	@Override
	public void returnMoney(VendingMachine machine) {
		System.out.println("매진 되었습니다.");
	}

	@Override
	public void setDrink(VendingMachine machine, int num, int price) {

	}

}

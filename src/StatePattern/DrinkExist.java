package StatePattern;

public class DrinkExist implements State {
	private static DrinkExist drinkexist = new DrinkExist();

	private DrinkExist() {
	}

	public static DrinkExist getInstance() {
		return drinkexist;
	}

	@Override
	public void insertMoney(VendingMachine machine, int coin) {
		machine.coin += coin;
		System.out.println(coin + "원을 넣었습니다. 현재 투입된 금액은" + machine.coin + "원 입니다.");

	}

	@Override
	public void pushButton(VendingMachine machine) {
		if (machine.coin >= machine.drinkPrice) { // 투입된 돈이 음료가격보다 많을 때
			System.out.println("음료수가 나왔습니다.");
			machine.coin -= machine.drinkPrice;
			machine.setDrinkThings -= 1;

			if (machine.setDrinkThings <= 0) {
				System.out.println("매진 되었습니다. " + machine.coin + "원을 반환합니다.");
				machine.coin = 0;
				machine.setState(DrinkEmpty.getInstance()); // 반환하고 처리
			}
		} else { // 반대 = 돈 부족
			System.out.println("금액이 모자랍니다.");
		}
	}

	@Override
	public void returnMoney(VendingMachine machine) {
		System.out.println(machine.coin + "원이 반환되었습니다.");
		machine.coin = 0;
	}

	@Override
	public void setDrink(VendingMachine machine, int num, int price) {
		System.out.println("음료가 다 떨어졌으니 보충하겠습니다");
		System.out.println("충전된 음료 갯수: " + num + "설정된 음료 가격 : " + price);
	}
}

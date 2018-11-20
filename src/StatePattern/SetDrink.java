package StatePattern;

public class SetDrink implements State {

	private static SetDrink setdrink = new SetDrink();

	private SetDrink() {
	}

	public static SetDrink getInstance() {
		return setdrink;
	}

	@Override
	public void setDrink(VendingMachine machine, int num, int price) {
		System.out.println("음료를 보충하였습니다.");
		machine.setDrinkThings = num;
		machine.drinkPrice = price;
		System.out.println("보충된 음료의 갯수 : " + num + "개");
		System.out.println("보충된 음료의 가격 : " + price + "원");
		machine.setState(DrinkExist.getInstance());
	}

	@Override
	public void insertMoney(VendingMachine machine, int coin) {
	}

	@Override
	public void pushButton(VendingMachine machine) {
	}

	@Override
	public void returnMoney(VendingMachine machine) {

	}

}

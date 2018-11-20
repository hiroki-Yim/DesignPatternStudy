package StatePattern;

public interface State {

	public void setDrink(VendingMachine machine, int num, int price);

	public void insertMoney(VendingMachine machine, int coin);

	public void pushButton(VendingMachine machine);

	public void returnMoney(VendingMachine machine);

}

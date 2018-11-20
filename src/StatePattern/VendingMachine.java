package StatePattern;

public class VendingMachine {
    private State state;

    public int coin = 0; // 들어간 돈
    public int setDrinkThings = 0; // 설정 음료 갯수
    public int drinkPrice = 0; // 설정 음료 가격
    public int num = 0; // 음료 갯수 재설정
    public int price = 0; // 음료 가격 재설정

    public void setState(State state) {
        this.state = state; // 이 기계의 상태를 넘겨받은 상태로 변경
    }

    public VendingMachine(int setDrinkThings, int drinkPrice) {
        this.setDrinkThings = setDrinkThings;
        this.drinkPrice = drinkPrice;
        if (this.setDrinkThings > 0) {
            state = DrinkExist.getInstance();
        } else if (this.setDrinkThings == 0) {
            state = SetDrink.getInstance();
        } else {
            state = DrinkEmpty.getInstance();
        }
    }

    public void insertMoney(int coin) {
        state.insertMoney(this, coin);
    }

    public void pushButton() {
        state.pushButton(this);
    }

    public void returnMoney() {
        state.returnMoney(this);
    }

    public void setDrink(int num, int price) {
        state.setDrink(this, num, price);
    }
}

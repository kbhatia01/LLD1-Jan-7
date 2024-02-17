package withoutAdapter;

public class RandomClass {

//    yesBank y;
    iciciBank iciciBank;
    RandomClass(){
//        y = new yesBank();
        iciciBank = new iciciBank();
    }

    public int someRandomMethod(){
//        int a = y.getBalance()
        int a = iciciBank.CheckBalance();
        return a;
    }
}

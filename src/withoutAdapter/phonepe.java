package withoutAdapter;

public class phonepe {
//    yesBank y;

    iciciBank icici;

    phonepe(){
//        this.y = new yesBank();
        this.icici = new iciciBank();
    }

    public int checkBalance(){
//        return y.getBalance();

        return icici.CheckBalance();
    }
}

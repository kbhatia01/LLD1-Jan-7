package AdapterPattren;

public class phonepe {
    bank b;

    public phonepe(){
        b = new YesBankAdapter();
    }

    int seeBalance(){
        return b.getBalance();
    }
}

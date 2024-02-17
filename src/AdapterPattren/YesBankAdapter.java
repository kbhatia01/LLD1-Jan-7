package AdapterPattren;

import AdapterPattren.thirtParty.yesbank;

public class YesBankAdapter implements bank{

    yesbank y = new yesbank();


    @Override
    public int getBalance() {
        return y.checkBalance();
    }
}

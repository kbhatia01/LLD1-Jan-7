package Models;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Bill extends Base_Model{

    private  Operator operator;
    private  List<Payment> payments;
    private double amount;
    private Date exitTime;
    private Token token;
    private  Gate gateExitedAt ;
    private  BILL_STATUS billStatus;

}

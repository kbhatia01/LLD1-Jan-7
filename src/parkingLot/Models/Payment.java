package Models;

import java.util.Date;

public class Payment extends Base_Model{
    double amount;
   private PAYMENT_MODE paymentMode;
   private Bill bill;
   private Date paidTime;
   private String refID;
   PAYMENT_STATUS paymentStatus;
}

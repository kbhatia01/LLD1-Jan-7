package parkingLot.Model;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{

    Date exitTime;

    Token token;

    Gate ExitedAt;

    Operator operator;

    List<Payments> payments;

    int TotalAmount;

    BillStatus billStatus;

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Gate getExitedAt() {
        return ExitedAt;
    }

    public void setExitedAt(Gate exitedAt) {
        ExitedAt = exitedAt;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public List<Payments> getPayments() {
        return payments;
    }

    public void setPayments(List<Payments> payments) {
        this.payments = payments;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        TotalAmount = totalAmount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}

package belajar_java_validation;

import belajar_java_validation.group.CreditCardPaymentGroup;
import belajar_java_validation.group.VirtualAccountPaymentGroup;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.groups.Default;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;

public class Payment {


    @NotBlank(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
            message = "order id can not blank")
    private String orderId;

    @Range(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
            min = 10_000L, max = 100_000_000L, message = "amount must between 10.000 and 100.000.000")
    @NotNull(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
            message = "amount can not null")
    private Long amount;

    @LuhnCheck(groups = {CreditCardPaymentGroup.class},
            message = "invalid credit card number")
    @NotBlank(groups = {CreditCardPaymentGroup.class},
            message = "credit card can not blank")
    private String creditCard;

    @NotBlank(groups = {VirtualAccountPaymentGroup.class},
            message = "virtual account can not blank")
    private String virtualAccount;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getVirtualAccount() {
        return virtualAccount;
    }

    public void setVirtualAccount(String virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", creditCard='" + creditCard + '\'' +
                ", virtualAccount='" + virtualAccount + '\'' +
                '}';
    }
}

package bai_tap_them.quan_ly_furama.entity;

public class Contract implements Comparable<Contract> {
    private String contractId;
    private String bookingId;
    private double depositAmount;
    private double paymentAmount;

    public Contract(String contractId, String bookingId, double depositAmount, double paymentAmount) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.depositAmount = depositAmount;
        this.paymentAmount = paymentAmount;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public int compareTo(Contract o) {
        return this.getContractId().compareTo(o.getContractId());
    }

    @Override
    public String toString() {
        return String.format(
                "-----------------------------\n" +
                        " Contract Information\n" +
                        "-----------------------------\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s\n" +
                        " %-15s : %.2f VND\n" +
                        " %-15s : %.2f VND\n" +
                        "-----------------------------",
                "Contract ID", contractId,
                "Booking ID", bookingId,
                "Deposit", depositAmount,
                "Payment", paymentAmount
        );
    }
}

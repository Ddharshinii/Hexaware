package entity;

public class Payment {
    private int paymentId;
    private String paymentDate;
    private double paymentAmount;
    private Client client; // Represents the client associated with the payment

    // Default constructor
    public Payment() {
    // You can initialize default values here if needed
    }

    // Parameterized constructor
    public Payment(int paymentId, String paymentDate, double paymentAmount, Client client) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.client = client;
    }

    // Getters
    public int getPaymentId() {
        return paymentId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public Client getClient() {
        return client;
    }

    // Setters
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void printAllVariables() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Amount: " + paymentAmount);
        System.out.println("Client: " + client);
    }
    
    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", client=" + client +
                '}';
    }
}

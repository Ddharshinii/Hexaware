package entity;

public class Claim {
    private int claimId;
    private String claimNumber;
    private String dateFiled;
    private double claimAmount;
    private String status;
    private String policy; // Represents the policy associated with the claim
    private Client client; // Represents the client associated with the claim

    // Default constructor
    public Claim() {
        // You can initialize default values here if needed
    }

    // Parameterized constructor
    public Claim(int claimId, String claimNumber, String dateFiled, double claimAmount,
                 String status, String policy, Client client) {
        this.claimId = claimId;
        this.claimNumber = claimNumber;
        this.dateFiled = dateFiled;
        this.claimAmount = claimAmount;
        this.status = status;
        this.policy = policy;
        this.client = client;
    }

    // Getters
    public int getClaimId() {
        return claimId;
    }

    public String getClaimNumber() {
        return claimNumber;
    }

    public String getDateFiled() {
        return dateFiled;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public String getPolicy() {
        return policy;
    }

    public Client getClient() {
        return client;
    }

    // Setters
    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public void setDateFiled(String dateFiled) {
        this.dateFiled = dateFiled;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    // Method to print all member variables and values
    public void printAllVariables() {
        System.out.println("Claim ID: " + claimId);
        System.out.println("Claim Number: " + claimNumber);
        System.out.println("Date Filed: " + dateFiled);
        System.out.println("Claim Amount: " + claimAmount);
        System.out.println("Status: " + status);
        System.out.println("Policy: " + policy);
        System.out.println("Client: " + client);
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", claimNumber='" + claimNumber + '\'' +
                ", dateFiled='" + dateFiled + '\'' +
                ", claimAmount=" + claimAmount +
                ", status='" + status + '\'' +
                ", policy='" + policy + '\'' +
                ", client=" + client +
                '}';
    }
}

package entities;

public class SavingsAccount extends Account {
    private Double interestatRate;

    public SavingsAccount() {}

    public SavingsAccount(int number, String holder, double balance,Double interestatRate) {
        super( number, holder, balance);
        this.interestatRate = interestatRate;
    }

    public Double getInterestatRate() {
        return interestatRate;
    }

    public void setInterestatRate(Double interestatRate) {
        this.interestatRate = interestatRate;
    }

    public void updateBalance() {
        double result = getBalance() * interestatRate;
        setBalance(getBalance() + result);
    }

}

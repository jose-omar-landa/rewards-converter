public class RewardValue {

    private final double cashValue;
    public static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    // method to convert cash value into a miles value
    private static int convertCashToMiles(double cashValue){
        return (int) (cashValue / conversionRate);
    }

    //method to convert miles value into a cash value
    private static int convertMilesToCash(int milesValue) {
        return (int) (milesValue * conversionRate);
    }

    //returns the cash value
    public double getCashValue() {
        return cashValue;
    }

    //returns the miles value
    public int getMilesValue(){
        return convertCashToMiles(this.cashValue);
    }

}

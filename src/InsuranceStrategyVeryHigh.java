public class InsuranceStrategyVeryHigh extends InsuranceStrategy {

    public double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    @Override
    int getConstant() {
        return 105600;
    }

    @Override
    double getWeight() {
        return 0.02;
    }

    @Override
    int getAdjustment() {
        return 60000;
    }

}
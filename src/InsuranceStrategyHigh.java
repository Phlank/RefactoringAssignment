public class InsuranceStrategyHigh extends InsuranceStrategy {

    @Override
    int getConstant() {
        return 76500;
    }

    @Override
    double getWeight() {
        return 0.2;
    }

    @Override
    int getAdjustment() {
        return 30000;
    }

}

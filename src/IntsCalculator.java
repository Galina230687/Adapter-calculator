public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //������� ����� target
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result.intValue();
    }

    @Override
    public int sub(int arg0, int arg1) {
        //������� ����� target
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result.intValue();
    }

    @Override
    public int mult(int arg0, int arg1) {
        //������� ����� target
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result.intValue();
    }

    @Override
    public int div(int arg0, int arg1) {
        //������� ����� target
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.DIV)
                .result.intValue();
    }

    @Override
    public int pow(int a, int b) {
        //������� ����� target
        return target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result.intValue();
    }
}



public class Calculator {
    public int add;
    public int subtract;
    public int multiply;
    public double divide;
    public Calculator(int add, int subtract, int multiply, double divide){
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public int Add(){
        return this.add += this.add;
    }

    public int subtract(){
        return this.subtract -= this.subtract;
    }

    public int multiply(){
        return this.multiply *= this.multiply;
    }
    public double divide(){
        return this.divide %= this.divide;
    }
}

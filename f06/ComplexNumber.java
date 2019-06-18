class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(){
        this(0, 0);
    }
    public ComplexNumber(double real){
        this(real, 0);
    }
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public ComplexNumber sum(final ComplexNumber object){
        return new ComplexNumber(real+object.getReal(), imaginary+object.getImaginary());
    }
    public ComplexNumber product(final ComplexNumber object){
        double result_Real = real*object.getReal()-imaginary*object.getImaginary();
        double result_Imaginary = imaginary*object.getReal()+real*object.getImaginary();
        return new ComplexNumber(result_Real, result_Imaginary);
    }
    public void display(){
        System.out.println("(" + real + ") + (" + imaginary + ") i");
    }
}

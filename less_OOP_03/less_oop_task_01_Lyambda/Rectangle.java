package less_OOP_03.less_oop_task_01_Lyambda;

public class Rectangle implements I_Measure, I_Const{
    private Double width;
    private Double height;

    public Rectangle(Double w, Double h){
        width = w;
        height = h;
    }

    public Rectangle (Double n){
        this(n,n);
    }

    public Rectangle (){
        width = MIN;
        height = 2 * MIN;
    }

    public void setWidth(Double w) {
        this.width = w;
    }

    public void setHeigth(Double h) {
        this.height = h;
    }

    public Double getWidth() {
        return this.width;
    }

    public Double getHeigth() {
        return this.height;
    }

    @Override
    public Double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public Double calculateDiagonal(int f) {
        Double w = this.width;
        Double h = this.height;
        
        if (f == 1){ // тогда считаем диагональ, проведенную из середин сторон 
            w = w / 2;
            h = h / 2;
        }
        return Math.sqrt(Math.pow(w,2) + Math.pow(h,2));
    }

    @Override
    public Double calculateAriaInsideRomb() {
        Double side = calculateDiagonal(1);
        return side * side;
    }

    @Override
    public Double calculatePerimetrInsideRomb() {
        Double side = calculateDiagonal(1);
        return 2 * (side + side);
    }

    @Override
    public void printRectangle() {
        System.out.println("width= " + this.width + ", heigth= " + this.height);
    }
}


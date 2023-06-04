package less_OOP_03.less_oop_task_01_Lyambda;

public interface I_Measure {
    
    Double calculatePerimeter(); // расчет периметра
    Double calculateArea(); // расчет площади
    Double calculateDiagonal(int x); // расчет диагонали
    Double calculateAriaInsideRomb(); // расчет площади ромба внутри прямоугольника (из середины сторон)
    Double calculatePerimetrInsideRomb(); // расчет перимтера ромба
    void printRectangle(); // печать прямоугольника (стороны)
}

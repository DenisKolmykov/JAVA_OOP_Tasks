package less_OOP_01.less_oop_task_02_Rectangle_interface;

public interface I_Measure {
    Double calculatePerimeter(); // расчет периметра
    Double calculateArea(); // расчет площади
    Double calculateDiagonal(int x); // расчет диагонали
    Double calculateAriaInsideRomb(); // расчет площади ромба внутри прямоугольника (из середины сторон)
    Double calculatePerimetrInsideRomb(); // расчет перимтера ромба
    void printRectangle(); // печать прямоугольника (стороны)
}

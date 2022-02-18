package sec04.exam06;   //메소드 오버로딩

public class Calculator {
    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }
}

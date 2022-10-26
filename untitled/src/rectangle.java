package Area_and_perimetr;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.lang.*;
public class rectangle extends figures{
    private Double a, b;
    public rectangle (List<Double> value){
        super(value);
    }
    @Override
    public Double plosh(){
        return value.get(0)*value.get(1);
    }

    @Override
    public Double perimetr(){
        return (value.get(0)+value.get(1))*2;
    }

    @Override
    public String characterFigure() {
        return "Прямоугольник";
    }
    @Override
    public void parametrs_of_figure(FileOutputStream fos) throws IOException {
            System.out.printf("Прямоугольник. Площадь: %.2f Периметр: %.2f", plosh(), perimetr());
        fos.write(("Прямоугольник. Площадь: " +String.valueOf(plosh())+ ", Периметр: " + String.valueOf(perimetr())).getBytes());
    }

}

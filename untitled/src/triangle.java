package Area_and_perimetr;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.lang.*;
public class triangle extends figures{
    Double a=1.0, b=2.0, c=2.0;
    Double p = value.get(0)+value.get(1)+value.get(2);
    //S=sqrt{p*(p-a)*(p-b)*(p-c)};
    public triangle (List<Double> value){
        super(value);
    }


    public Double plosh(){
        Double s = p/2;
        return Math.pow((s*(s-value.get(0))*(s-value.get(1))*(s-value.get(2))), 0.5);
    }
    @Override
    public Double perimetr(){
        return p;
    }

    @Override
    public String characterFigure() {
        return "Треугольник";
    }
    @Override
    public void parametrs_of_figure(FileOutputStream fos) throws IOException {
        System.out.printf("Треугольник. Площадь: %.2f Периметр: %.2f", plosh(), perimetr());
        fos.write(("Треугольник. Площадь: " +String.valueOf(plosh())+ ", Периметр: " + String.valueOf(perimetr())).getBytes());
    }
}

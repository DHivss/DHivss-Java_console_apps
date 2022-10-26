package Area_and_perimetr;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.math.*;

public class circle extends figures{
    private Double a = value.get(0);
   /* public circle(Double a, Double b) {
        // super(name);
        this.a = a;

    }*/
    public circle (List<Double> value){
        super(value);
    }
    @Override
    public Double plosh(){
        if (a <= 0) {
            return null;
        }
        return Double.valueOf(Math.round(a*a*Math.PI));
    }

    @Override
    public Double perimetr(){
        if (a <= 0) {
            return null;
        }
        return Double.valueOf(Math.round(a*2*Math.PI));
    }

    @Override
    public String characterFigure(){
        return "Круг";
    }

    @Override
    public void parametrs_of_figure(FileOutputStream fos) throws IOException {
            System.out.printf("Круг. Площадь: %.2f Периметр: %.2f", plosh(), perimetr());
            fos.write(("Круг. Площадь: " +String.valueOf(plosh())+ ", Периметр: " + String.valueOf(perimetr())).getBytes());

    }

}


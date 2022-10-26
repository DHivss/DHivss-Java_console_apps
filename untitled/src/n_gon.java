package Area_and_perimetr;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.lang.*;

public class n_gon extends figures{
    private Double a;
    public n_gon(List<Double> value){
        super(value);
    }
    @Override
    public Double perimetr(){
        Double p = Double.valueOf(0);
    for (int i = 0; i < value.size(); i++){
        p += value.get(i);
        }
        return p;
    }
    @Override
    public Double plosh(){
        Double p = Double.valueOf(0);
        for (int i = 0; i < value.size(); i++){
            p *= value.get(i);
        }
        return p;
    }
    @Override
    public String characterFigure(){ return "n-угольник";
    }
    @Override
    public void parametrs_of_figure(FileOutputStream fos) throws IOException {
            System.out.printf("%d -угольник. Периметр: %.2f", value.size(), perimetr());
        fos.write((String.valueOf(value.size())+ "- угольник. Площадь: " +String.valueOf(plosh())+ ", Периметр: " + String.valueOf(perimetr())).getBytes());
    }
}


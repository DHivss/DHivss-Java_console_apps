package Area_and_perimetr;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.lang.*;
public class figures implements formules {
    private String name = characterFigure();
    List<Double> value = new ArrayList<Double>();
    private Double p;
    private Double s;
    //Color color;
    public figures(){
    }
    public figures(List<Double> value) {
        this.value = value;
    }
    public Double plosh(){
      return s;}

    public Double perimetr(){
        return p;
    }
    public String characterFigure() {
        return name;
    }

    public void parametrs_of_figure(FileOutputStream fos) throws IOException {};
}

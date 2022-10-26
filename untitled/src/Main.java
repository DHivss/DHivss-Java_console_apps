package Area_and_perimetr;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

import static java.lang.System.exit;

/* Definition of the figure and calculation of
its area and perimeter based on the entered2

parameters, the lengths of the sides:
1 - circle; 2 - rectangle; 3 - triangle; 4 and more - n-gon.*/

public class Main {
        private static final Logger logger = Logger.getLogger(Main.class.getName());
        Handler handler;
    {
        try {
            handler = new FileHandler("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
    Scanner n = new Scanner(System.in);
    List<Double> array = new ArrayList<>();
    FileOutputStream fos = new FileOutputStream("figure.txt");
    figures f = new figures(array);
    input(n, array, f, fos);
    logger.info("успешное выполнение программы.");

}
    public static void input(Scanner n, List<Double> array, figures f, FileOutputStream fos) throws IOException {
        System.out.println("Введите длины сторон фигуры, площадь которой нужно вычислить.\n"+
        "Для прямоугольника введите его длину и ширину, для круга - его радиус.");
           String[] str = n.nextLine().split(" ");
           try {
           for  (int i = 0; i < str.length; i++) {
               if (Double.valueOf(str[i]) <= 0){
                   throw new NumberFormatException();
               }
                array.add(Double.valueOf(str[i]));
            }
           }
           catch (NumberFormatException ex){
               //System.out.println("Ошибка ввода\n");
               logger.warning("Ошибка ввода\n");
               exit(0);
           } finally {
               n.close();
           }
             if (array.size() == 1) {
                 f = new circle(array);
                 f.parametrs_of_figure(fos);
            } else if (array.size() == 3) {
                 f = new triangle(array);
                 f.parametrs_of_figure(fos);
            } else if (array.size() == 2) {
                 f = new rectangle(array);
                 f.parametrs_of_figure(fos);
            } else {
                 f = new n_gon(array);
                 f.parametrs_of_figure(fos);
            }
             //return f;
    }

}

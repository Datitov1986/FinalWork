package FinalWork.Fourth;

import static FinalWork.Fourth.Control.RunApp.Run;


public class App {
    public static void main(String[] args) {
        try {
            Run();
        } catch (Exception e) {
            System.out.println("Программа завершилась с ошибкой, описание ниже: ");
            System.out.println(e.getMessage());
        }
    }
}

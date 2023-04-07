package DZ3;
import java.util.function.Function;


public class Program {
    public static void main(String[] args) {
        Father father = new Father("Отец", "Александр", 50, 180);
        father.print();
        Father.main1();

        Son son = new Son("Сын", "Вася", 15, 156);
        son.print();
        Son.main2();

    }
}

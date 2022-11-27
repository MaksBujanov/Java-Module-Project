import java.util.Scanner; // Добавили ввод с клавиатуры
public class Main {
    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите на скольких человек необходимо разделить счёт");
        while (true) { // Запускаем бесконечный цикл
            int friends = scanner.nextInt(); //Получаем кол-во гостей от пользователя

            if (friends > 1) {
                System.out.println(friends + " Гостей");
                break;
            }
            else if (friends==1) {
                System.out.println("нет смысла ничего считать и делить. Введите значение заново");
            }
            else  {
                System.out.println("Это некорректное значение для подсчёта, количество гостей должно быть >1 . Введите значение ");
            }
        }


        while (true){
            System.out.println("Введите название товара");
            String productName = scanner.next();

            System.out.println("Введите стоимость товара. Она должна быть в формате рубли.копейки, например 10.45 или 11.40.");
            double stoimost = scanner.nextDouble();//Double т.к. формат рубли.копейки

            calc.addItem(new Item(productName, stoimost)); //добавим товар.


            System.out.println("Добавить ещё один товар? Введите 'Завершить' если больше нет товаров для добавления");

            String question = scanner.next();

            String answer = new String ("Завершить");

            if (question == answer) {
                break;
            }
        }

        Calc calculator = new Calc(friends); //
    }
}

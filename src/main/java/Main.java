import java.util.Scanner; // Добавили ввод с клавиатуры
public class Main {
    public static int main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите на скольких человек необходимо разделить счёт");
        int friends;
        while (true) { // Запускаем бесконечный цикл
            friends = scanner.nextInt(); //Получаем кол-во гостей от пользователя
            if (friends > 1) {
                System.out.println(friends + " Гостей");
                return friends;
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

            Calc.addItem(new Item(productName, stoimost)); //добавим товар.


            System.out.println("Добавить ещё один товар? Введите 'Завершить' если больше нет товаров для добавления");

            //https://proglang.su/java/strings-equalsignorecase
            //retVal = Str1.equalsIgnoreCase(Str2);
            String question = scanner.next();
            String answer = new String ("Завершить");
            if (question.equalsIgnoreCase(answer) == true) {
                break;
            }
        }
        double itog = check / friends;

        // Классы и объекты Задача 5/5 стр9 Converter dengi = new Converter();
        Standart standart = new Standart();// Вызов конструктора с параметрами

    }
}

import java.util.Scanner; // Добавили ввод с клавиатуры
public class Main {
    public static int main(String[] args) {
        // ваш код начнется здесь
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

            сalc.addItem(new Item(productName, stoimost)); //создадим товар и применим к нему метод addItem класса Calc
            System.out.println("Добавить ещё один товар? Введите 'Завершить' если больше нет товаров для добавления");

            if (scanner.next().equalsIgnoreCase("Завершить")) {// Сравниваем что ввел пользователь с ключевым словом Завершить без учета регистра
                break;
            }
        }
        double check = Calc.getCheck();// получили общий чек с покупок
        double itog = check / friends; // делим чек на всех друзей
        Standart standart = new Standart();// Вызов конструктора с параметрами
        System.out.println(Calc.pokupki);
        System.out.println("к оплате:" + standart.round(itog) + standart.padeg(itog));
    }
}
//https://proglang.su/java/strings-equalsignorecase
//retVal = Str1.equalsIgnoreCase(Str2);
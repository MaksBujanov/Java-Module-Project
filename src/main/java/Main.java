import java.util.Scanner; // Добавили ввод с клавиатуры
public class Main {
    public static void main(String[] args) {
        // ваш код начнется здесь
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Введите на скольких человек необходимо разделить счёт");
        int friends ;
        while (true) { // Запускаем бесконечный цикл
            //доработка замечание 1 START
            //проверка на корректный ввод количества людей: 1.нечисловой ввод 2.дробное число
            if (scanner.hasNextInt()) {
                friends = scanner.nextInt(); //Получаем кол-во гостей от пользователя
                System.out.println("Хорошо");
            }else {
                System.out.println("Ошибка!!!Допустим ввод только целых чисел");
                scanner.next();
                continue;
            }
            //доработка замечание 1 END
            if (friends > 1) {
                System.out.println(friends + " Гостей");
                //return friends;
                break;
            }
            else if (friends==1) {
                System.out.println("нет смысла ничего считать и делить. Введите значение заново");
            }
            else  {
                System.out.println("Это некорректное значение для подсчёта, количество гостей должно быть >1 . Введите значение ");
            }
        }

        Calc calculate = new Calc(friends);
        double stoimost;
        while (true){
            System.out.println("Введите название товара");
            String productName = scanner.next();
            System.out.println("Введите стоимость товара. Она должна быть в формате рубли.копейки, например 10.45 или 11.40.");
            //доработка замечания 2 START 1.ввод букв в качестве стоимости 2. ввод отрицательной стоимости 3. любой некорректный ввод
            while (true) {
                if (scanner.hasNextDouble()) {
                    stoimost = scanner.nextDouble();//Double т.к. формат рубли,копейки
                    if (stoimost<0){
                        System.out.println("Ошибка!!! цена не может быть отрицательной. введите стоимость заново");
                        continue;
                    }else{
                        break;
                    }
                } else {
                    System.out.println("Ошибка!!! Допустим ввод только числа в формате рубли,копейки");
                    scanner.next();
                    continue;
                }
            }
            //доработка замечание 2 END
            calculate.addItem(new Item(productName, stoimost)); //создадим товар и применим к нему метод addItem класса Calc
            System.out.println("Добавить ещё один товар? Введите 'Завершить' если больше нет товаров для добавления");

            if (scanner.next().equalsIgnoreCase("Завершить")) {// Сравниваем что ввел пользователь с ключевым словом Завершить без учета регистра
                break;
            }
        }
        double check = Calc.getCheck();// получили общий чек с покупок
        double itog = check / friends; // делим чек на всех друзей
        Standart standart = new Standart();// Вызов конструктора с параметрами
        System.out.println(calculate.pokupki);
        System.out.println("к оплате:" + standart.round(itog) + standart.padeg(itog));
    }
}
//https://proglang.su/java/strings-equalsignorecase
//retVal = Str1.equalsIgnoreCase(Str2);
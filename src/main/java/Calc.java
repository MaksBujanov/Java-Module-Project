public class Calc {
    public static String pokupki;
    double check = 0;
    // dengi.convert(moneyBeforeSalary, currency); // Вызовите метод класса Converter
    void addItem(double stoimost, String productName){ //Передали атрибуты из Item
        check = check + stoimost;
        String pokupki = "Добавленные товары:"+ "\n" + productName;
        System.out.println(pokupki);
    }
    public double getCheck() {
        return check;
    }
}
// создание методов https://practicum.yandex.ru/learn/android-developer/courses/227fb78c-0def-4f2d-9129-dd289b3b2a28/sprints/87572/topics/5c1c6f94-f9bb-472c-8bb0-bd3011cfb402/lessons/57aa24d1-7260-4e2a-b965-4e4dd2461e73/
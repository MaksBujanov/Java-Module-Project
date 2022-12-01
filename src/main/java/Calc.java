public class Calc {
    int friends;
    Calc(int friends){
        this.friends = friends;
    }
    public static String pokupki;
    static double check = 0; //автоисправление узнать что такое static


    //void addItem(String productName, double stoimost){ //Передали атрибуты из Item
    //    check = check + stoimost;
    //    String pokupki = "Добавленные товары:"+ "\n" + productName;
    //    System.out.println(pokupki);
    //}
    void addItem(Item item){ //Передали атрибуты из Item
        check = check + item.stoimost;
        String pokupki = "Добавленные товары:"+ "\n" + item.productName;
        System.out.println(pokupki);
    }

    public static double getCheck( ) { //автоисправление узнать что такое static
        return check;
    }
}
// создание методов https://practicum.yandex.ru/learn/android-developer/courses/227fb78c-0def-4f2d-9129-dd289b3b2a28/sprints/87572/topics/5c1c6f94-f9bb-472c-8bb0-bd3011cfb402/lessons/57aa24d1-7260-4e2a-b965-4e4dd2461e73/
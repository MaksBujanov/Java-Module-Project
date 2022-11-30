public class Standart {
    String padeg (double stoimost){
        double padeg = Math.floor(stoimost);
        if (padeg == 1){
            String rubl = "рубль";
            return rubl;
        } else if (padeg == 2 || padeg == 3 || padeg == 4){
            String rubl = "рубля";
            return rubl;
        } else {
            String rubl = "рублей";
            return rubl;
        }
    }
    String round(double itog){
        return String.format("%.2f", itog);
    }
}
    //String messageTemplate = "%.2f";
    //String.format(messageTemplate, stoimost);

    // Вывод суммы, которую должен заплатить каждый человек, должен быть в формате "10.45".
    // Дробная часть не должна содержать больше двух чисел после запятой.
    //Сумма считается в рублях. Ваша задача — обработать правильный вывод. Если сумма 1.45,
    //то вы должны вывести "1.45 рубль", а если сумма будет 3.20 или 4.00,
    //вы должны вывести 3.20 рубля и 4.00 рубля.
    // Окончания в слове "рубль" должны зависеть от целочисленной части.

//https://proglang.su/java/numbers-floor
//float f1 = -0.4f;
//    float f2 = -5.75f;
//    float f3 = 3.4f;
//    float f4 = 7;
//    float f5 = -7;
//System.out.println("f1 = " + Math.floor(f1));
//System.out.println("f2 = " + Math.floor(f2));
//System.out.println("f3 = " + Math.floor(f3));
//System.out.println("f4 = " + Math.floor(f4));
//System.out.println("f5 = " + Math.floor(f5));
//f1 = -1.0
//f2 = -6.0
//f3 = 3.0
//f4 = 7.0
//f5 = -7.0
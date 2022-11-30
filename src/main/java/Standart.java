public class Standart {
    String padeg (double stoimost){
        double padeg = Math.floor(stoimost);
        if (padeg == 1){
            return "рубль";
        } else if (padeg == 2 || padeg == 3 || padeg == 4){
            return "рубля";
        } else {
            return "рублей";
        }
    }
    String round(double itog){
        return String.format("%.2f", itog);
    }
}
    // Вывод суммы, которую должен заплатить каждый человек, должен быть в формате "10.45".
    // Дробная часть не должна содержать больше двух чисел после запятой.
    //Сумма считается в рублях. Ваша задача — обработать правильный вывод. Если сумма 1.45,
    //то вы должны вывести "1.45 рубль", а если сумма будет 3.20 или 4.00,
    //вы должны вывести 3.20 рубля и 4.00 рубля.
    // Окончания в слове "рубль" должны зависеть от целочисленной части.

//https://proglang.su/java/numbers-floor
// Math.floor(f1)
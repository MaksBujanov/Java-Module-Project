public class padeg {
    double okruglenie = Math.floor( );
    if (okruglenie == 1){
        String rubl = "рубль";
        return rubl;
    } else if (okruglenie == 2 or okruglenie == 3 or okruglenie == 4){ // посмотреть как пишется или
        String rubl = "рубля";
        return rubl;
    } else {
        String rubl = "рублей";
        return rubl;
    }
}
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
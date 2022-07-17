public class Araba {

 /*
  Java'da her class olusturdugumuzda
 //  Java o class'dan ileride objeler uretmek gerekecegini bilir
 //  ve biz ozellikle belirtmesek bile Java
 // her olusturdugu class'a bir constructer koyar
 */

public Araba() {
    System.out.println("parametresiz consructer calisti");

}
    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");
    }
    public Araba(int yil, String renk){
        System.out.println(yil+ " model "+renk + " renkli bir arac uretildi");
    }
}



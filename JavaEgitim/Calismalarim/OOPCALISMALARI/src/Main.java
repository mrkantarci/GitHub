public class Main {
    public static void main(String[] args) {
/*Person person = new Person();
person.setName("Ferit");
person.setSurname("Kantarci");
person.setAge(39);

        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

     */
    int sayi=1;
    Ogrenci ferit = new Ogrenci(953,"kantarci ferit" , (byte)11 , true);

        ferit.ogrenciBilgileriniYazdir();



        Ogrenci ayse = new Ogrenci(500,"ayse yilmaz", (byte) 5, true);
ayse.ogrenciBilgileriniYazdir();

    }
}
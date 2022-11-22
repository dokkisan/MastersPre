package week4.mission1.genericinheritance;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(plasticPrinter);

        // 오류 코드
//        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
//        waterPrinter.setMaterial(new Water());
//        Water water = waterPrinter.getMaterial(); // 형변환 하지 않음
//        System.out.println(waterPrinter);
    }
}

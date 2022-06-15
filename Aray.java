public class Aray {
    public static void main(String[] args) {
        int[] nomor = {
                82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32};
        for (int x = 0; x <12; x++){
            if (nomor[x] % 2 != 0) {

                System.out.print("\n Bilangan Yang Ganjil adalah\t" + nomor[x]);
            }
        }
    }
}
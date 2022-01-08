public class operadores_relacionais {

    public static void main(String[] args){

        System.out.println("Mesmo tipo:");
        mesmoTipo();
        System.out.println("=======================");
        System.out.println("Tipos Diferentes");
        tiposDiferentes();

    }

    private static void mesmoTipo() {

        byte b1 = 127, b2 = 53;
        short s1 = 10542, s2 = 30793;
        int i1 = 754125, i2 = 3198752;
        long l1 = 816235481, l2 = 51237895;
        float f1 = 8.52340F, f2 = 8.5234F;
        double d1 = 52.452368215D, d2 = 785.254D;
        char c1 = 'M', c2 = 'F';
        String x1 = "Hello world", x2 = "First test!";

        boolean br = b1 >= b2,
                sr = s1 == s2,
                ir = i1 <= i2,
                lr = l1 != l2,
                fr = f1 > f2,
                dr = d1 < d2,
                cr = c1 != c2,
                xr = x1 == x2;

        System.out.println("b1 >= b2: " + br);
        System.out.println("s1 == s2: " + sr);
        System.out.println("i1 <= i2: " + ir);
        System.out.println("l1 != l2: " + lr);
        System.out.println("f1 > f2: " + fr);
        System.out.println("d1 < d2: " + dr);
        System.out.println("c1 != c2: " + cr);
        System.out.println("x1 == x2: " + xr);

    }

    private static void tiposDiferentes() {

        byte b1 = 127, b2 = 53;
        short s1 = 10542, s2 = 30793;
        int i1 = 754125, i2 = 3198752;
        long l1 = 816235481, l2 = 51237895;
        float f1 = 8.52340F, f2 = 8.5234F;
        double d1 = 52.452368215D, d2 = 785.254D;

        boolean blr = b1 >= l2,
                sfr = s1 == f2,
                ibr = i1 <= b2,
                ldr = l1 != d2,
                fir = f1 > i2,
                dsr = d1 < s2;

        System.out.println("b1 >= l2: " + blr);
        System.out.println("s1 == f2: " + sfr);
        System.out.println("i1 <= b2: " + ibr);
        System.out.println("l1 != d2: " + ldr);
        System.out.println("f1 > i2: " + fir);
        System.out.println("d1 < s2: " + dsr);

    }

}

public class operadoresLogicos {

    public static void main(String[] args){

        System.out.println("===== Comparação Tipo Boolean =====");
        comparacaoTipoBoolean();
        System.out.println(" ");
        System.out.println("===== Comparação Tipos Diferentes =====");
        comparacaoTipoDiferente();
        System.out.println(" ");
        System.out.println("===== Recebe Auxílio =====");
        recebeAuxilio();

    }

    private static void comparacaoTipoBoolean() {

        boolean a = true, b = false;

        System.out.println("==========  and(e)  ==========");
        System.out.println("a && a: " + (a && a));
        System.out.println("a && b: " + (a && b));
        System.out.println("b && a: " + (b && a));
        System.out.println("b && b: " + (b && b));
        System.out.println("==========  or(ou)  ==========");
        System.out.println("a || a: " + (a || a));
        System.out.println("a || b: " + (a || b));
        System.out.println("b || a: " + (b || a));
        System.out.println("b || b: " + (b || b));
        System.out.println("==========   xor    ==========");
        System.out.println("a ^ a: " + (a ^ a));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("b ^ a: " + (b ^ a));
        System.out.println("b ^ b: " + (b ^ b));
        System.out.println("========== inversão ==========");
        System.out.println("a: " + !a);
        System.out.println("b: " + !b);

    }

    private static void comparacaoTipoDiferente(){

        int i1 = 87, i2 = 35;
        float f1 = 1.87F, f2 = 87.42F;
        char c1 = 'F', c2 = 'M';
        String s1 = "Hi", s2 = "By";

        boolean r1 = (i1 < f2) && (c1 != c2),
                r2 = (f1 >= i2) && (c1 == c2),
                r3 = (f1 != f2) ^ (s1 != s2),
                r4 = !(i1 <= i2);

        System.out.println("(i1 < f2) && (c1 != c2): " + r1);
        System.out.println("(f1 >= i2) || (c1 == c2): " + r2);
        System.out.println("(f1 != f2) ^ (s1 != s2): " + r3);
        System.out.println("!(i1 <= i2): " + r4);

    }

    private static void recebeAuxilio() {

        double salarioMensal = 12320.50d, mediaSalario = 9500d;
        int quantidadeDependentes = 3, mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario,
                muitosDependentes = quantidadeDependentes > mediaDependentes;
        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe auxílio? " + recebeAuxilio);

    }

}

package main.java.net.proselyte.chapter04;

// Применение сдвига влево в качестве быстрого способа умножения на 2
class MultByTwo {
    public static void main (String args[]) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}

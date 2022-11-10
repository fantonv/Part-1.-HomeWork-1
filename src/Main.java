public class Main {
    public static void main(String[] args) {
        //task 1
        for (int i = 0; i <= 10; i++){
            System.out.println("Итерация цикла " + i);
        }

        //task 2
        for (int p = 10; p > 0; p--){
            System.out.println("Итерация цикла два " + p);
        }

        //task 3
        for (int u = 2; u <= 17; u = u +2){
            System.out.println("Четная цифра " + u);
        }

        //tack 4
        for (int y = 10; y >= -10; y--){
            System.out.println("Вывод чисел " + y);
        }

        //task 5
        for (int t = 1904; t <= 2096; t = t + 4){
            System.out.println(t + " год является высокосным");
        }

        //task 6
        for (int r = 7; r <= 98; r = r + 7){
            System.out.println("Число из задания шесть " + r);
        }

        //task 7
        for (int e = 1; e <= 512; e = e * 2){
            System.out.println("Число из задания семь " + e);
        }

        //task 8
        int monthMoney = 29000;
        int total = 0;
        for (int w = 1; w <= 12; w++){
            total = total + monthMoney;
            System.out.println("Месяц " + w + ", сумма накоплений равна " + total + " рублей");
        }

        //task 9
        int monthMoney_2 = 29000;
        int total_2 = 0;
        for (int w = 1; w <= 12; w++){
            monthMoney_2 = monthMoney_2 + monthMoney_2 / 100;
            total_2 = total_2 + monthMoney_2;
            System.out.println("Месяц " + w + ", сумма накоплений равна " + total_2 + " рублей");
        }
    }
}
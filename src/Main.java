public class Main {
    public static void main(String[] args) {

//        task1
        byte byte1 = 0;
        int int1 = 46;
        short short1 = -10;
        long  long1 = 123123131;
        float float1 = 5.542f;
        double double1 = 5.65756767;
        System.out.println("Значение переменной byte1 с типом byte равно " + byte1);
        System.out.println("Значение переменной int1 с типом int равно " + int1);
        System.out.println("Значение переменной short1 с типом short равно " + short1);
        System.out.println("Значение переменной long1 с типом long равно " + long1);
        System.out.println("Значение переменной float1 с типом float равно " + float1);
        System.out.println("Значение переменной double1 с типом double равно " + double1);

//        task 2
        float float2 = 27.12f;
        long long2 = 987678965549L;
        double double2 = 2.786;
        char char2 =  569;
        short short2 = -159;
        int int2 = 27897;
        byte byte2 = 67;

//        task 3
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        System.out.println("На каждого ученика рассчитано " + (480 / (teacher1 + teacher2 + teacher3)) + " листов бумаги");

//        task 4
        short short3 = 20;
        char char3 = 24 * 60;
        char char4 = 3 * 24 * 60;
        int int3 = 30 * 24 * 60;
        System.out.println("За 20 минут машина произвела " + (8 * short3) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (8 * char3) +" штук бутылок");
        System.out.println("За 3 дня машина произвела " + (8 * char4) +" штук бутылок");
        System.out.println("За месяц машина произвела " + (8 * int3) + " штук бутылок");

//        task 5
        System.out.println("В школе, где 20 классов, нужно 40 банок белой краски и 80 банок коричневой краски");

//        task 6
        byte banan = 5;
        char milk = 200;
        byte iceCream = 2;
        byte egg = 4;
        double allWeight =  0;
        allWeight = banan * 80 + milk * 1.05 + iceCream * 100 + egg * 70;
        System.out.println("Коктейль имеет массу " + allWeight + " грамм" + " или " + allWeight / 1000 + "кг");

//        task 7
        byte allMass = 7;
        char day1 = 250;
        char day2 = 500;
        int dayMiddle = ((allMass * 1000 / day1) + (allMass * 1000 / day2)) / 2;
        System.out.println("Если худеть каждый день по 250 грамм, то на это уйдет " +allMass * 1000 / day1 + " дней");
        System.out.println("Если худеть каждый день по 500 грамм, то на это уйдет " +allMass * 1000 / day2 + " дней");
        System.out.println("Если худеть каждый день от 250 грамм до 500 грамм, то на это уйдет " + dayMiddle + " дней");

//        task 8
        int moneyMasha = 67760;
        int moneyDenis = 83690;
        int moneyKris = 76230;
        System.out.println("Маша теперь получает " + moneyMasha * 1.1 + " рублей. Годовой доход вырос на " + (moneyMasha * 1.1 - moneyMasha) * 12 + " рублей");
        System.out.println("Денис теперь получает " + moneyDenis * 1.1 + " рублей. Годовой доход вырос на " + (moneyDenis * 1.1 - moneyDenis) * 12 + " рублей");
        System.out.println("Кристина теперь получает " + moneyKris * 1.1 + " рублей. Годовой доход вырос на " + (moneyKris * 1.1 - moneyKris) * 12 + " рублей");


    }
}
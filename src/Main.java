//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача 1
//Объявите переменные типа int, byte, short, long, float, double.
//Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
//Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».

        byte a = 127;
        short b = 32_767;
        int c = 2_147_483_647;
        long d = 96L;
        float e = 3.4E+38F;
        double f = 1.7E+308;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        //Задача 2
        //Инициализируйте переменные, используйте изученные ранее типы переменных.

        float eE = 27.12F;
        long dD = 987_678_965_549L;
        double fF = 2.786;
        short bBBB = 569;
        short bB = -159;
        short bBB = 27897;
        byte aA = 67;

    //Задача 3
        //Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //У Людмилы Павловны — 23 ученика
        // Анны Сергеевны — 27 учеников,
        // Екатерины Андреевны — 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        // Посчитайте, сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        //Для объявления переменных не используйте тип var.

        byte schoolP = 23;
        byte schoolAS = 27;
        byte schoolEA = 30;
        int schoolBoy = schoolAS + schoolEA + schoolP;
        short paper = 480;
        float paperInd = (paper/schoolBoy);
        System.out.println("На каждого ученика рассчитано " + paperInd + " листов бумаги");

        //Задача 4
        //Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        //Какая производительность машины будет:
        //за 20 минут,
        //в сутки,
        //за 3 дня,
        //за 1 месяц?
        //Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        //Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        //Для объявления переменных не используйте тип var.

        byte botle = 16;
        byte time2 = 2;
        int botle1 = botle /time2;
        int time20 = botle/2*20;
        int time24Hours = 24*6*botle1;
        int time3Days = time24Hours*3;
        int time30Days = time3Days*10;
        System.out.println("За 20 минут машина произвела " +time20+ " штук бутылок");
        System.out.println("За 24 часа машина произвела " +time24Hours+ " штук бутылок");
        System.out.println("За 3 дня машина произвела " +time3Days+ " штук бутылок");
        System.out.println("За 30 дней машина произвела " +time30Days+ " штук бутылок");

        //Задача 5
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски.
        // Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        //Для объявления переменных не используйте тип var.

        byte paintOverall = 120;
        byte paintWhite1 = 2;
        byte paintBrown1 = 4;
        int class1 = paintOverall/(paintBrown1+paintWhite1);
        int paintWhite = paintWhite1*class1;
        int paintBrown = paintOverall-paintWhite;
        System.out.println("В школе, где " +class1+ " классов, нужно " +paintWhite+ " банок белой краски и " +paintBrown+ " банок коричневой краски");

        //Задача 6
        //Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        //Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        // Бананы — 5 штук (1 банан — 80 грамм).
        // Молоко — 200 мл (100 мл = 105 грамм).
        // Мороженое-пломбир — 2 брикета по 100 грамм.
        // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        //Смешать всё в блендере — и готово.
        //Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        //Результат в граммах и килограммах напечатайте в консоль.

        short banan5 = 5*80;
        short milk200= 2*105;
        short iceCream2 = 2*100;
        short eggs4 = 4*70;
        int gramm = banan5+milk200+iceCream2+eggs4;
        float kGramm = gramm/1000F;
        System.out.println(gramm+ " грамм");
        System.out.println(kGramm+ " киллограмм");

        //Задача 7??
        //Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //Результаты всех подсчетов выведите в консоль.

        short wtLose = 7000;
        short wtMin = 250;
        short wtMax = 500;
        int wtAverage = (wtMin+wtMax)/2;
        double dayAverage = wtLose/wtAverage;
        int day250 = wtLose/wtMin;
        int day500 = wtLose/wtMax;
        System.out.println(dayAverage);
        System.out.println(day250);
        System.out.println(day500);

        //Задача 8
        //Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        //В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        //Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        //Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //Каждому нужно увеличить зарплату на 10% от текущей месячной.
        //Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        //Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        // Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».

        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryCristina = 76_230;
        double boostMasha = salaryMasha*1.1;
        double riseMasha = boostMasha*12-salaryMasha*12;
        System.out.println("Маша теперь получает " +boostMasha+ " рублей. Годовой доход вырос на " +riseMasha+ " рублей");
        double boostDenis = salaryDenis*0.1+salaryDenis;
        double riseDenis = boostDenis*12-salaryDenis*12;
        System.out.println("Денис теперь получает " +boostDenis+ " рублей. Годовой доход вырос на " +riseDenis+ " рублей");
        double boostCristina = salaryCristina*1.1;
        double riseCristina = boostCristina*12-salaryCristina*12;
        System.out.println("Кристина теперь получает " +boostCristina+ " рублей. Годовой доход вырос на " +riseCristina+ " рублей");

    }

}
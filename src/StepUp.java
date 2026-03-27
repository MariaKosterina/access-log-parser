public class StepUp {
    public static int counter = 0;
    public static int summ = 5; //Инициировала переменную сразу с присвоением ей первого числа для сложения
    public static void main(String[] args) {
        //Для задания 1
        // Согласно заданию: при выводе результата необходимо обеспечить точность вычислений - три знака после запятой
        System.out.println(String.format("%.3f", fraction(5.3)));
        System.out.println(String.format("%.3f", fraction(15.25615634153)));
        System.out.println(String.format("%.3f", fraction(15.5555)));
        System.out.println(String.format("%.3f", fraction(1.1)));
        System.out.println(String.format("%.3f", fraction(0.02)));
        //Для задания 2
        System.out.println(sumLastNums(4568)); //Проверим что число из примера задания выдаст ожидаемый результат
        System.out.println(sumLastNums(123)); //Проверим на трехзначном числе
        System.out.println(sumLastNums(86)); //Проверим на двухзначном числе
        System.out.println(sumLastNums(5)); //Проверим на одном числе, что бы убедиться что программа не "сломается" - результат будет 5(ожидаемо, т.к. 0+5=5)
        //Для задания 3
        //Проверяем вывод всех возможных вариантов
        System.out.println(charToNum('0'));
        System.out.println(charToNum('1'));
        System.out.println(charToNum('2'));
        System.out.println(charToNum('3'));
        System.out.println(charToNum('4'));
        System.out.println(charToNum('5'));
        System.out.println(charToNum('6'));
        System.out.println(charToNum('7'));
        System.out.println(charToNum('8'));
        System.out.println(charToNum('9'));
        //Для задания 4
        System.out.println(isPositive(100)); //Проверяем положительное трехзначное
        System.out.println(isPositive(11)); //Проверяем положительное двухзначное
        System.out.println(isPositive(1)); //Проверяем положительное однозначное, близкое к нулю
        System.out.println(isPositive(0)); //Проверяем 0 - метод вернет true, т.к. в условии вызываемого метода "больше или равно", если строгое неравенство будет, то метод вернёт false
        System.out.println(isPositive(-1)); //Проверяем отрицательное число
        //Для задания 5
        //Поочередная проверка чисел. True вернется только в строке с числом 12, в остальном false.
        System.out.println(is2Digits(100));
        System.out.println(is2Digits(4534));
        System.out.println(is2Digits(12));
        System.out.println(is2Digits(1));
        System.out.println(is2Digits(0));
        //Для задания 6
        //Проверка разных символов
        System.out.println(isUpperCase('D'));
        System.out.println(isUpperCase('q'));
        System.out.println(isUpperCase('1'));
        System.out.println(isUpperCase('A'));
        System.out.println(isUpperCase('Z'));
        //Для задания 7
        //Проверка попадание/не попадания num в разные диапазоны
        System.out.println(isInRange(15,5,15));
        System.out.println(isInRange(15,5,16));
        System.out.println(isInRange(3,6,4));
        System.out.println(isInRange(3,5,1));
        //Для задания 8
        //Проверка на числах делящихся без остатка и с остатком
        System.out.println(isDivisor(2,5));
        System.out.println(isDivisor(5,2));
        System.out.println(isDivisor(3,9));
        System.out.println(isDivisor(12,3));
        //Для задания 9
        System.out.println(isEqual(1,2,3)); //Проверка когда все числа разные
        System.out.println(isEqual(1,1,2)); //Проверка когда равны только два из трех
        System.out.println(isEqual(5,5,5)); //Проверка когда все числа равны между собой
        //Для задания 10
        System.out.println(summ+"+"+"11 это "+lastNumSum(summ,11)); //Здесь summ имеет заданное значение = 5
        System.out.println(summ+"+"+"123 это "+lastNumSum(summ,123)); // Здесь и далее summ равно результату предыдущего выполнения метода
        System.out.println(summ+"+"+"14 это "+lastNumSum(summ,14));
        System.out.println(summ+"+"+"1 это "+lastNumSum(summ,1));
        System.out.println("Итого " + summ); //Вывод последнего результата выполнения метода
        System.out.println("Количество вызовов метода " + summ); //Это дополнительно получилось)
    }
    //Задание по разделу 4, Часть 1: Классы и методы #1
    public static double fraction(double x){
        return (x-(int)x); //Или return (x%1); т.е. остаток от деления на 1 это будет дробная часть в данном случае
    }
    //Задание по разделу 4, Часть 1: Классы и методы #2
    public static int sumLastNums(int x){
        int findBeforeLastNum = (x%100)/10; //Ищем первую цифру в паре двух последних знаков получаемого числа (т.е. предпоследний знак от заданного),
        // т.е. например 4568%100 - остаток от деления на 100 будет равен 68. И далее путем деления на 10 (68/10) получаем целую часть от деления, т.е. 6
        int findLastNum = x%10; //Ищем последнюю цифру заданного числа: берем остаток от деления на 10, для числа 4568 это будет цифра 8
        return (findBeforeLastNum + findLastNum); //Возвращаем сумму наёденных чисел
    }
    //Задание по разделу 4, Часть 1: Классы и методы #3
    public static int charToNum(char x){
        return ((int)x - 48); //Сразу возвращаем значение. Т.к. коды цифр так же идут последовательно, как и сами цифры,
        // а 0 это 48, то получив код цифры 1 равный 49, можно получить нужную цифру если вычесть 48 и т.д
    }
    //Задание по разделу 4, Часть 1: Классы и методы #4
    public static boolean isPositive(int x){
        return (x>=0); //Сразу возвращаем значение с проверкой, что полученное число больше 0
    }
    //Задание по разделу 4, Часть 1: Классы и методы #5
    public static boolean is2Digits(int x){
        return ((x/100)==0) && ((x/10)>0);  //Первое выражение означает что мы делим на 100 и, зная что это тип int,
        // понимаем, что при делении отбросится дробная часть, тогда если число двузначное, то результат будет 0
        // Второе выражение делает проверку на то что число состоит не из одного знака: по такому же принципу делим на 0 и ожидаем, что остаток от деления будет больше 0
        //"И" между выражениями ставит строгое условие: метод вернет true, если оба выражения будут true
    }
    //Задание по разделу 4, Часть 1: Классы и методы #6
    public static boolean isUpperCase(char x){
        return ('A'<=x) && (x<='Z'); //Первое выражение проверяет, что полученный символ больше или равен(т.е. включая эту границу) 'A' - верхней границе диапазона
        //Второе выражение проверяет, что полученный символ меньше или равен(т.е. включая эту границу) 'Z' - нижней границе диапазона
        //"И" между выражениями ставит строгое условие: метод вернет true, если оба выражения будут true
    }
    //Задание по разделу 4, Часть 1: Классы и методы #7
    public static boolean isInRange(int a, int b, int num){
        return (a<=num && num<=b) || (b<=num && num<=a); //Вернет true если одно из выражений в скобках (либо левое, либо правое) вернет true - знак логического "ИЛИ"
        //Каждое из выражений в скобках в свою очередь делает проверку на принадлежность полученного значения к указанному диапазону: либо с a по b, либо с b по a,
        // т.к. нет жесткой привязанности к тому какое число больше a или b
    }
    //Задание по разделу 4, Часть 1: Классы и методы #8
    public static boolean isDivisor(int a, int b){
        return (a%b)==0 || (b%a)==0; //Вернет true если одно из выражений (либо левое, либо правое) вернет true - знак логического "ИЛИ"
        //Левое выражение проверяет, делится ли без остатка a на b. Правое - делится ли b на a без остатка.
    }
    //Задание по разделу 4, Часть 1: Классы и методы #9
    public static boolean isEqual(int a, int b, int c){
        return (a==b) && (b==c) && (c==a); //Вернет true если каждое из выражений будет true, т.е. все числа между собой равны
    }
    //Задание по разделу 4, Часть 1: Классы и методы #10
    public static int lastNumSum(int a,int b){
        ++counter; //Почему-то сначала подумала, что в ответе примера "Итого 4" 4 - это количество выполнений метода, поэтому добавила переменную счетчик и сделала подсчет. Понятно, что это не нужно, но решила оставить
        summ = (a%10) + (b%10); //Объявила переменную внутри класса, чтобы к ней был доступ из любого метода. Записала результат, что бы использовать при последующем выполнении.
        return summ;
    }

}

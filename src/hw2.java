public class hw2 {
    public static void main(String[] args) {
    // Задача №1
        byte friend = 25;
        short tea = 10;
        int coffee = 8;
        long people = 1000L;
        float tickets = 5.62f;
        double table = 3.5678;
        int ageFriend = 25;
        boolean FriendIsAdult = friend > 21;
        System.out.println(FriendIsAdult);

        char a = 65;
        char b = 'A';
        char c = 36;
        char d = '$';
        System.out.println(b);
        System.out.println(c);
        System.out.println(a + " = " + b);
        System.out.println(c + " = " + d);

        // Задача 2
        double WeightOneBoxer = 78.2;
        double WeiightTwoBoxer = 82.7;
        double WeightAllBoxersSum = WeightOneBoxer + WeiightTwoBoxer;
        double WeightAllBoxersDifference = WeiightTwoBoxer - WeightOneBoxer;
        System.out.println("Sum Weights of Two Boxers " + WeightAllBoxersSum + " kg");
        System.out.println("Difference Weights of Two Boxers " + WeightAllBoxersDifference + " kg");

        // Задача 3
        int bananas = 5;
        int milk = 200;
        int iceCreamPlombir = 2;
        int eggs = 4;
        double WeightBreakfestGr = (bananas * 80) + (milk * 1.05) + (iceCreamPlombir * 100) + (eggs * 70);
        System.out.println("Weight Breakfest in grams " + WeightBreakfestGr);
        double WeightBreakfestKg = WeightBreakfestGr * 0.001;
        System.out.println("Weight Breakfest in kg " + WeightBreakfestKg);

        // Задача 4
        int WeightStart = 100;
        int WeightFinish = 93;
        int WeightDifference = WeightStart - WeightFinish;
        double Days250 = WeightDifference / 0.25;
        double Days500 = WeightDifference / 0.5;
        System.out.println("Days gone if 250 Gr " + Days250);
        System.out.println("Days gone if 500 Gr " + Days500);
        double DaysMiddle = WeightDifference + (Days500 % Days250);
        System.out.println("Days middle gone is " + DaysMiddle);

        // Задача 5
        int MashaZp = 67_670;
        int DenisZp = 83_690;
        int ChristinaZp = 76_230;
        float MashaPastYearZp = MashaZp * 12;
        float DenisPastYearZp = DenisZp * 12;
        float ChristinaPastYearZp = ChristinaZp * 12;
        float MashaZpUp = MashaZp * 1.1f;
        float DenisZpUp = DenisZp * 1.1f;
        float ChristinaZpUp = ChristinaZp * 1.1f;
        float MashaZpUpYear = MashaZpUp * 12;
        float DenisZpUpYear = DenisZpUp * 12;
        float ChristinaZpUpYear = ChristinaZpUp *12;
        System.out.println("Masha's salary in new year is " + MashaZpUp + " dollars.");
        System.out.println("Masha's Salary up on new year " + (MashaZpUpYear - MashaPastYearZp) + " dollars");
        System.out.println("Denis salary in new year is " + DenisZpUp + " dollars.");
        System.out.println("Denis Salary up on new year " + (DenisZpUpYear - DenisPastYearZp) + " dollars");
        System.out.println("Christina salary in new year is " + ChristinaZpUp + " dollars.");
        System.out.println("Christina Salary up on new year " + (ChristinaZpUpYear - ChristinaPastYearZp) + " dollars");






    }
}

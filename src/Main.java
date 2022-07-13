public class Main {
    public static void main(String[] args) {

        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Can also put " + capacityLeft + " kg stuff");

        var applesWeight = 2;
        var orangeWeight = 3;
        var fruitWeight = applesWeight + orangeWeight;
        System.out.println("Total fruit weight " + fruitWeight + " kg");

        var meatWeight =4;
        var waterWeight = 5;
        var tomatoWeight = 2;
        var cucumberWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegatablesWeight = tomatoWeight + cucumberWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegatablesWeight + waterWeight + meatWeight;
        System.out.println("Total products weight " + productsWeight + " kg!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("There were places " + leftWeight + " kg!");

        productsWeight = productsWeight * 2;
        System.out.println("Now produsts weight " + productsWeight + " kg");
        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("There were places " + leftWeight + " kg!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Overload on the " + overload + " kg!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Products in one car now " + productsInOneCar + " kg");

        byte lesson = 8;
        short course = 9;
        int profession = 11;
        long year = 365L;

        short bananas = 200;
        System.out.println("Bananas " + bananas + " kg");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("One portion sugar weight " + onePortion + " kg");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b +c;
        System.out.println(d);

        float g = a +1f;
        System.out.println(g);

        char x = 33;
        char y = '!';
        System.out.println(x + " = " + y);


    }
};
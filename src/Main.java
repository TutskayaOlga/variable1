public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        var dog1 = dog - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("Задание2");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задание3");
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        var totalWeight = firstWeight + secondWeight;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг!");
        var differenceWeight = firstWeight - secondWeight;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг!");
        var difference1Weight = secondWeight - firstWeight;
        System.out.println("Второй спортсмен весит больше первого на " + difference1Weight + " кг!");
        var overLoad = secondWeight % firstWeight;
        System.out.println("Разница между весами бойцов " + overLoad + " кг!");
        var hoursStaff = 640;
        var numberStaff = hoursStaff / 8;
        System.out.println("Всего работников в компании – " + numberStaff + " человек!");
        var number1Staff = numberStaff + 94;
        var hours1Staff = 640 / number1Staff;
        System.out.println("Если в компании работает " + number1Staff + " человека, то всего " + hours1Staff + " часа работы может быть поделено между сотрудниками");



    }
}
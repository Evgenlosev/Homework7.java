package Java2.HomeWork1;

public class Main {
    public static void main(String[] args) {

        //Задание 3
        System.out.println("Задание 3");
        Participant[] participants = new Participant[3];
        participants[0] = new Human("Вася");
        participants[1] = new Robot("Валли");
        participants[2] = new Cat("Барсик");

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Treadmill();
        obstacles[1] = new Wall();

        for (Participant p : participants){
            for (Obstacle o : obstacles){
                p.overcameObstacle(o);
            }
        }


        //Задание 4
        System.out.println();
        System.out.println("Задание 4");
        Participant[] participants2 = new Participant[3];
        participants2[0] = new Human("Олег", 10_000, 100);
        participants2[1] = new Robot("Гарольд", 1000, 20);
        participants2[2] = new Cat("Витька", 200, 120);

        Obstacle[] obstaclesСourse = new Obstacle[6];
        obstaclesСourse[0] = new Treadmill(100);
        obstaclesСourse[1] = new Wall(10);
        obstaclesСourse[2] = new Treadmill(750);
        obstaclesСourse[3] = new Wall(50);
        obstaclesСourse[4] = new Treadmill(3000);
        obstaclesСourse[5] = new Wall(100);

        for (Participant p : participants2){
            for (Obstacle o : obstaclesСourse){
                if (p.overcameObstacle2(o)) {
                    continue;
                }else break;
            }
        }
    }
}

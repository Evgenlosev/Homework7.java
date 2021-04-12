package Java2.HomeWork1;

public class Robot implements Participant {
    private String name;
    int max_run;
    int max_jump;

    public Robot(String name) {
        this.name = name;
    }

    public Robot(String name, int max_run, int max_jump) {
        this.name = name;
        this.max_run = max_run;
        this.max_jump = max_jump;
    }


    @Override
    public void run() {
        System.out.println(name + " пробежал дистанцию");
    }

    @Override
    public void jump() {
        System.out.println(name + " подпрыгнул");
    }

    @Override
    public void overcameObstacle(Obstacle o) {
        if (o instanceof Treadmill) {
            System.out.println("Робот " + name + " пробежал по беговой дорожке");
        } else if (o instanceof Wall) {
            System.out.println("Робот " + name + " перепрыгнул через стену");
        }
    }

    @Override
    public boolean overcameObstacle2(Obstacle o) {
        if (o instanceof Treadmill) {
            if (max_run >= ((Treadmill) o).dist) {
                System.out.println("Робот " + name + " успешно пробежал " + ((Treadmill) o).dist + " метров");
                return true;
            } else {
                System.out.println("Робот " + name + " не смог пробежать " + ((Treadmill) o).dist + " метров");
                return false;
            }
        } else if (o instanceof Wall) {
            if (max_jump >= ((Wall) o).height) {
                System.out.println("Робот " + name + " успешно перепрыгнул стену высотой "
                        + ((Wall) o).height + " сантиметров");
                return true;
            } else {
                System.out.println("Робот " + name + " не смог перепрыгнуть стену высотой "
                        + ((Wall) o).height + " сантиметров");
                return false;
            }
        }
        return false;
    }
}

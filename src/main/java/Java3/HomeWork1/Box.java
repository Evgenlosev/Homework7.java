package Java3.HomeWork1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public Box() {
    }

    public void addFruit(T fruit){
        box.add(fruit);
    }

    public float getWeight(){
        float weight = 0;
        if (box.size() == 0) {
            return 0.0f;
        }
        if (box.get(0) instanceof Apple) {
            weight = box.size() * 1.0f;
        }
        if (box.get(0) instanceof Orange) {
            weight = box.size() * 1.5f;
        }
        return weight;
    }

    public boolean compare(Box<?> box2) {
        if (this.getWeight() == box2.getWeight()){
            return true;
        } else {
            return false;
        }
    }

    public void pour(Box <T> box2) {
        for (T fruit: this.box) {
            box2.addFruit(fruit);
        }
        this.box.clear();
    }
}

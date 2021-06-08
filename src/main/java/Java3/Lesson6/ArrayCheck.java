package Java3.Lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCheck {

    public int [] search4InArray(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 4) {
               index = i;
           }
        }
        if (index == -1) {
            throw new RuntimeException();
        }
        int [] arr2 = new int[arr.length - index - 1];
        for (int i = index, j = 0; j < arr2.length; i++, j++) {
            arr2[j] = arr[i + 1];
        }
        return arr2;
    }

    public boolean checkArr (int [] arr) {
        boolean check1 = false, check4 = false, checkAnother = false;
        for (int i: arr) {
            if (i == 1) check1 = true;
            else if (i == 4) check4 = true;
            else checkAnother = true;
        }
        if(check1 && check4 && !checkAnother) {
            return true;
        } else return false;
    }

}

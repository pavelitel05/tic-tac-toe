package Java;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private List<String[]> area = new ArrayList<>();

    public void initArea(){
        String[] rowOne = new String[3];
        String[] rowTwo = new String[3];
        String[] rowThree = new String[3];
        area.add(rowOne);
        area.add(rowTwo);
        area.add(rowThree);
        for(int row = 0; row < 3; row ++){
            for(int column = 0; column < 3; column ++){
                this.area.get(row)[column] = " ";
            }
        }

    }

    public void setArea(List<String[]> area) {
        this.area = area;
    }

    public List<String[]> getArea(){
        return this.area;
    }
}

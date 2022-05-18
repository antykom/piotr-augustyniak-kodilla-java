package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figureList = new ArrayList<>();

    public void addFigure(Shape shape){
        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(figureList.contains(shape)){
            figureList.remove(shape);
            result = true;
        }

        return result;
    }

    public Shape getFigure(int n){
        Shape shape = null;
        if(figureList.get(n) != null){
            shape = figureList.get(n);
        }
        return shape;
    }

    public String showFigures(){
        String allFigures = "";
        for (Shape shape : figureList) {
            allFigures += shape.toString();
        }
        return allFigures;
    }

    public List<Shape> getFigureList() {

        return figureList;
    }

}

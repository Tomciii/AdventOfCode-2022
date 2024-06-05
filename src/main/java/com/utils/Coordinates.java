package com.utils;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {

    public int getSize() {
        return size;
    }

    private int size;
    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    private List<Coordinate> coordinates;

    public Coordinates(int amountOfCoordinates){

        coordinates = new ArrayList<>();
        size = amountOfCoordinates;
        for (int i = 0; i < amountOfCoordinates; i++){
            coordinates.add(new Coordinate(0,0));
        }
    }

    public void moveHeader(String direction) {

            switch (direction) {
                case "U":
                    this.getCoordinates().get(0).setY(this.getCoordinates().get(0).getY() - 1);
                    break;
                case "R":
                    this.getCoordinates().get(0).setX(this.getCoordinates().get(0).getX() + 1);
                    break;
                case "L":
                    this.getCoordinates().get(0).setX(this.getCoordinates().get(0).getX() - 1);
                    break;
                case "D":
                    this.getCoordinates().get(0).setY(this.getCoordinates().get(0).getY() + 1);
                    break;
        }
    }
    public String getLastCoordinate(){
        return this.coordinates.get(this.coordinates.size() - 1).toString();
    }

    public void moveTail() {
        for (int i = 1; i < this.coordinates.size(); i++){
            Coordinate previous = this.coordinates.get(i- 1);
            Coordinate current = this.coordinates.get(i);

            if (this.isValidMove(previous,current)){
                this.makeMove(previous, current);
            }
        }
    }

    private void makeMove(Coordinate previous, Coordinate current) {

        if (previous.getY() == current.getY() - 2){
            current.setY(current.getY() - 1);

            if (previous.getX() == current.getX() - 1){
                current.setX(current.getX() - 1);
            } else if (previous.getX() == current.getX() + 1){
                current.setX(current.getX() + 1);
            }
        }else if (previous.getY() == current.getY() + 2){
            current.setY(current.getY() + 1);

            if (previous.getX() == current.getX() - 1){
                current.setX(current.getX() - 1);
            } else if (previous.getX() == current.getX() + 1){
                current.setX(current.getX() + 1);
            }
        }else if (previous.getX() == current.getX() - 2){
            current.setX(current.getX() - 1);

            if (previous.getY() == current.getY() - 1){
                current.setY(current.getY() - 1);
            } else if (previous.getY() == current.getY() + 1){
                current.setY(current.getY() + 1);
            }
        } else if (previous.getX() == current.getX() + 2){
            current.setX(current.getX() + 1);

            if (previous.getY() == current.getY() - 1){
                current.setY(current.getY() - 1);
            } else if (previous.getY() == current.getY() + 1){
                current.setY(current.getY() + 1);
            }
        }

    }

    private boolean isValidMove(Coordinate previous, Coordinate current){

        if (previous.getY() == current.getY() || previous.getY() == current.getY() - 1 || previous.getY() == current.getY() + 1){
            if (previous.getX() == current.getX() - 1 || previous.getX() == current.getX() || previous.getX() == current.getX() + 1){
                return false;
            }
        }

        return true;
    }
}

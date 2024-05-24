/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truonganhtuan_cau3;

/**
 *
 * @author Truong Anh tuan _cau3
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point() {
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Point findSymmetryOrigin() {
        this.x = -x;
        this.y = -y;
        return this;
    }
    public Point findSymmetryHorizontal(int x, int y) {
        this.x = -x;
        this.y = y;
        return this;
    }
    public String toString() {
        return "(" + this.x + ";" + this.y + ")";
    }
    public double Distance (Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) - Math.pow(a.y- b.y, 2));
    }
    public static void main(String[] args) {
        Point A = new Point(3,4);
        Point B = new Point(6,8);
        System.out.println(A.findSymmetryOrigin().toString());
    }
}

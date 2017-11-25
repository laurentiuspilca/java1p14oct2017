/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author student
 */
public class MyObject {
    private int x;
    private String y;
    private double z;
    private boolean w;

    //setter and getter

    public static class Builder {
        private MyObject o = new MyObject();

        public Builder setX(int x) {
            o.x = x;
            return this;
        }

        public Builder setY(String y) {
            o.y = y;
            return this;
        }

        public Builder setZ(double z) {
            o.z = z;
            return this;
        }

        public Builder setW(boolean w) {
            o.w = w;
            return this;
        }

        public MyObject build() {
            return o;
        }
    }
}

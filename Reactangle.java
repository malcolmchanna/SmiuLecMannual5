package com.company;

public class Reactangle {

    float lenght , width ;

        public void setLenght(float l  ){
                 lenght = l;
        }
        public void setWidth(float w){
            width = w;
        }

        public float perimeter(){
            return 2*(lenght+width);
        }

        public float area(){
         return width*lenght;
           }

        public boolean square(){
            return lenght== width;
         }

         public void display(){

             System.out.println("\nArea: " + area());
             System.out.println("perimeter: " + perimeter());
             System.out.println("is it Square: " + square());
         }
    public static void main(String[] args) {
        Reactangle reactangle = new Reactangle();

        System.out.println("MUZAMIL JAMIL CHANNA");
        reactangle.setLenght((float) 5.2);reactangle.setWidth((float) 5.2);
        reactangle.display();
        System.out.println("----------------");
        reactangle.setLenght((float) 5.2);reactangle.setWidth((float) 9.4);
        reactangle.display();
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31_passing_objects;

/**
 *
 * @author manas
 */
class Printer{
    public void print(Paper p){
        p.setText("Get Lost");
    }
}
class Paper{
    String text;
    public void setText(String t){
        text = t;
    }
    public String getText(){
        return text;
    }
}
public class Main {
    public static void main(String[] args) {
        Paper p = new Paper();
        p.setText("Hello World");
        System.out.println(p.getText());
        Printer hp = new Printer();
        hp.print(p);
        System.out.println(p.getText());
    }    
}

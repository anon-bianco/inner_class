/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inner_class;

/**
 *
 * @author hilbe
 */
public class Inner_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer_class gavas_outer=new outer_class();
        outer_class.inner_class gavas_inner=gavas_outer.new inner_class(); 
        gavas_inner.print_inner();   
    }
    
}

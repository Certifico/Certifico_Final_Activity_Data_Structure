/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khian
 */


public class Row {
    private static int row = 0;
    
    public static int getRow(){
        return row;
    }
    public static void setRow(int newRow){
        row = newRow;
    }
    public static void setRow(){
        row++;
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class Staff {
    public String staffNo;
    public String staffName;
    
    Date date = new Date();
    
    public int getCurrentHour(){
        return date.getHours();
    }
    
    public void getStaff()
    {
        if (date.getHours() >= 0 && date.getHours() < 7){
            staffNo = "S001";
            staffName = "Krishna";
        } 
        else if (date.getHours() >= 6 && date.getHours() < 13){
            staffNo = "S002";
            staffName = "Aji";
        }
        else if (date.getHours() >= 12 && date.getHours() < 19){
            staffNo = "S003";
            staffName = "Berliana";
        } 
        else if (date.getHours() >= 18 && date.getHours() < 24){
            staffNo = "S004";
            staffName = "Fenty";
        }
    }
}

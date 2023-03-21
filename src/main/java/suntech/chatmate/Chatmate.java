/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package suntech.chatmate;

import backend.*;
import ui.*;

/**
 *
 * @author jhonr
 */
public class Chatmate {

    public static void main(String[] args){
        DBConnect.DBConnect();
                pages p;
                p = new pages();
                p.initComponents();
                
        }
    }

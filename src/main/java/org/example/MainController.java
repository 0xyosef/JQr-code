package org.example;

import org.example.qr_code.QrController;

import java.io.File;

public class MainController {
    String text="www.google.com";
    String path="/home/yosef/IdeaProjects/java/Qr-code/src/qr-code.png";
    QrController qrController=new QrController();
    MainController(){
        try {
           var x= qrController.readQrCode(new File(path));
            System.out.println(x);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

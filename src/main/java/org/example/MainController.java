package org.example;

import org.example.qr_code.QrController;

import java.io.File;

public class MainController {
    String text="https://yosefjoo.github.io/";
    String path="/home/yosef/IdeaProjects/java/Qr-code/src/QrGenerator/qr-code.png";
    QrController qrController=new QrController();
    MainController(){
      //  qrController.generateQrCode(text);
        try {
           var x= qrController.readQrCode(new File(path));
            System.out.println(x);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

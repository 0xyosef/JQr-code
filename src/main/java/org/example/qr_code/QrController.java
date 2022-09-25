package org.example.qr_code;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class QrController {
    public void generateQrCode(String text){
        QRCodeWriter writer=new QRCodeWriter();

        try {
            BitMatrix bitMatrix=writer.encode(text, BarcodeFormat.QR_CODE,400,400);
            //generate image from bitMatrix
            MatrixToImageWriter.writeToPath(bitMatrix,"PNG",new File("/home/yosef/IdeaProjects/java/Qr-code/src/QrGenerator/qr-code.png").toPath());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String readQrCode(File path) throws IOException, ChecksumException, NotFoundException, FormatException {
         QRCodeReader reader=new  QRCodeReader();

         Result decode= reader.decode(new BinaryBitmap(new
                   HybridBinarizer(new
                   BufferedImageLuminanceSource(ImageIO.read(path)))));
        return decode.getText();
    }
}

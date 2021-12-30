package jFileChooser1.examples.example1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFileChooser fileChooser = new JFileChooser();

        // كنافذة لإختيار ملف في وسط شاشة المستخدم chooser هنا قمنا بإظهار الكائن
        // returnedValue و تخزين القيمة التي سيرجعها عندما يتم إغلاقه في المتغير
        int returnedValue = fileChooser.showOpenDialog(null);

        if(returnedValue == JFileChooser.APPROVE_OPTION){
            // هنا من المفترض أن تضع الأوامر التي سيتم تنفيذها بعد إختيار الملف أو المجلد
        }
    }
}

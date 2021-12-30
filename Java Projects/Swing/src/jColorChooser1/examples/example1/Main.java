package jColorChooser1.examples.example1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        // في وسط شاشة المستخدم مع وضع اللون الأحمر كاللون المختار إفتراضياً Color Chooser Dialog هنا قمنا بإظهار
        // c في الكائن null بعد أن يتم إغلاقه سيتم تخزين اللون الذي إختاره المستخدم أو القيمة
        Color color = JColorChooser.showDialog(null, "Color piker", Color.red);

        // color هنا قمنا بعرض قيمة الكائن
        System.out.println(color);
    }
}

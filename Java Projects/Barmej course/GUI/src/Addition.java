import javax.swing.*;

public class Addition {
    public static void main(String[] args){
        //المدخلات
        //دالة شو الإنبوت دايالوح من كلاس جي اوبشن بانل تقوم بأخذ النصوص من المستخدم
        String firstNumber = JOptionPane.showInputDialog("أدخل الرقم الاول");
        String secondNumber = JOptionPane.showInputDialog("أدخل الرقم الثاني");
        // الدالة بارس انت من كلاس انتجر تستخدم لتحويل النص مم استرنج الي انتجر
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        int sum = num1 + num2;
        System.out.println(sum);
        // دالة شو ماسج دايالوج من كلاس جي اوبشن بانل تقوم بعرض المخرجات للمستغدم
        JOptionPane.showMessageDialog(null,"المجموع هوا: " +
                sum,"جمع عددين",
                JOptionPane.PLAIN_MESSAGE);

    }
}

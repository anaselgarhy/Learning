package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("نقوم بإنشاء كائن للإبريق!");
        Ebreeq ebreeq = new Ebreeq("قهوة");
        System.out.println("تعبأة الكثيير من القهوة");
        try {
            ebreeq.fill(30000);
        }catch (IllegalArgumentException error){
            System.out.println("الخطأ:"+error.getMessage());
        }
        System.out.println("اكبر كمية يمكن ان يحملها الابريق هي "+ ebreeq.MAX_LIQUID_AMOUNT);
        if(ebreeq.isEmpty()) {
            System.out.println("نقوم بملئ الابريق");
            ebreeq.fill();
            System.out.println("لقد أنشأنا إبريق يحتوي علي" + " " + ebreeq.getLiquidAmount() +
                    " مل" + " " + "من" + " " + ebreeq.getLiquidType());
        }
        while(ebreeq.serve()) {
            System.out.println("تقديم القليل من القهوة");
            System.out.println("لقد أنشأنا إبريق يحتوي علي" + " " + ebreeq.getLiquidAmount() +
                    " مل" + " " + "من" + " " + ebreeq.getLiquidType());
        }
        System.out.println("اعادة تعبئة الابريق..");
        ebreeq.fill(100);
        ebreeq.fill(26);

        System.out.println("لقد أنشأنا إبريق يحتوي علي" + " " + ebreeq.getLiquidAmount() +
                " مل" + " " + "من" + " " + ebreeq.getLiquidType());

        while(ebreeq.serve()) {
            System.out.println("تقديم القليل من القهوة");
            System.out.println("لقد أنشأنا إبريق يحتوي علي" + " " + ebreeq.getLiquidAmount() +
                    " مل" + " " + "من" + " " + ebreeq.getLiquidType());
        }
        System.out.println("اعادة تعبئة الابريق..");
        ebreeq.fill(33);
        ebreeq.fill();

            System.out.println("لقد أنشأنا إبريق يحتوي علي" + " " + ebreeq.getLiquidAmount() +
                    " مل" + " " + "من" + " " + ebreeq.getLiquidType());


        if (!ebreeq.isEmpty()) {
            System.out.println("الابريق ممتلئ انتظر حتي نقوم بإفراغه");
            ebreeq.clean();
            System.out.println("لقد أنشأنا إبريق يحتوي علي" + " " + ebreeq.getLiquidAmount() +
                    " مل" + " " + "من" + " " + ebreeq.getLiquidType());
        }

            }
}

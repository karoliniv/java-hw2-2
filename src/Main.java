public class Main {
    public static void main(String[] args) {
        int mobileAccount = 100; //рублей на счету
        int addMoney = 1100; //пополнение счета рублями
        int bonus = 0; //бонус за пополнение
        int giftRubles = 100; //+1 рубль за +100 рублей если >1000 рублей

        mobileAccount = mobileAccount + addMoney;

        if(addMoney > 1000) {
            bonus = addMoney / giftRubles;
            mobileAccount = mobileAccount + bonus;
            System.out.println("Бонусов — " + bonus + ", итоговая сумма на счету клиента — "
                                            + mobileAccount + " рублей.");
        }
        else {
            System.out.println("Бонусов — " + bonus + ", итоговая сумма на счету клиента — "
                                            + mobileAccount + " рублей.");
        }


    }
}

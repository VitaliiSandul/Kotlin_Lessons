public class Main {

    public static void main(String[] args){
//        String text="txt";
//        print(text);
//        text="";
//        print(text);
//        text="text";
//        print(text);

//        showDivision(10,5);
//        showDivision(1,0);
//        showDivision(0,0);

//        boolean isTodayFriday = true;
//        boolean aLotOfMoney = true;
//
//        fridayMoneyFun(isTodayFriday, aLotOfMoney);
//        aLotOfMoney = false;
//        fridayMoneyFun(isTodayFriday, aLotOfMoney);
//        isTodayFriday = false;
//        fridayMoneyFun(isTodayFriday, aLotOfMoney);

        int costOfBeer = 3;
        int costOfWhiskey = 5;
        int moneyInYourPocket = 10;

        beerOrWhisky(costOfBeer, costOfWhiskey, moneyInYourPocket);
        moneyInYourPocket = 7;
        beerOrWhisky(costOfBeer, costOfWhiskey, moneyInYourPocket);
        moneyInYourPocket = 4;
        beerOrWhisky(costOfBeer, costOfWhiskey, moneyInYourPocket);
        moneyInYourPocket = 2;
        beerOrWhisky(costOfBeer, costOfWhiskey, moneyInYourPocket);
    }

    private static void showDivision(int number1, int number2){
//        if(number2 == 0 && number1 == 0){
//            print("uncertainty 0/0");
//        }
//        else if(number2 == 0){
//            print("second argument is zero!");
//        }else {
//                print(number1/number2);
//        }

        switch (number2){
            case 0 -> {
                if (number1 == 0) {
                    print("uncertainty 0/0");
                } else {
                    print("second argument is zero!");
                }
            }
            default -> print(number1/number2);
        }
    }

    private static void print(String text){
        if(!text.isEmpty()){
            System.out.println(text);
        }
    }

    private static void print(int number){
        System.out.println(number);
    }

    private static void fridayMoneyFun(boolean isFraday, boolean isMoney){
        if(isFraday){
            if(isMoney){
                print("Buy beer for your money");
            }else{
                print("Drink beer with friend");
            }
        }else{
            print("Don't have money. Go home!");
        }
    }

    private static void beerOrWhisky(int costOfBeer,
                                    int costOfWhiskey,
                                    int moneyInYourPocket){

        if(moneyInYourPocket >= costOfWhiskey + costOfBeer){
            print("take whiskey + beer");
        }else if(moneyInYourPocket >= costOfWhiskey){
            print("take whiskey");
        }
        else if(moneyInYourPocket >= costOfBeer){
            print("take beer");
        }else{
            print("Don't have money. Go home!");
        }
    }
}

package com.ash.ashfirst;

/**
 * Created by liuwei on 17-3-10.
 */

public class StockAsh {

    private String code;
    private String stock_name;
    private float start_price;
    private float price_end;
    private float now_price;
    private float high_price;
    private float low_price;
    private float buy_one;
    private float sell_one;
    private int volume; //成交量
    private int turnover; //成交额
    private int buy_one_volume;
    //private float buy_one; //再次买一
    private float buy_two,buy_three,buy_four,buy_five;
    private int buy_two_volume,buy_three_volume,buy_four_volume,buy_five_volume;
    private int sell_one_volume;
    //private float sell_one;//再次卖一
    private float sell_two,sell_three,sell_four,sell_five;
    private int sell_two_volume,sell_three_volume,sell_four_volume,sell_five_volume;
    private String stock_date;
    private String now_time;

    public StockAsh(String code, String stock_name, float start_price, float price_end, float now_price, float high_price, float low_price, float buy_one, float sell_one, int volume, int turnover, int buy_one_volume, float buy_two, float buy_three, float buy_four, float buy_five, int buy_two_volume, int buy_three_volume, int buy_four_volume, int buy_five_volume, int sell_one_volume, float sell_two, float sell_three, float sell_four, float sell_five, int sell_two_volume, int sell_three_volume, int sell_four_volume, int sell_five_volume, String stock_date, String now_time) {
        this.code = code;
        this.stock_name = stock_name;
        this.start_price = start_price;
        this.price_end = price_end;
        this.now_price = now_price;
        this.high_price = high_price;
        this.low_price = low_price;
        this.buy_one = buy_one;
        this.sell_one = sell_one;
        this.volume = volume;
        this.turnover = turnover;
        this.buy_one_volume = buy_one_volume;
        this.buy_two = buy_two;
        this.buy_three = buy_three;
        this.buy_four = buy_four;
        this.buy_five = buy_five;
        this.buy_two_volume = buy_two_volume;
        this.buy_three_volume = buy_three_volume;
        this.buy_four_volume = buy_four_volume;
        this.buy_five_volume = buy_five_volume;
        this.sell_one_volume = sell_one_volume;
        this.sell_two = sell_two;
        this.sell_three = sell_three;
        this.sell_four = sell_four;
        this.sell_five = sell_five;
        this.sell_two_volume = sell_two_volume;
        this.sell_three_volume = sell_three_volume;
        this.sell_four_volume = sell_four_volume;
        this.sell_five_volume = sell_five_volume;
        this.stock_date = stock_date;
        this.now_time = now_time;
    }


    private String stock_data;
    private String stock_code;
    private String datas[];
    private int length;
    public StockAsh(String stockData){
        stock_data = stockData.split("\"")[1];
        stock_code = stockData.split("\"")[0];
        datas = stock_data.split(",");
        length = datas.length;
        this.code = stock_code;
        this.stock_name = datas[0];
        this.start_price = Float.valueOf(datas[1]).floatValue();
        this.price_end = Float.valueOf(datas[2]).floatValue();
        this.now_price = Float.valueOf(datas[3]).floatValue();
        this.high_price = Float.valueOf(datas[4]).floatValue();
        this.low_price = Float.valueOf(datas[5]).floatValue();
        this.buy_one = Float.valueOf(datas[6]).floatValue();
        this.sell_one = Float.valueOf(datas[7]).floatValue();
        this.volume = Integer.parseInt(datas[8])/100;
        this.turnover = Integer.parseInt(datas[9].split("\\.")[0])/10000;
        this.buy_one_volume = Integer.parseInt(datas[10])/100;
        this.buy_two = Float.valueOf(datas[13]).floatValue();
        this.buy_three = Float.valueOf(datas[15]).floatValue();
        this.buy_four = Float.valueOf(datas[17]).floatValue();
        this.buy_five = Float.valueOf(datas[19]).floatValue();
        this.buy_two_volume = Integer.parseInt(datas[12])/100;
        this.buy_three_volume = Integer.parseInt(datas[14])/100;
        this.buy_four_volume = Integer.parseInt(datas[16])/100;
        this.buy_five_volume = Integer.parseInt(datas[18])/100;
        this.sell_one_volume = Integer.parseInt(datas[20])/100;
        this.sell_two = Float.valueOf(datas[23]).floatValue();
        this.sell_three = Float.valueOf(datas[25]).floatValue();
        this.sell_four = Float.valueOf(datas[27]).floatValue();
        this.sell_five = Float.valueOf(datas[29]).floatValue();
        this.sell_two_volume = Integer.parseInt(datas[22])/100;
        this.sell_three_volume = Integer.parseInt(datas[24])/100;
        this.sell_four_volume = Integer.parseInt(datas[26])/100;
        this.sell_five_volume = Integer.parseInt(datas[28])/100;
        this.stock_date = datas[30];
        this.now_time = datas[31];
    }

    @Override
    public String toString(){
        //return "stock_code = " + this.stock_code + "\n stock_data = " + this.stock_data + "\n length = " + this.length;
        return "名称 " + this.stock_name + "\n 代码 " + this.code + "\n 昨收 " + this.price_end + "\n 今开 " + this.start_price +
                "\n 买一 " + this.buy_one + "\n 卖一 " + this.sell_one + "\n 今日成交手数 " + this.volume + "手\n 今日交易额 = " + this.turnover + "万";
    }
}

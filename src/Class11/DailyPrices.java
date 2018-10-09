/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class11;

/**
 *
 * @author al
 */
public class DailyPrices {
    private String date;
    private float open;
    private float high;
    private float low;
    private float close;
    private float adjClose;
    private int volume;

    //EMPTY CONSTRUCTOR
    public DailyPrices()
    {
        
    }
    
    //CONSTRUCTOR WITH ARGUMENTS
    public DailyPrices(String date, float open, float high, float low, float close, float adjClose, int volume) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.adjClose = adjClose;
        this.volume = volume;
    }
    
    //CONSTRUCTOR WITH STRING ARRAY ARGUMENT
    public DailyPrices(String[] prices)
    {
        this.date = prices[0];
        this.open = Float.parseFloat(prices[1]);
        this.high = Float.parseFloat(prices[2]);
        this.low = Float.parseFloat(prices[3]);
        this.close = Float.parseFloat(prices[4]);
        this.adjClose = Float.parseFloat(prices[5]);
        this.volume = Integer.parseInt(prices[6]);
    }

    public String getDate() {
        return date;
    }

    public float getOpen() {
        return open;
    }

    public float getHigh() {
        return high;
    }

    public float getLow() {
        return low;
    }

    public float getClose() {
        return close;
    }

    public float getAdjClose() {
        return adjClose;
    }

    public int getVolume() {
        return volume;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public void setAdjClose(float adjClose) {
        this.adjClose = adjClose;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    
    
    
    
    
    
}

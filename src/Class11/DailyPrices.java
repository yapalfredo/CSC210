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
    private float open;
    private float high;
    private float low;
    private float close;
    private float adjClose;
    private float volume;

    //EMPTY CONSTRUCTOR
    public DailyPrices()
    {
        
    }
    
    //CONSTRUCTOR WITH ARGUMENTS
    public DailyPrices(float open, float high, float low, float close, float adjClose, float volume) {
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.adjClose = adjClose;
        this.volume = volume;
    }
    
    public DailyPrices(String[] prices)
    {
        
    }
}

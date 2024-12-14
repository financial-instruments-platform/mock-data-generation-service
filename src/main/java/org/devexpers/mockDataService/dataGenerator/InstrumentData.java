

package org.devexpers.mockDataService.dataGenerator;


import jakarta.validation.constraints.NotNull;

public class InstrumentData
{
    private String symbol;
    private double price;
    private long   timeStamp;


    public InstrumentData (
            String symbol,
            double price,
            long timeStamp
                          )
    {
        this.symbol    = symbol;
        this.price     = price;
        this.timeStamp = timeStamp;
    }

    public long getTimeStamp ( )
    {
        return timeStamp;
    }

    public void setTimeStamp ( long timeStamp )
    {
        this.timeStamp = timeStamp;
    }

    public String getSymbol ( )
    {
        return symbol;
    }

    public void setSymbol ( String symbol )
    {
        this.symbol = symbol;
    }

    public double getPrice ( )
    {
        return price;
    }

    public void setPrice ( double price )
    {
        this.price = price;
    }
}
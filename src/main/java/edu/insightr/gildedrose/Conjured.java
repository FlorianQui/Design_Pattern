package edu.insightr.gildedrose;

public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality)
    {
        super();
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality()
    {
        if(getQuality() < 50)
        {
            //setQuality(getQuality() - 2);
        }
    }
}

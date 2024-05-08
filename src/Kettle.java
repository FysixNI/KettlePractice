public class Kettle
{
    private int capacity;
    private int amountOfWater;
    private int waterTemperature;

    // Constructor
    public Kettle(int capacity)
    {
        this.capacity = capacity;
        this.amountOfWater = 0;
        this.waterTemperature = 0;
    }

    // Getter methods
    public int getCapacity()
    {
        return capacity;
    }

    public int getAmountOfWater()
    {
        return amountOfWater;
    }

    public int getWaterTemperature()
    {
        return waterTemperature;
    }

    // Method to add water
    public void addWater(int amount)
    {
        if (amountOfWater + amount <= capacity)
        {
            amountOfWater += amount;
        }

        else
        {
            System.out.println("Kettle is full. Cannot add more water.");
        }
    }

    // Method to dispense water
    public void dispenseWater(int amount)
    {
        if (amountOfWater >= amount)
        {
            amountOfWater -= amount;
        }

        else
        {
            System.out.println("Not enough water in the kettle.");
        }
    }

    // Method to heat water
    public void heat()
    {
        if (waterTemperature < 100)
        {
            waterTemperature++;
        }
    }

    // Method to cool water
    public void cool()
    {
        if (waterTemperature > 15)
        {
            waterTemperature--;
        }
    }

    // Method to check if water is boiled
    public boolean isBoiled()
    {
        return waterTemperature > 92;
    }

    // toString method
    @Override
    public String toString()
    {
        return "An object of class Kettle with capacity " + capacity + "ml and " + amountOfWater + "ml of water at temperature " + waterTemperature + " degrees";
    }

    public static void main(String[] args)
    {
        // Testing the Kettle class
        Kettle myKettle = new Kettle(1200);
        System.out.println(myKettle);

        myKettle.addWater(500);
        myKettle.heat();
        System.out.println(myKettle);

        myKettle.dispenseWater(200);
        System.out.println(myKettle);

        myKettle.cool();
        System.out.println(myKettle);

        System.out.println("Is water boiled? " + myKettle.isBoiled());
    }
}
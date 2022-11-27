package Lab5;

class Car implements Cloneable 
{
    //instance variables
    private String name;
    private double engine;
    private double bhp;
    private int Capacity;

    //constructor
    public Car(String name, double engine, double bhp, int Capacity) 
    {
            this.name = name;
            this.engine = engine;
            this.bhp = bhp;
            this.Capacity = Capacity;
    }

    //Getters & Setters
    public String getName() 
    {
            return name;
    }

    public void setName(String name) 
    {
            this.name = name;
    }

    public double getEngine() 
    {
            return engine;
    }

    public void setEngine(double engine) 
    {
            this.engine = engine;
    }
    public double getBhp()     {
            return bhp;
    }
    public void setBhp(double bhp)     {
            this.bhp = bhp;
    }
    public int getCapacity()     {
            return Capacity;
    }
    public void setSeatigCapacity(int Capacity)    {
            this.Capacity = Capacity;
    }
    //clone method
    protected Object clone() throws CloneNotSupportedException     {
            return (Car) super.clone();
    }
    //toString method
    public String toString()     {
            return "Name: " + name + " , Engine: " + engine + "cc , BHP: " + bhp + " , Seating Capacity: " + Capacity;
    }
}

public class Cloning 
{
    public static void main(String[] args) 
    {
            Car Car1 = new Car("VenueZXi", 998, 81.86, 5);
            Car Car2 = null;
            try 
            {
            	Car2 = (Car) Car1.clone();
            	Car2.setName("Samuraixz");
            	Car2.setEngine(1000);
            	Car2.setBhp(100);
            } 
            catch (CloneNotSupportedException e) 
            {
                    e.printStackTrace();
            }

            // printing the details
            System.out.println(Car1);
            System.out.println(Car2);

            // checking if there instance are same
            System.out.println("\nAre the Instances same? " + (Car1 == Car2));

            // printing hash
            System.out.println("\nVenueZXi hascode: " + Car1.hashCode());
            System.out.println("Samuraixz hascode: " + Car2.hashCode());

            // printing class name
            System.out.println("\nVenueZXi class name: " + Car1.getClass().getSimpleName());
            System.out.println("Samuraixz class name: " + Car2.getClass().getSimpleName());
    }
}
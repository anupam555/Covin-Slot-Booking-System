public class vaccines {
    String name;
    int total_doses;
    int gap_doses;
    vaccines(String vaccine, int total_dose, int gaps)
    {
        this.name=vaccine;
        this.total_doses=total_dose;
        this.gap_doses=gaps;
    }
    public void display_details()
    {
        System.out.println("Vaccine name:" + name+",");
        System.out.println("Number of doses:" + total_doses+",");
        System.out.println("Gap between doses:" + gap_doses);
    }
    public String getName()
    {
        return name;
    }
    public int getGap()
    {
        return gap_doses;
    }
    public int getTotalDoses()
    {
        return total_doses;
    }
}

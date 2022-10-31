import javax.swing.JOptionPane;

public class Coffee extends Beverage {
    private boolean milk;
    
    public Coffee(String size, int amount, Label lbl){
        super(size, amount);
        if(JOptionPane.showConfirmDialog(lbl, "Would you like to add Milk?", "Milk", JOptionPane.YES_NO_OPTION) == 0) milk = true;
        else milk = false;

        double price;
        if(size.equals("Small")) price =  2.5;
        else if(size.equals("Medium"))  price = 5.0;
        else price = 10;
        if(milk) price *= 0.5;
        setPrice(price);

}

    @Override
    public String toString() {
       if(milk) return super.toString() + " Coffee with milk";
       else return super.toString() + " Coffee";
    }
    
}

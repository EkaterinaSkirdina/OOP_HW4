package SeminarsHW.HW4;

import java.util.List;

public class VendingMachine<T extends Product> {
    public List<T> product;    
        
    public void initProduct(List<T> product) {
        this.product = product;
    }   

    public String getProduct(String name, Double volume) {
        for (T el : product) {
            if ((el.getName().equals(name)) &&
                    (el.getVolume().equals(volume))) {
                return el.toString();
            }
        }
        return "Не найдено";
    }
}

import java.util.HashMap;
import java.util.Map;

public class Pc {
    public HashMap<Component , String> components= new HashMap<Component, String>();

    public boolean checkIfExist(Component component){
        System.out.println("se verifca daca exista componenta " + component.getName() + " in pc");
        for(Map.Entry<Component,String> entry: components.entrySet()){
            if(entry.getKey() == component){
                return true;
            }
        }
        return false;
    }
    public void addComponent(Component component){
        System.out.println("Se adauga componenta " + component.getName());
        if (!checkIfExist(component)){
            components.put(component,"1");
        }
    }

    public boolean checkHashmapSize(){
        System.out.println("Se verifica daca cele trei componente exista in pc");
        if(this.components.size() == 3){
            return true;
        }
        return false;
    }

    public boolean isPowerPositive(){
        System.out.println("Se verifica daca puterea este pozitiva");
        int power = 0;
        for(Map.Entry<Component,String> entry: components.entrySet()){
            if(entry.getKey().getName().contains("PowerSupply")){
                power+= entry.getKey().getPowerConsumption();
            } else{
                power -= entry.getKey().getPowerConsumption();
            }
        }
        System.out.println("Puterea este " + power);
        if(power > 0){
            return true;
        }
        return false;
    }

    public boolean isWorking(){
        System.out.println("Se verifica daca calculatorul merge");
        boolean result = isPowerPositive() && checkHashmapSize();
        System.out.println("Merge calculatorul? " + result);
        if(result){
            return true;
        }
        return false;
    }
}

import java.util.*;

public class Example {
    ArrayList<Double> obj = new ArrayList<Double>();
    Scanner ob = new Scanner(System.in);
    double money;
    void add(){
        for (int i=0; i<5; i++) {
            System.out.println("Enter the money: ");
            money = ob.nextDouble();
            obj.add(money);
        }
    }
    void edit(){
        System.out.println("Edit account: ");
        System.out.println("Enter the old money: ");
        double set_money = ob.nextDouble();
        for (int i=0; i<obj.size(); i++){
            if (set_money == obj.get(i)){
                System.out.println("Enter new money: ");
                double next_money = ob.nextDouble();
                obj.set(i, next_money);
            }
        }
    }
    void remove(){
        System.out.println("Which money that you want to remove: ");
        double check_money = ob.nextDouble();
        for (int i=0; i<obj.size(); i++){
            if (check_money == obj.get(i)){
                obj.remove(check_money);
            }
        }
    }
    void show(){
        double temp;
        // show(acending order)
        Collections.sort(obj);
        System.out.println(obj);
        // show the bigest numeber;
        System.out.println("The biggest number: " + Collections.max(obj));
    }
    public static void main(String[] args) {
        Example obj = new Example();
        obj.add();
        obj.edit();
        obj.remove();
        obj.show();
    }
}
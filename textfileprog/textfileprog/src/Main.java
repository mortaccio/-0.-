import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Dish> dishes = new ArrayList<Dish>();
        BufferedReader reader = new BufferedReader(new FileReader("./Dishes.csv"));

        String line = reader.readLine();
        while (line != null) {
            String[] fields = line.split(",");
            Dish dish = new Dish();
            dish.setDishName(fields[0]);
            dish.setPrice(Integer.parseInt(fields[1]));
            dish.setWeight(Integer.parseInt(fields[2]));
            dish.setTypeOne(fields[3]);
            dish.setTypeTwo(fields[4]);
            dishes.add(dish);

            line = reader.readLine();
        }

        for (Dish dish : dishes) {
            System.out.println (dish.getDishName() + " | " + dish.getPrice() + " | " + dish.getWeight() + " | " + dish.getTypeOne() + " | " + dish.getTypeTwo());
        }
        reader.close();
    }
}
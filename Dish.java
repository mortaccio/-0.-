import java.io.*;

public class Dish {
    private String dishName;
    private int price;
    private int weight;
    private String typeOne;
    private String typeTwo;

    // конструктор по умолчанию
    public Dish() {
        this.dishName = "";
        this.price = 0;
        this.weight = 0;
        this.typeOne = "";
        this.typeTwo = "";
    }

    // конструктор копирования
    public Dish(Dish other) {
        this.dishName = other.dishName;
        this.price = other.price;
        this.weight = other.weight;
        this.typeOne = other.typeOne;
        this.typeTwo = other.typeTwo;
    }

    // метод копирования
    public Dish clone() {
        return new Dish(this);
    }

     //метод сравнения
     public boolean equals(Dish other) {
         if (other == null) {
            return false;
        }
        return this.dishName.equals(other.dishName) && this.price == other.price && this.weight == other.weight && this.typeOne.equals(other.typeOne) && this.typeTwo.equals(other.typeTwo);
      }

    // метод чтения из потока
    public void readFromStream(DataInputStream in) throws IOException {
        this.dishName = in.readUTF();
        this.price = in.readInt();
        this.weight = in.readInt();
        this.typeOne = in.readUTF();
        this.typeTwo = in.readUTF();
    }

    // метод записи в поток
    public void writeToStream(DataOutputStream out) throws IOException {
        out.writeUTF(this.dishName);
        out.writeInt(this.price);
        out.writeInt(this.weight);
        out.writeUTF(this.typeOne);
        out.writeUTF(this.typeTwo);
    }

    // геттеры и сеттеры
    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getTypeOne() {
        return typeOne;
    }
    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne;
    }
    public String getTypeTwo() {
        return typeTwo;
    }
    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo;
    }
}


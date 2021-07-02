import java.util.ArrayList;

public class Main {
    static ArrayList<String> employees = new ArrayList();
    static ArrayList<String> managers = new ArrayList();

    static class Person {

        String name;
        int age;
        String email;
        String phoneNumber;
        String address;

        Person(String name, int age, String email, String phoneNumber, String address) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;

        }

    }

    static class MallOwner extends Person {

        String password;

        MallOwner(String name, int age, String email, String phoneNumber, String address, String password) {
            super(name, age, email, phoneNumber, address);
            this.password = password;
        }
    }

    static class ShopOwner extends Person {

        String shopName;
        double rent;
        double profit;

        ShopOwner(String name, int age, String email, String phoneNumber, String address, String shopName, double rent, double profit) {
            super(name, age, email, phoneNumber, address);
            this.shopName = shopName;
            this.rent = rent;
            this.profit = profit;
        }

        double calculateRent(double profit) {
            double newRent = this.rent * (this.profit) / 100;
            return newRent;
        }
    }

    static class Worker extends Person {

        double salary;
        String experience;
        String shop_name;

        Worker(String name, int age, String email, String phoneNumber, String address, double salary, String experience,String shop_name) {
            super(name, age, email, phoneNumber, address);
            this.salary = salary;
            this.experience = experience;
            this.shop_name = shop_name;
        }
    }

    static class Manager extends Worker {

        Manager(String name, int age, String email, String phoneNumber, String address, double salary, String experience, String shop_name) {
            super(name, age, email, phoneNumber, address, salary, experience, shop_name);

            if (null != shop_name) {
                switch (shop_name) {
                    case "Sethi's":
                        managers.add(this.name + " (Sethi's)");
                        break;
                    case "Alphaman Theatre":
                        managers.add(this.name + " (Alphaman Theatre)");
                        break;
                    case "FunCity":
                        managers.add(this.name + " (FunCity)");
                        break;
                    case "Corner 101":
                        managers.add(this.name + " (Corner 101)");
                        break;
                    default:
                        break;
                }
            }
        }
    }

    static class Employee extends Worker {

        int employeeId;

        Employee(String name, int age, String email, String phoneNumber, String address, double salary, String experience, int employeeId, String shop_name) {
            super(name, age, email, phoneNumber, address, salary, experience, shop_name);
            this.employeeId = employeeId;

            if (null != shop_name) {
                switch (shop_name) {
                    case "Sethi's":
                        employees.add(this.name + " (Sethi's)");
                        break;
                    case "Alphaman Theatre":
                        employees.add(this.name + " (Alphaman Theatre)");
                        break;
                    case "FunCity":
                        employees.add(this.name + " (FunCity)");
                        break;
                    case "Corner 101":
                        employees.add(this.name + " (Corner 101)");
                        break;
                    default:
                        break;
                }
            }
        }
    }

    static class Mall {

        String mall_name;
        String mall_owner;

        Refreshments refreshments;
        Clothing clothing;
        Cinema cinema;
        PlayArea playArea;

        Mall(String mall_name, String mall_owner) {
            this.mall_name = mall_name;
            this.mall_owner = mall_owner;

            refreshments = new Refreshments("Corner 101", "Syed Afraz");
            clothing = new Clothing("Sethi's", "Faizan Sethi");
            cinema = new Cinema("Alphaman Theatre", "Muhammad Shahzil");
            playArea = new PlayArea("FunCity", "Muhammad Abdullah");
        }

    }

    static class Shop {

        String shop_name;
        String shop_owner;
        Item item;

        Shop(String shop_name, String shop_owner) {
            this.shop_name = shop_name;
            this.shop_owner = shop_owner;
        }

    }

    static class Item {

        String item_name;
        String item_id;
        Double item_price;
        int item_quantity;
        String shop_name;

        Item(String item_name, Double item_price, int item_quantity, String shop_name) {
            this(item_name, null, item_price, item_quantity, shop_name);
        }

        Item(String item_name, String item_id, Double item_price, int item_quantity, String shop_name) {
            this.item_name = item_name;
            this.item_id = item_id;
            this.item_price = item_price;
            this.item_quantity = item_quantity;
            this.shop_name = shop_name;
        }
        @Override
        public String toString(){
            return ("Name: "+item_name+ ",    Item ID: "+item_id+",   Price: "+item_price+",  Quantity: "+item_quantity+".") ;
        }

        public String toStrings(){
            return ("Name: "+item_name+ ",   Price: "+item_price+",  Quantity: "+item_quantity+".") ;
        }
    }

    static class Refreshments extends Shop {

        static Item JuiceCorner[] = new Item[12];
        static Item FastFoodCorner[] = new Item[16];
        static Item ChineseCuisine[] = new Item[9];

        Refreshments(String shop_name, String shop_owner) {
            super(shop_name, shop_owner);

            JuiceCorner[0] = new Item("Mango Shake", 100.0, 35, shop_name);
            JuiceCorner[1] = new Item("Banana Shake", 80.0, 40, shop_name);
            JuiceCorner[2] = new Item("Strawberry Shake", 120.0, 32, shop_name);
            JuiceCorner[3] = new Item("Oreo Shake", 140.0, 30, shop_name);
            JuiceCorner[4] = new Item("Vanilla Shake", 160.0, 22, shop_name);
            JuiceCorner[5] = new Item("Apple Juice", 120.0, 30, shop_name);
            JuiceCorner[6] = new Item("Orange Juice", 110.0, 32, shop_name);
            JuiceCorner[7] = new Item("Sugarcane Juice", 70.0, 35, shop_name);
            JuiceCorner[8] = new Item("Fresh Lime", 130.0, 25, shop_name);
            JuiceCorner[9] = new Item("Mint Margarita", 230.0, 20, shop_name);
            JuiceCorner[10] = new Item("Pina Colada", 230.0, 20, shop_name);
            JuiceCorner[11] = new Item("Onnnnnn Shake", 350.0, 12, shop_name);

            FastFoodCorner[0] = new Item("Chicken Fajita Pizza", 800.0, 10, shop_name);
            FastFoodCorner[1] = new Item("Chicken Supreme Pizza", 900.0, 12, shop_name);
            FastFoodCorner[2] = new Item("Chicken Shawarma", 120.0, 20, shop_name);
            FastFoodCorner[3] = new Item("Zinger Shawarma", 160.0, 18, shop_name);
            FastFoodCorner[4] = new Item("Hotdog", 200.0, 15, shop_name);
            FastFoodCorner[5] = new Item("Club Sandwich", 280.0, 15, shop_name);
            FastFoodCorner[6] = new Item("Zinger Burger", 350.0, 20, shop_name);
            FastFoodCorner[7] = new Item("Classic American Beef Burger", 450.0, 15, shop_name);
            FastFoodCorner[8] = new Item("Onnnnnn Burger", 600.0, 10, shop_name);
            FastFoodCorner[9] = new Item("Garlic Mayo Fries", 180.0, 25, shop_name);
            FastFoodCorner[10] = new Item("Cheese Fries", 160.0, 25, shop_name);
            FastFoodCorner[11] = new Item("Coke", 50.0, 45, shop_name);
            FastFoodCorner[12] = new Item("Sprite", 50.0, 45, shop_name);
            FastFoodCorner[13] = new Item("Fanta", 50.0, 45, shop_name);
            FastFoodCorner[14] = new Item("Mountain Dew", 50.0, 45, shop_name);
            FastFoodCorner[15] = new Item("Sting", 60.0, 35, shop_name);

            ChineseCuisine[0] = new Item("Chicken Manchurian", 700.0, 20, shop_name);
            ChineseCuisine[1] = new Item("Chicken Chowmein", 500.0, 25, shop_name);
            ChineseCuisine[2] = new Item("Vegetable Chowmein", 400.0, 25, shop_name);
            ChineseCuisine[3] = new Item("Cashew Chicken", 800.0, 18, shop_name);
            ChineseCuisine[4] = new Item("Egg Fried Rice", 350.0, 30, shop_name);
            ChineseCuisine[5] = new Item("Chicken Fried Rice", 450.0, 30, shop_name);
            ChineseCuisine[6] = new Item("Dynamite Prawns", 500.0, 25, shop_name);
            ChineseCuisine[7] = new Item("Chicken Corn Soup", 500.0, 25, shop_name);
            ChineseCuisine[8] = new Item("Hot and Sour Soup", 500.0, 25, shop_name);

        }
    }

    static class Clothing extends Shop {

        static Item MenClothing[] = new Item[10];
        static Item WomenClothing[] = new Item[10];

        Clothing(String shop_name, String shop_owner) {
            super(shop_name, shop_owner);

            MenClothing[0] = new Item("T shirts", "2460", 600.0, 25, shop_name);
            MenClothing[1] = new Item("Jeans", "2461", 800.0, 20, shop_name);
            MenClothing[2] = new Item("Jackets", "2462", 2500.0, 15, shop_name);
            MenClothing[3] = new Item("Dress Shirts", "2463", 900.0, 22, shop_name);
            MenClothing[4] = new Item("Dress Pants", "2464", 1100.0, 18, shop_name);
            MenClothing[5] = new Item("Coats", "2465", 1200.0, 15, shop_name);
            MenClothing[6] = new Item("Ties", "2466", 400.0, 30, shop_name);
            MenClothing[7] = new Item("Dress Shoes", "2467", 1500.0, 14, shop_name);
            MenClothing[8] = new Item("Sports Shoes", "2468", 2000.0, 16, shop_name);
            MenClothing[9] = new Item("Sandals", "2469", 900.0, 10, shop_name);

            WomenClothing[0] = new Item("Shirts", "2560", 600.0, 25, shop_name);
            WomenClothing[1] = new Item("Jeans", "2561", 800.0, 20, shop_name);
            WomenClothing[2] = new Item("Dress Shirts", "2562", 900.0, 22, shop_name);
            WomenClothing[3] = new Item("Dress Pants", "2563", 1100.0, 18, shop_name);
            WomenClothing[4] = new Item("Gowns", "2564", 1200.0, 15, shop_name);
            WomenClothing[5] = new Item("Shawls", "2565", 400.0, 30, shop_name);
            WomenClothing[6] = new Item("Scarves", "2566", 1500.0, 14, shop_name);
            WomenClothing[7] = new Item("Heels", "2567", 2000.0, 16, shop_name);
            WomenClothing[8] = new Item("Calf Boots", "2568", 900.0, 10, shop_name);
            WomenClothing[9] = new Item("Trainers", "2569", 900.0, 10, shop_name);
        }
    }

    static class Cinema extends Shop {

        static final String MOVIE_1 = "The Avengers";
        static final String MOVIE_2 = "Avengers: Age of Ultron";
        static final String MOVIE_3 = "Avengers: Infinity War";
        static final String MOVIE_4 = "Avengers: Endgame";

        static final String DAY_1 = "Monday";
        static final String DAY_2 = "Tuesday";
        static final String DAY_3 = "Wednesday";
        static final String DAY_4 = "Thursday";
        static final String DAY_5 = "Friday";

        static final String TIME_1 = "3:30pm";
        static final String TIME_2 = "8:30pm";

        static Movie show1;
        static Movie show2;
        static Movie show3;
        static Movie show4;
        static Movie show5;
        static Movie show6;
        static Movie show7;
        static Movie show8;
        static Movie show9;
        static Movie show10;

        Cinema(String shop_name, String shop_owner) {
            super(shop_name, shop_owner);

            show1 = new Movie(MOVIE_1, DAY_1, TIME_1);
            show2 = new Movie(MOVIE_2, DAY_1, TIME_2);
            show3 = new Movie(MOVIE_3, DAY_2, TIME_1);
            show4 = new Movie(MOVIE_4, DAY_2, TIME_2);
            show5 = new Movie(MOVIE_1, DAY_3, TIME_1);
            show6 = new Movie(MOVIE_2, DAY_3, TIME_2);
            show7 = new Movie(MOVIE_3, DAY_4, TIME_1);
            show8 = new Movie(MOVIE_4, DAY_4, TIME_2);
            show9 = new Movie(MOVIE_3, DAY_5, TIME_1);
            show10 = new Movie(MOVIE_4, DAY_5, TIME_2);


        }
    }


    static class Movie{

        String movie_name;
        String movie_day;
        String movie_time;

        Movie(String movie_name, String movie_day, String movie_time) {
            this.movie_name = movie_name;
            this.movie_day = movie_day;
            this.movie_time = movie_time;
        }

        public String getMovie_name(){
            return this.movie_name;
        }
    }

    static class PlayArea extends Shop {

        static Game game1;
        static Game game2;
        static Game game3;
        static Game game4;

        PlayArea(String shop_name, String shop_owner) {
            super(shop_name, shop_owner);

            game1 = new Game("Air Hockey", "200");
            game2 = new Game("Punching Bag", "150");
            game3 = new Game("Roller Coaster Ride", "300");
            game4 = new Game("Snooker", "250");
        }
    }

    static class Game {

        String game_name;
        String game_price;

        Game(String game_name, String game_price) {
            this.game_name = game_name;
            this.game_price = game_price;
        }
    }
}

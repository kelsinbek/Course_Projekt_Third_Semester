package KelsinbekZarlykov.Entity;


public enum FilePath {
    PASSWORDS("Course_Project_Inai/src/com/KelsinbekZarlykov/passwords.txt"),
    DISHES("Course_Project_Inai/src/dishes.txt"),
    DRINKS("Course_Project_Inai/src/drinks.txt"),
    FEEDBACK("Course_Project_Inai/src/feedback.txt"),
    COUNTER_MENUDISHES("src/counter_id_menuDishes.txt"),
    COUNTER_MENUDRINKS("src/counter_id_menuDrinks.txt"),
    ORDER_DISHES("Course_Project_Inai/src/OrderDishes.txt"),
    FREE_TABLE("Course_Project_Inai/src/freeTables.txt"),
    TABLES("Course_Project_Inai/src/tables.txt"),
    COUNTER_ORDER_DISHES("Course_Project_Inai/src/counter_id_OrderDishes.txt"),;


    private final String path;

    public String getPath() {
        return path;
    }

    FilePath(String path) {
        this.path = path;
    }
}

package front_controller.model;

public class Board {
    private int id;
    private String title;
    private int userId;

    public Board(int id, String title, int userId) {
        this.id = id;
        this.title = title;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getUserId() {
        return userId;
    }
}

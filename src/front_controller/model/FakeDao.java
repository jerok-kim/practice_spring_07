package front_controller.model;

// Fake DataAccessObject (데이터베이스에 접근하는 클래스)
public class FakeDao {

    public User userData() {
        User u1 = new User(1, "jerok", "1234");
        return u1;
    }

    public Board boardData() {
        Board b1 = new Board(1, "제목1", 1);
        return b1;
    }

}

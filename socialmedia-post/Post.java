import java.util.ArrayList;
import java.util.Random;

public class Post {
    private int postID;
    private String message;
    public int likes;
    protected ArrayList<String> comments = new ArrayList<>();

    Random rand = new Random();

    public Post(String message) {
        this.message = message;
        postID = rand.nextInt(9999);
    }

    public int getPostID() {
        return postID;
    }

    public String getMessage() {
        return message;
    }

    public int getLikes() {
        return likes;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void addLike() {
        likes++;
    }

    public void agregarComentario(String comment) {
        comments.add(comment);
    }

    public String displayPost() {
        return "ID: " + getPostID() +
                "\nMessage: " + getMessage() +
                "\nLikes: " + getLikes() +
                "\nComments: " + getComments();
    }

    public static void main(String[] args) {
        Post post1 = new Post("All odd numbers in English have the letter 'e'");

        for (int i = 1; i < 87; i++)
            post1.addLike();

        post1.agregarComentario("i don't believe it");
        post1.agregarComentario("lol");
        post1.agregarComentario("Is it true? O_o");
        post1.agregarComentario("that's a lie");
        post1.agregarComentario("It can't be :O");

        System.out.println(post1.displayPost());
    }

}

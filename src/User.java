public class User {
    private String name;
    private SocialMediaFeed feed;

    public User(String name, SocialMediaFeed feed) {
        this.name = name;
        this.feed = feed;
    }

    public void makePost(String message) {
        System.out.println(name + " posted: " + message);
        feed.postUpdate(name + ": " + message);
    }
}

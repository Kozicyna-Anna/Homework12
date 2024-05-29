public class Main {
    public static void main(String[] args) {

        Author kathy = new Author("Kathy", "Bert");
        Book headFirstJava = new Book("Head First Java", kathy,2022);

        System.out.println(headFirstJava.getTitle() + " " + headFirstJava.getPublisherYear());
    }
}
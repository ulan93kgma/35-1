import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> myFavoriteBooks = new LinkedList<>();
        myFavoriteBooks.add("Граф Монте-Кристо");
        myFavoriteBooks.add("Таинственный остров");
        myFavoriteBooks.add("Мартин Иден");
        myFavoriteBooks.add("Робинзон Крузо");
        myFavoriteBooks.add("Дети Капитана Гранта");
        myFavoriteBooks.forEach(System.out::println);
        System.out.println("--------------------------------------");
        myFavoriteBooks.remove(4);
        myFavoriteBooks.forEach(System.out::println);
        System.out.println("---------------------------------------");
        myFavoriteBooks.set(3, "Дети Капитана Гранта");
        System.out.println("  ");
        System.out.println(myFavoriteBooks.get(3));
        myFavoriteBooks.clear();
        System.out.println("----------------------------------------");
        myFavoriteBooks.add("Ведьмак");
        myFavoriteBooks.add("Крестный отец");
        myFavoriteBooks.add("Однажды в Америке");
        myFavoriteBooks.forEach(System.out::println);
        System.out.println("------------------------------------------");
        myFavoriteBooks.addFirst("Властелин колец");
        myFavoriteBooks.addFirst("Властелин колец");
        myFavoriteBooks.addLast("10 тысячь лье под водой");
        myFavoriteBooks.addLast("10 тысячь лье под водой");
        myFavoriteBooks.forEach(System.out::println);
        myFavoriteBooks.remove(0);
        System.out.println("-------------------------------------------");
        myFavoriteBooks.forEach(System.out::println);
        myFavoriteBooks.remove(5);
        System.out.println("-------------------------------------------");
        myFavoriteBooks.forEach(System.out::println);
    }
}

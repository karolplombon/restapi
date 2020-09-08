package pl.test;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        DatabaseClient databaseClient = new DatabaseClient();

        databaseClient.clearDatabase();

        System.out.println("Wywołujemy metodę getUsers()");
        System.out.println(databaseClient.getUsers());

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Tworzymy użytkowników test i test2");
        System.out.println("Wywołujemy metodę addUser() dla obu tych użytkowników");
        System.out.println("Wywołujemy metodę getUsers()");
        User user1 = new User("test", 30, "Test 1");
        User user2 = new User("test2", 20, "Test 2");
        databaseClient.addUser(user1);
        databaseClient.addUser(user2);
        System.out.println(databaseClient.getUsers());

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Wywołujemy metodę getUser(test)");
        System.out.println(databaseClient.getUser("test"));

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Wywołujemy metody deleteUser(test)");
        System.out.println("Wywołujemy metodę getUsers()");
        databaseClient.deleteUser("test");
        System.out.println(databaseClient.getUsers());


        System.out.println();
        System.out.println("-----------------");
        System.out.println("Wywołujemy metodę getPosts()");
        System.out.println(databaseClient.getPosts());

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Tworzymy dwa posty");
        System.out.println("Wywołujemy metodę addPost() dla obu tych postów");
        System.out.println("Wywołujemy metodę getPosts()");
        Post post1 = new Post("test", "Test n. 1");
        Post post2 = new Post("test2", "Test n. 2");
        databaseClient.addPost(post1);
        databaseClient.addPost(post2);
        System.out.println(databaseClient.getPosts());

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Wywołujemy metodę deletePost(1)");
        System.out.println("Wywołujemy metodę getPosts()");
        databaseClient.deletePost(1);
        System.out.println(databaseClient.getPosts());

    }
}

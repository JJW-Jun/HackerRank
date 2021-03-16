package demo.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Practice {
    public static void main(String args[]) {
        BlogPost blogPost1 = new BlogPost("About static method", "Alice", BlogPostType.GUIDE, 3);
        BlogPost blogPost2 = new BlogPost("Method", "Kim", BlogPostType.NEWS, 3);
        BlogPost blogPost3 = new BlogPost("Sea", "Jane", BlogPostType.REVIEW, 3);
        BlogPost blogPost4 = new BlogPost("Mom", "June", BlogPostType.GUIDE, 3);
        BlogPost blogPost5 = new BlogPost("Father", "Lion", BlogPostType.REVIEW, 3);
        BlogPost blogPost6 = new BlogPost("Love", "Ryan", BlogPostType.NEWS, 3);
        BlogPost blogPost7 = new BlogPost("For", "Junny", BlogPostType.REVIEW, 3);
        BlogPost blogPost8 = new BlogPost("Fight", "Java", BlogPostType.GUIDE, 3);
        List<BlogPost> posts = Arrays.asList(blogPost1, blogPost2, blogPost3, blogPost4, blogPost5,
                blogPost6, blogPost7, blogPost8);


        Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
                .collect(groupingBy(BlogPost::getType));
        System.out.println(postsPerType.get(BlogPostType.GUIDE));
        System.out.println(postsPerType.get(BlogPostType.NEWS));
        postsPerType.get(BlogPostType.GUIDE).stream().filter(BlogPost -> BlogPost.getAuthor().equals("Jun")).count();
        System.out.println(postsPerType.get(BlogPostType.GUIDE).stream().filter(BlogPost -> BlogPost.getAuthor().equals("Jun")).count());


        Map<Tuple, List<BlogPost>> postsPerTypeAndAuthor = posts.stream()
                .collect(groupingBy(post -> new Tuple(post.getType(), post.getAuthor())));

        postsPerTypeAndAuthor.get(BlogPostType.GUIDE);
        System.out.println(postsPerTypeAndAuthor.get(new Tuple(BlogPostType.GUIDE, "June")));


        Map<String, Map<BlogPostType, List<BlogPost>>> map = posts.stream()
                .collect(groupingBy(BlogPost::getAuthor, groupingBy(BlogPost::getType)));

        map.get("June");
        System.out.println("Test: " + map.get("June"));

    }
}

class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;

    public BlogPost(String title, String author, BlogPostType type, int likes) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type=" + type +
                ", likes=" + likes +
                '}';
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BlogPostType getType() {
        return type;
    }

    public void setType(BlogPostType type) {
        this.type = type;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}


enum BlogPostType {
    NEWS, REVIEW, GUIDE
}

class Tuple {
    BlogPostType type;
    String author;

    public BlogPostType getType() {
        return type;
    }

    public void setType(BlogPostType type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Tuple(BlogPostType type, String author) {
        this.type = type;
        this.author = author;
    }
}

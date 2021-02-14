package demo.book.datastructure.chapter6;


import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class WikiNodeExample {
    public static void main(String[] args) throws IOException {
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        // 다운로드, 문서 파싱
        Connection connection = Jsoup.connect(url);
        Document document = connection.get();

        // 내용 선택
        Element content = document.getElementById("mw-content-text");

        // p 태그문서 전체 파싱, 부분 파싱
        Elements texts = content.select("p");
        Element firstTag = texts.get(0);

        recursiveDFS(firstTag);
        iterativeDFS(firstTag);

        Iterable<Node> iter = new WikiNodeIterable(firstTag);
        for (Node node: iter) { if (node instanceof TextNode) { System.out.print(node); }} }

    private static void iterativeDFS(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node instanceof TextNode) { System.out.print(node); }

            List<Node> nodes = new ArrayList<>(node.childNodes());
            Collections.reverse(nodes);

            for (Node child: nodes) { stack.push(child); } }
    }

    private static void recursiveDFS(Node node) {
        if (node instanceof TextNode) { System.out.print(node); }
        for (Node child: node.childNodes()) { recursiveDFS(child); }
    }
}
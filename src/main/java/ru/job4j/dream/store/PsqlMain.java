package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

public class PsqlMain {

    public static void main(String[] args) {
        Store store = PsqlStore .instOf();
        store.savePost(new Post(0, "Java Job"));
        store.savePost(new Post(1, "Java Lesson"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        store.saveCandidate(new Candidate(0, "Will Smith"));
        store.saveCandidate(new Candidate(1, "Lara Larson"));
        for (Candidate candidate : store.findAllCandidates()) {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }
        System.out.println(store.findPostById(9));
    }
}

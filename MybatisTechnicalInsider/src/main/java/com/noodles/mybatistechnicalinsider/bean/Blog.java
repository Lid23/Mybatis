package com.noodles.mybatistechnicalinsider.bean;

import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.List;

/**
 * @program: MybatisTechnicalInsider
 * @description: Blog
 * @author: Eric
 * @create: 2019-04-04 10:43
 **/
public class Blog implements Serializable {
    public Blog(Integer id){
        this.id = id;
    }

    private Integer id;
    private String title;
    private Author author;
    private List<Post> posts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}

package com.noodles.mybatistechnicalinsider.bean;

import javax.naming.directory.SearchResult;
import java.io.Serializable;

/**
 * @program: MybatisTechnicalInsider
 * @description: Post
 * @author: Eric
 * @create: 2019-04-04 10:51
 **/
public class Post implements Serializable {

    protected  Integer id;
    protected String content;
    protected Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

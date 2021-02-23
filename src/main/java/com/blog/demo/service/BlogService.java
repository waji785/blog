package com.blog.demo.service;
import com.blog.demo.Exception.NotfoundException;
import com.blog.demo.bean.BlogQuery;
import com.blog.demo.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {

    Blog gethtmlBlog(Long id);
    Blog getBlog(Long id);
    Object listBlog(Pageable pageable, BlogQuery blog);
    Page<Blog> listBlog(Pageable pageable);
    Page<Blog> searchtag(Pageable pageable,String name);
    Page<Blog> searchBlog(Pageable pageable,String query);
    Blog saveBlog(Blog blog);
    Blog updateBlog(Long id,Blog blog) throws NotfoundException, NotfoundException;
    void deleteBlog(Long id);
}

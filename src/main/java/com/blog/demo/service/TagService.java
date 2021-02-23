package com.blog.demo.service;
import com.blog.demo.Exception.NotfoundException;
import com.blog.demo.entity.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    Tag updateTag(Long id,Tag tag) throws NotfoundException;

    void deleteTag(Long id);

    Tag getByName(String name);



}

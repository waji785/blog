package com.blog.demo.dao;

import com.blog.demo.entity.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRespository extends JpaRepository<Tag, Long> {
    Tag getByName(String name);

    Tag getOne(Long id);

    List<Tag> findAllById(List<Long> convertToList);

    Page<Tag> findAll(Pageable pageable);
}

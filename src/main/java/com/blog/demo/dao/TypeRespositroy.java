package com.blog.demo.dao;

import com.blog.demo.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TypeRespositroy extends JpaRepository<Type,Long> {

    Type findByName(String name);

}

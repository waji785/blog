package com.blog.demo.service;

import com.blog.demo.Exception.NotfoundException;
import com.blog.demo.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface TypeService {
    Type saveType(Type type);

    Type getType(Long id);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();


    Type updateType(Long id,Type type) throws NotfoundException;

    void deleteType(Long id);

    Type getByName(String name);

}

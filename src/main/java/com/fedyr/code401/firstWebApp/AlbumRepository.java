package com.fedyr.code401.firstWebApp;


import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
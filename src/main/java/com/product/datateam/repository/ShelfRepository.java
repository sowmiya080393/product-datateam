package com.product.datateam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.datateam.entity.Shelf;

@Repository
public interface ShelfRepository extends JpaRepository<Shelf, String > {

}

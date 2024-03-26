package com.product.datateam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.datateam.entity.ProductMetadata;

@Repository
public interface ProductMetadataRepository extends JpaRepository<ProductMetadata, String>{



}

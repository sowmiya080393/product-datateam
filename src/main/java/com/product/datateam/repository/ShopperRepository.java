package com.product.datateam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.product.datateam.entity.Shopper;

@Repository
public interface ShopperRepository extends JpaRepository<Shopper, String>, JpaSpecificationExecutor<Shopper> {


}

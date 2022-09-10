package com.kellyngton.dsmeta.Sale;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface SaleRepository extends JpaRepository<SaleModel,Long> {
    @Query("SELECT obj FROM SaleModel obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
    Page<SaleModel> findSales(LocalDate min, LocalDate max, Pageable pageable);

}

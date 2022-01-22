package com.company.name.shoes.sporty.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.name.shoes.sporty.model.PurchaseReport;

@Repository
public interface PurchaseReportRepository extends JpaRepository<PurchaseReport, Integer>{
	public List<PurchaseReport> findByDop(Date dop);
	public List<PurchaseReport> findByCategory(String category);

}

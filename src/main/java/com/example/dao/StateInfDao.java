package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.StateInfDto;

@Repository
@Mapper
public interface StateInfDao extends JpaRepository<StateInfDto, Long> {
	List<StateInfDto> selectMaxRateByYear();
}

package com.alkemy.disney.disney.repository;

import com.alkemy.disney.disney.Entity.TipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRepository extends JpaRepository<TipoEntity,Long> {



}

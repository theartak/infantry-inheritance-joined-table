package com.jambit.artinheritancejoinedtable.repository;

import com.jambit.artinheritancejoinedtable.model.Infantry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InfantryRepository extends CrudRepository<Infantry, Long> {
}

package com.backspace.tech.repositories;

import com.backspace.tech.entities.StatementRaw;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class StatementRepository implements PanacheRepository<StatementRaw> {

  @Transactional
  public void saveAll(List<StatementRaw> billedData) {
    persist(billedData);
  }
}

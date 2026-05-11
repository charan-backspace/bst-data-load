package com.backspace.tech.repositories;

import com.backspace.tech.entities.Iso8583;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class Iso8583Repository implements PanacheRepository<Iso8583> {

  @Transactional
  public void saveAll(List<Iso8583> isoData) {
    persist(isoData);
  }
}

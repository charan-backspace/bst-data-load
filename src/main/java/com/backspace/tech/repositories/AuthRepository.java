package com.backspace.tech.repositories;

import com.backspace.tech.entities.AuthRaw;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class AuthRepository implements PanacheRepository<AuthRaw> {


  @Transactional
  public void saveAll(List<AuthRaw> authData) {
    persist(authData);
  }
}

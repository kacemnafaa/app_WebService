package com.example.magazin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
@RepositoryRestController
public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {

}

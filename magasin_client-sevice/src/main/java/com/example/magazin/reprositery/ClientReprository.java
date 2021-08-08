package com.example.magazin.reprositery;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
@RepositoryRestController
public interface ClientReprository extends JpaRepository<Client,Long>{

}

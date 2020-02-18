package ibbl.lu.microservice_lims.dao;

import ibbl.lu.microservice_lims.entities.ConrepBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConrepBoxRepository extends JpaRepository<ConrepBox, String> {

    public ConrepBox findByBarcode(String barcode);
}

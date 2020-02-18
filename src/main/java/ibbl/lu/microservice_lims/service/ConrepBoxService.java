package ibbl.lu.microservice_lims.service;

import ibbl.lu.microservice_lims.entities.ConrepBox;

import java.util.List;

public interface ConrepBoxService {
    public List<ConrepBox> getAllBoxes();
    public ConrepBox getBoxByBoxbarcode(String barcode);
}

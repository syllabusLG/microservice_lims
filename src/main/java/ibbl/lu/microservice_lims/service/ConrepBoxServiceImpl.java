package ibbl.lu.microservice_lims.service;

import ibbl.lu.microservice_lims.dao.ConrepBoxRepository;
import ibbl.lu.microservice_lims.entities.ConrepBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ConrepBoxServiceImpl implements ConrepBoxService {

    @Autowired
    private ConrepBoxRepository conrepBoxRepository;

    @Override
    public List<ConrepBox> getAllBoxes() {
        return this.conrepBoxRepository.findAll();
    }

    @Override
    public ConrepBox getBoxByBoxbarcode(String barcode) {
        return this.conrepBoxRepository.findByBarcode(barcode);
    }
}

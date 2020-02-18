package ibbl.lu.microservice_lims.web;

import ibbl.lu.microservice_lims.entities.ConrepBox;
import ibbl.lu.microservice_lims.service.ConrepBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ibbl/api")
public class ConrepBoxController {
    @Autowired
    private ConrepBoxService conrepBoxService;

    @RequestMapping(value = "/boxes", method = RequestMethod.GET)
    public List<ConrepBox> getAllConrepBoxes(){
        return this.conrepBoxService.getAllBoxes();
    }

    @RequestMapping(value = "/barcode/{barcode}")
    public ConrepBox getConrepBoxByBarcode(@PathVariable  String barcode){
        return this.conrepBoxService.getBoxByBoxbarcode(barcode);
    }
}

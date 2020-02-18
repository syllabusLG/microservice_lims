package ibbl.lu.microservice_lims.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "conrep_box")
@Data @NoArgsConstructor @AllArgsConstructor
public class ConrepBox {

    @Id
    @Column(name = "ID", length = 50, nullable = false)
    private String id;
    @Column(name = "CES_ID", length = 50)
    private String ces_id;
    @Column(name = "EXPECTED_DELIVERY_DATE")
    private Date expected_delivery_date;
    @Column(name = "BOX_BARCODE", length = 50)
    private String barcode;
    @Column(name = "SCAN_DATETIME")
    private Date scan_datetime;
    @Column(name = "SCAN_BY", length = 20)
    private String scan_by;
    @Column(name = "STATUS", length = 10)
    private String status;
    @Column(name = "OPENED_BY", length = 20)
    private String opened_by;
    @Column(name = "TEMP_STATUS", length = 20)
    private String temp_status;
    @Column(name = "NB_FORMS")
    private int nb_forms;
    @Column(name = "IMPORT_PROCESS_ID")
    private int import_process_id;
    @Column(name = "BOX_ID", length = 20)
    private String box_id;


}

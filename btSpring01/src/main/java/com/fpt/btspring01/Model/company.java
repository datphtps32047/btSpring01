package com.fpt.btspring01.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", unique = true, nullable = false, length = 10)
    private Long CompanyId;
    @Column(name = "company_name", unique = true, nullable = false, length = 100)
    private String companyName;
    @Column(name = "company_name_kana", unique = true, nullable = false, length = 100)
    private String companyNameKana;
    @Column(name = "zipcode", nullable = false, length = 5)
    private int zipcode;
    @Column(name = "address", nullable = false, length = 100)
    private String address;
    @Column(name = "telephone", nullable = false, length = 15)
    private String telephone;
    @Column(name = "fax_number", length = 100)
    private String faxNumber;
    @Column(name = "url", length = 100)
    private String url;
    @Column(name = "ipaddress", length = 50)
    private String ipaddress;
    @Column(name = "ipaddress_internal", length = 100)
    private String ipaddressInternal;
    @Column(name = "port")
    private int port;
    @Column(name = "port_internal", length = 100)
    private String portInternal;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "update_date")
    private Date updateDate;
}

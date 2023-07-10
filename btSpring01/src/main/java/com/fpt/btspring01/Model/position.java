package com.fpt.btspring01.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id", unique = true, length = 10, nullable = false)
    private Long positionId;
    @Column(name = "sort")
    private int sort;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "create_date")
    private Date createDate;

}

package com.pooltpv.api.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Compagnie {
     @Id
    @Column(name = "codecie")
    private Integer  codeCie;
    @Column(name = "libellecie")
    private String libelleCie;
    @Column(name = "codeattest")
    private String codeAttest;
    @Column(name = "isactivated")
    private boolean  isActivated;
    
}

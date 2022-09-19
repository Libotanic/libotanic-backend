package com.example.demo.plant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Plants")
public class Plant {
    @Id
    private Long id;
    private String lat_name;
    private String rus_name;
    private String src;

    @NotEmpty
    @Size(min = 1, max = 2000)
    private String descr;
    private String pict;
    private String divisio;
    private String classis;
    private String ordo;
    private String familia;
    private String otdel;
    private String plant_class;
    private String otrad;
    private String semeistvo;
    private String mainPic;

    public Plant() {
    }

    public Plant(Long id, String lat_name, String rus_name, String src, String descr, String pict, String divisio, String classis, String ordo, String familia, String otdel, String plant_class, String otrad, String semeistvo, String mainPic) {
        this.id = id;
        this.lat_name = lat_name;
        this.rus_name = rus_name;
        this.src = src;
        this.descr = descr;
        this.pict = pict;
        this.divisio = divisio;
        this.classis = classis;
        this.ordo = ordo;
        this.familia = familia;
        this.otdel = otdel;
        this.plant_class = plant_class;
        this.otrad = otrad;
        this.semeistvo = semeistvo;
        this.mainPic = mainPic;
    }

    public Long getId() {
        return id;
    }

    public String getLat_name() {
        return lat_name;
    }

    public String getRus_name() {
        return rus_name;
    }

    public String getSrc() {
        return src;
    }

    public String getDescr() {
        return descr;
    }

    public String getPict() {
        return pict;
    }

    public String getDivisio() {
        return divisio;
    }

    public String getClassis() {
        return classis;
    }

    public String getOrdo() {
        return ordo;
    }

    public String getFamilia() {
        return familia;
    }

    public String getOtdel() {
        return otdel;
    }

    public String getPlantClass() {
        return plant_class;
    }

    public String getOtrad() {
        return otrad;
    }

    public String getSemeistvo() {
        return semeistvo;
    }

    public String getMainPic() {
        return mainPic;
    }

    @Override
    public String toString() {
        return String.join(", ", getId().toString(), getLat_name(), getRus_name());
    }
}

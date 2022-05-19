package cat.itacademy.barcelonactiva.hackaton.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("terrazas")
public class Terraza {

    @Id
    private String id;

    private Integer codBarrio;
    private String nomBarrio;
    private String direccion;
    private Float area;
    private Integer mesas;
    private Integer sillas;
    private Float lat;
    private Float lon;
    private Integer likes;

    public Terraza(Integer codBarrio, String nomBarrio, String direccion, Float area, Integer mesas, Integer sillas, Float lat, Float lon, Integer likes) {
        this.codBarrio = codBarrio;
        this.nomBarrio = nomBarrio;
        this.direccion = direccion;
        this.area = area;
        this.mesas = mesas;
        this.sillas = sillas;
        this.lat = lat;
        this.lon = lon;
        this.likes = likes;
    }

    public Terraza() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCodBarrio() {
        return codBarrio;
    }

    public void setCodBarrio(Integer codBarrio) {
        this.codBarrio = codBarrio;
    }

    public String getNomBarrio() {
        return nomBarrio;
    }

    public void setNomBarrio(String nomBarrio) {
        this.nomBarrio = nomBarrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Integer getMesas() {
        return mesas;
    }

    public void setMesas(Integer mesas) {
        this.mesas = mesas;
    }

    public Integer getSillas() {
        return sillas;
    }

    public void setSillas(Integer sillas) {
        this.sillas = sillas;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Integer getLikes() {
        if (likes == null){
            return 0;
        }
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Terraza{" +
                "id='" + id + '\'' +
                ", codBarrio=" + codBarrio +
                ", nomBarrio='" + nomBarrio + '\'' +
                ", direccion='" + direccion + '\'' +
                ", area=" + area +
                ", mesas=" + mesas +
                ", sillas=" + sillas +
                ", lat=" + lat +
                ", lon=" + lon +
                ", likes=" + likes +
                '}';
    }
}

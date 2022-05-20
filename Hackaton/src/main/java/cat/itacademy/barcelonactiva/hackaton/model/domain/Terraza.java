package cat.itacademy.barcelonactiva.hackaton.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("terrazas")
public class Terraza {

    @Id
    private String id;

    private Integer num_id;
    private String nomLocal;
    private String nomVia;
    private Integer numVia;
    private String direccion;
    private Integer codBarrio;
    private String nomBarrio;
    private Float area;
    private Integer mesas;
    private Integer sillas;
    private Float lat;
    private Float lon;
    private Integer likes;

    public Terraza(Integer num_id, String nomLocal, String nomVia, Integer numVia,
                   String direccion, Integer codBarrio, String nomBarrio, Float area,
                   Integer mesas, Integer sillas, Float lat, Float lon, Integer likes) {
        this.num_id = num_id;
        this.nomLocal = nomLocal;
        this.nomVia = nomVia;
        this.numVia = numVia;
        this.direccion = direccion;
        this.codBarrio = codBarrio;
        this.nomBarrio = nomBarrio;
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

    public Integer getNum_id() {
        return num_id;
    }

    public void setNum_id(Integer num_id) {
        this.num_id = num_id;
    }

    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

    public String getNomVia() {
        return nomVia;
    }

    public void setNomVia(String nomVia) {
        this.nomVia = nomVia;
    }

    public Integer getNumVia() {
        return numVia;
    }

    public void setNumVia(Integer numVia) {
        this.numVia = numVia;
    }

    @Override
    public String toString() {
        return "Terraza{" +
                "id='" + id + '\'' +
                ", num_id=" + num_id +
                ", nomLocal='" + nomLocal + '\'' +
                ", nomVia='" + nomVia + '\'' +
                ", numVia=" + numVia +
                ", direccion='" + direccion + '\'' +
                ", codBarrio=" + codBarrio +
                ", nomBarrio='" + nomBarrio + '\'' +
                ", area=" + area +
                ", mesas=" + mesas +
                ", sillas=" + sillas +
                ", lat=" + lat +
                ", lon=" + lon +
                ", likes=" + likes +
                '}';
    }
}

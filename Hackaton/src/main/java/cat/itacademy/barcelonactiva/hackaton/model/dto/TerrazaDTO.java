package cat.itacademy.barcelonactiva.hackaton.model.dto;

public class TerrazaDTO {

    private Integer num_id;
    private String direccion;
    private String nomBarrio;
    private Float lat;
    private Float lon;

    public TerrazaDTO() {
    }

    public TerrazaDTO(Integer num_id, String direccion, String nomBarrio, Float lat, Float lon) {
        this.num_id = num_id;
        this.direccion = direccion;
        this.nomBarrio = nomBarrio;
        this.lat = lat;
        this.lon = lon;
    }

    public Integer getNum_id() {
        return num_id;
    }

    public void setNum_id(Integer num_id) {
        this.num_id = num_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNomBarrio() {
        return nomBarrio;
    }

    public void setNomBarrio(String nomBarrio) {
        this.nomBarrio = nomBarrio;
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
}

import javax.persistence.*;

@Entity
@Table
public class Paises {
    @Id
    @SequenceGenerator(name = "pais", sequenceName = "paises_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paises_sequenc")
    private Integer id;
    private String nome_pais;
    private String capital;
    private String regiao;
    private String sub_region;
    private String area;

    public Paises(String nome_pais, String capital, String regiao, String sub_region, String area) {
        this.nome_pais = nome_pais;
        this.capital = capital;
        this.regiao = regiao;
        this.sub_region = sub_region;
        this.area = area;
    }

    public Paises() {
    }

    public Paises(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_pais() {
        return nome_pais;
    }

    public void setNome_pais(String nome_pais) {
        this.nome_pais = nome_pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSub_region() {
        return sub_region;
    }

    public void setSub_region(String sub_region) {
        this.sub_region = sub_region;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Paises{" +
                "id_pais=" + id +
                ", nome_pais='" + nome_pais + '\'' +
                ", capital_pais='" + capital + '\'' +
                ", regiao_pais='" + regiao + '\'' +
                ", sub_regiao_pais='" + sub_region + '\'' +
                ", area_pais='" + area + '\'' +
                '}';
    }
}

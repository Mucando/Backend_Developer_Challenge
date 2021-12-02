import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PaisesConfig {
    @Bean
    CommandLineRunner coman(PaisesRepository repository) {
        return args -> {
          /*  Optional<Paises> optionalPaises=repository.findPaisesByNome_pais(pais.getNome_pais());
            if (optionalPaises.isPresent()){
                throw new IllegalStateException("Este registado/s ja existe/m");
            }else {

            }*/
            com.example.demo_spring.paises.Paises moz=new com.example.demo_spring.paises.Paises( "Mozambique", "Maputo","África Austral","","801 590 km²");
            com.example.demo_spring.paises.Paises south_africa=new com.example.demo_spring.paises.Paises( "África do Sul", "Pretória","África Austral","","1 221 037 km²");
            com.example.demo_spring.paises.Paises angola=new com.example.demo_spring.paises.Paises( "Angola", "Luanda","África Austral","","1 246 700 km² ");
            com.example.demo_spring.paises.Paises argelia=new com.example.demo_spring.paises.Paises( "Argélia", "Argel","África do Norte","","2 381 741 km²");
            com.example.demo_spring.paises.Paises benim=new com.example.demo_spring.paises.Paises( "Benim", "Porto Novo","África Ocidental","","112 622 km² ");
            com.example.demo_spring.paises.Paises botsuana=new com.example.demo_spring.paises.Paises( "Botsuana", "Gaborone","África Austral","","581 730 km² ");

            repository.saveAll(
                    List.of(
                            moz,angola,south_africa, benim, botsuana,argelia)
            );
        };
    }
}
/*     Paises burquina_fasso=new Paises( "Burquina Fasso", "","","","");
            Paises burundi=new Paises( "Burundi", "","África Oriental","","");
            Paises cabo_verde=new Paises( "Cabo verde", "","","","");
            Paises camaroes=new Paises( "Camarões", "","","","");
            Paises chade=new Paises( "Chade", "","","","");
            Paises comores=new Paises( "Comores", "","África Oriental","","");
            Paises costa_do_marfim=new Paises( "Costa do Marfim", "","","","");
            Paises egipto=new Paises( "Egipto", "","","","");
            Paises eritreia=new Paises( "Eritreia", "","","","");
            Paises essuatini=new Paises( "Essuatíni", "","","","");
            Paises etiopia=new Paises( "Etiópia", "","","","");
            Paises gabao=new Paises( "Gabão", "","","","");
            Paises gambia=new Paises( "Gâmbia", "","","","");
            Paises guinebissau=new Paises( "Guiné-Bissau", "","","","");
            Paises lesoto=new Paises( "Lesoto", "","","","");
            Paises jibuti=new Paises( "Jibuti", "","","","");
            Paises liberia=new Paises( "Libéria", "","","","");
            Paises libia=new Paises( "Líbia", "","África do Norte","","");
            Paises madagascar=new Paises( "Madagáscar", "","África Oriental","","");*/
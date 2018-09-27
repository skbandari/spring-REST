package config;

import dao.TeamDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * This class provides the config for the app IoC container
 * The app IoC container maintains the app beans e.g.: DataSource, SessionFactory, DAO, Service
 */
@Configuration
public class AppContextConfig {

    @Bean
    public TeamDao teamDao() {
        return new TeamDao();
    }
}

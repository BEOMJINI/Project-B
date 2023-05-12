package org.board;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Bean
        //Spring 컨테이너에서 관리할 Spring Bean
    Hibernate5Module hibernate5Module(){
        Hibernate5Module hiber = new Hibernate5Module();
        hiber.configure(Hibernate5Module.Feature.FORCE_LAZY_LOADING ,true);
        //지연로딩 : 필요한 거만 가져옴 <-> EAGER : 그냥 무조건 다 가져옴
        return  hiber;
        //JSON으로 직렬화할 때 연S결의 지연 로드를 강제
    }
}
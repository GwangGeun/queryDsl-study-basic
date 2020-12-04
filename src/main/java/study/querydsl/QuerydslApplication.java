package study.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class QuerydslApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuerydslApplication.class, args);
	}

	/**
	 * 다음 처럼 Bean 으로 JpaQueryFactory 를 등록해 놓고 써도 된다.
	 *
	 * @Bean
	 * JpaQueryFactory jpaQueryFactory(EntityManager em){
	 *     return new JPAQueryFactory(em);
	 * }
	 */

}
